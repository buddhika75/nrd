package lk.gov.health.dailymail.controllers;

import lk.gov.health.dailymail.entity.Questionnaire;
import lk.gov.health.dailymail.controllers.util.JsfUtil;
import lk.gov.health.dailymail.controllers.util.JsfUtil.PersistAction;
import lk.gov.health.dailymail.facades.MailFacade;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.inject.Named;
import lk.gov.health.dailymail.enums.Place;
import lk.gov.health.dailymail.enums.Response;
import lk.gov.health.dailymail.enums.ResponseCategory;
import lk.gov.health.dailymail.enums.ResponseData;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;

@Named
@SessionScoped
public class MailController implements Serializable {

    @EJB
    private lk.gov.health.dailymail.facades.MailFacade ejbFacade;
    private List<Questionnaire> items = null;
    private List<Questionnaire> selectedItems = null;
    private Questionnaire selected;
    List<ResponseData> responseData;
    private BarChartModel barModel;

    @Inject
    WebUserController webUserController;
    @Inject
    CommonController commonController;

    private PieChartModel pieModel;
    ResponseCategory responseCategory;
    Date fromDate;
    Date toDate;

    public CommonController getCommonController() {
        return commonController;
    }

    public List<Questionnaire> getSelectedItems() {
        return selectedItems;
    }

    public void setSelectedItems(List<Questionnaire> selectedItems) {
        this.selectedItems = selectedItems;
    }

    public Date getFromDate() {
        if (fromDate == null) {
            fromDate = getCommonController().firstDayOfYear(new Date());
        }
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        if (toDate == null) {
            toDate = getCommonController().lastDayOfYear(new Date());
        }
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public void fillItemsByPeriod() {
        String j;
        Map m = new HashMap();
        j = "select q "
                + " from Questionnaire q "
                + " where q.questionnaireDate between :fd and :td "
                + " order by q.id";
        m.put("fd", fromDate);
        m.put("td", toDate);
        selectedItems = getFacade().findBySQL(j, m);
    }

    public void drawSelectedCategoryResponse() {
        List<Questionnaire> qs;

        String j;
        Map m = new HashMap();
        j = "select q "
                + " from Questionnaire q "
                + " where q.questionnaireDate between :fd and :td "
                + " order by q.id";
        m.put("fd", fromDate);
        m.put("td", toDate);
        qs = getFacade().findBySQL(j, m);

        pieModel = getPiechartModelForResponseCategories(qs, responseCategory);
        responseData = getResponseCategoriesData(qs, responseCategory);

    }

    public void drawAllCategoryResponses() {
        List<Questionnaire> qs;

        String j;
        Map m = new HashMap();
        j = "select q "
                + " from Questionnaire q "
                + " where q.questionnaireDate between :fd and :td "
                + " order by q.id";
        m.put("fd", fromDate);
        m.put("td", toDate);
        qs = getFacade().findBySQL(j, m);

        List<ResponseData> incs = new ArrayList<ResponseData>();

        ResponseData increments = convertSingleToMultipleData(getResponseCategoriesData(qs, ResponseCategory.increments), ResponseCategory.increments);
        incs.add(increments);

        ResponseData environment = convertSingleToMultipleData(getResponseCategoriesData(qs, ResponseCategory.environment), ResponseCategory.environment);
        incs.add(environment);

        ResponseData clineliness = convertSingleToMultipleData(getResponseCategoriesData(qs, ResponseCategory.clineliness), ResponseCategory.clineliness);
        incs.add(clineliness);

        ResponseData arrangement = convertSingleToMultipleData(getResponseCategoriesData(qs, ResponseCategory.arrangement), ResponseCategory.arrangement);
        incs.add(arrangement);

        ResponseData groupWork = convertSingleToMultipleData(getResponseCategoriesData(qs, ResponseCategory.groupWork), ResponseCategory.groupWork);
        incs.add(groupWork);

        ResponseData leadership = convertSingleToMultipleData(getResponseCategoriesData(qs, ResponseCategory.leadership), ResponseCategory.leadership);
        incs.add(leadership);

        ResponseData training = convertSingleToMultipleData(getResponseCategoriesData(qs, ResponseCategory.training), ResponseCategory.training);
        incs.add(training);

        ResponseData evaluation = convertSingleToMultipleData(getResponseCategoriesData(qs, ResponseCategory.evaluation), ResponseCategory.evaluation);
        incs.add(evaluation);

        ResponseData wellfare = convertSingleToMultipleData(getResponseCategoriesData(qs, ResponseCategory.wellfare), ResponseCategory.wellfare);
        incs.add(wellfare);

        ResponseData decpline = convertSingleToMultipleData(getResponseCategoriesData(qs, ResponseCategory.decpline), ResponseCategory.decpline);
        incs.add(decpline);

        ResponseData communication = convertSingleToMultipleData(getResponseCategoriesData(qs, ResponseCategory.communication), ResponseCategory.communication);
        incs.add(communication);

        ResponseData discussions = convertSingleToMultipleData(getResponseCategoriesData(qs, ResponseCategory.discussions), ResponseCategory.discussions);
        incs.add(discussions);

        ResponseData requirement_Identification = convertSingleToMultipleData(getResponseCategoriesData(qs, ResponseCategory.requirement_Identification), ResponseCategory.requirement_Identification);
        incs.add(requirement_Identification);

        ResponseData quality_service = convertSingleToMultipleData(getResponseCategoriesData(qs, ResponseCategory.quality_service), ResponseCategory.quality_service);
        incs.add(quality_service);

        ResponseData expectation_achievement = convertSingleToMultipleData(getResponseCategoriesData(qs, ResponseCategory.expectation_achievement), ResponseCategory.expectation_achievement);
        incs.add(expectation_achievement);

        responseData = incs;

        barModel = getBarchartModelFromResponseDataList(incs);
    }

    private BarChartModel getBarchartModelFromResponseDataList(List<ResponseData> rds) {
        BarChartModel bcm = new BarChartModel();
        ChartSeries ex = new ChartSeries();
        ex.setLabel("Excellent");
        ChartSeries go = new ChartSeries();
        go.setLabel("Good");
        ChartSeries av = new ChartSeries();
        av.setLabel("Average");
        ChartSeries po = new ChartSeries();
        po.setLabel("Poor");
        ChartSeries wo = new ChartSeries();
        wo.setLabel("Worst");
        ChartSeries nr = new ChartSeries();
        nr.setLabel("No Response");
        for (ResponseData rd : rds) {
            ex.set(rd.getCategory(), rd.getExcellentNumber());
            go.set(rd.getCategory(), rd.getGoodNumber());
            av.set(rd.getCategory(), rd.getAverageNumber());
            po.set(rd.getCategory(), rd.getPoorNumber());
            wo.set(rd.getCategory(), rd.getWorstNumber());
            nr.set(rd.getCategory(), rd.getNoResponseNumber());
        }

        bcm.addSeries(ex);
        bcm.addSeries(go);
        bcm.addSeries(av);
        bcm.addSeries(po);
        bcm.addSeries(wo);
        bcm.addSeries(nr);
        bcm.setLegendPosition("ne");
        return bcm;
    }

    private ResponseData convertSingleToMultipleData(List<ResponseData> rds, ResponseCategory rc) {
        ResponseData rd = new ResponseData();
        rd.setCategory(rc);
        for (ResponseData t : rds) {
            rd.setResponse(t.getResponse());
            
            if (t.getResponse() != null) {
                switch (t.getResponse()) {
                    case Excellent:
                        rd.setExcellentNumber(t.getNumber());
                        break;
                    case Good:
                        rd.setGoodNumber(t.getNumber());
                        break;
                    case Average:
                        rd.setAverageNumber(t.getNumber());
                        break;
                    case Poor:
                        rd.setPoorNumber(t.getNumber());
                        break;
                    case Worst:
                        rd.setWorstNumber(t.getNumber());
                        break;
                }
            } else {
                rd.setResponse(null);
                rd.setNoResponseNumber(t.getNumber());
            }
        }
        return rd;
    }

    public PieChartModel getPiechartModelForResponseCategories(List<Questionnaire> qs, ResponseCategory rc) {
        int excellent = 0;
        int good = 0;
        int average = 0;
        int poor = 0;
        int worst = 0;
        int noResponse = 0;

        int one = 0;
        int two = 0;
        int three = 0;
        int other = 0;
        int noPlace = 0;

        for (Questionnaire q : qs) {
            Response r = null;
            Place p = null;
            switch (rc) {
                case arrangement:
                    r = q.getArrangement();
                    break;
                case clineliness:
                    r = q.getClineliness();
                    break;
                case communication:
                    r = q.getCommunication();
                    break;
                case decpline:
                    r = q.getDecpline();
                    break;
                case discussions:
                    r = q.getDiscussions();
                    break;
                case environment:
                    r = q.getEnvironment();
                    break;
                case evaluation:
                    r = q.getEvaluation();
                    break;
                case expectation_achievement:
                    r = q.getExpectation_achievement();
                    break;
                case groupWork:
                    r = q.getGroupWork();
                    break;
                case increments:
                    r = q.getIncrements();
                    break;
                case leadership:
                    r = q.getLeadership();
                    break;
                case place:
                    p = q.getPlace();
                    break;
                case quality_service:
                    r = q.getQuality_service();
                    break;
                case requirement_Identification:
                    r = q.getRequirement_Identification();
                    break;
                case training:
                    r = q.getTraining();
                    break;
                case wellfare:
                    r = q.getWellfare();
                    break;
            }
            if (r != null) {
                switch (r) {
                    case Excellent:
                        excellent++;
                        break;
                    case Good:
                        good++;
                        break;
                    case Average:
                        average++;
                        break;
                    case Poor:
                        poor++;
                        break;
                    case Worst:
                        worst++;
                        break;
                }
            } else {
                noResponse++;
            }
            if (p != null) {
                switch (p) {
                    case First_Place:
                        one++;
                        break;
                    case Second_Place:
                        two++;
                        break;
                    case Third_Place:
                        three++;
                        break;
                    case Other:
                        other++;
                        break;
                }
            } else {
                noPlace++;
            }
        }
        Map<String, Number> hm = new HashMap<String, Number>();
        if (rc == ResponseCategory.place) {
            hm.put("First", one);
            hm.put("Second", two);
            hm.put("Thired", three);
            hm.put("Other", other);
            hm.put("No Response", noPlace);
        } else {
            hm.put("Excellent", excellent);
            hm.put("Good", good);
            hm.put("Average", average);
            hm.put("Poor", poor);
            hm.put("Worst", worst);
            hm.put("No Response", noResponse);
        }
        PieChartModel pm = new PieChartModel();
        pm.setData(hm);
        pm.setTitle("Responses for " + rc);
        pm.setShowDataLabels(true);
        pm.setLegendPosition("w");
        return pm;
    }

    public List<ResponseData> getResponseCategoriesData(List<Questionnaire> qs, ResponseCategory rc) {
        int excellent = 0;
        int good = 0;
        int average = 0;
        int poor = 0;
        int worst = 0;
        int noResponse = 0;

        int tot = 0;

        int one = 0;
        int two = 0;
        int three = 0;
        int other = 0;
        int noPlace = 0;

        for (Questionnaire q : qs) {
            Response r = null;
            Place p = null;
            switch (rc) {
                case arrangement:
                    r = q.getArrangement();
                    break;
                case clineliness:
                    r = q.getClineliness();
                    break;
                case communication:
                    r = q.getCommunication();
                    break;
                case decpline:
                    r = q.getDecpline();
                    break;
                case discussions:
                    r = q.getDiscussions();
                    break;
                case environment:
                    r = q.getEnvironment();
                    break;
                case evaluation:
                    r = q.getEvaluation();
                    break;
                case expectation_achievement:
                    r = q.getExpectation_achievement();
                    break;
                case groupWork:
                    r = q.getGroupWork();
                    break;
                case increments:
                    r = q.getIncrements();
                    break;
                case leadership:
                    r = q.getLeadership();
                    break;
                case place:
                    p = q.getPlace();
                    break;
                case quality_service:
                    r = q.getQuality_service();
                    break;
                case requirement_Identification:
                    r = q.getRequirement_Identification();
                    break;
                case training:
                    r = q.getTraining();
                    break;
                case wellfare:
                    r = q.getWellfare();
                    break;
            }
            if (r != null) {
                switch (r) {
                    case Excellent:
                        excellent++;
                        break;
                    case Good:
                        good++;
                        break;
                    case Average:
                        average++;
                        break;
                    case Poor:
                        poor++;
                        break;
                    case Worst:
                        worst++;
                        break;
                }
            } else {
                noResponse++;
            }
            if (p != null) {
                switch (p) {
                    case First_Place:
                        one++;
                        break;
                    case Second_Place:
                        two++;
                        break;
                    case Third_Place:
                        three++;
                        break;
                    case Other:
                        other++;
                        break;
                }
            } else {
                noPlace++;
            }
        }

        Map<String, Number> hm = new HashMap<String, Number>();

        List<ResponseData> rds = new ArrayList<ResponseData>();

        if (rc == ResponseCategory.place) {
            System.out.println("place");
            tot = one + two + three + other + noPlace;
            System.out.println("tot = " + tot);
            hm.put("First", one);
            hm.put("Second", two);
            hm.put("Thired", three);
            hm.put("Other", other);
            hm.put("No Response", noPlace);

            if (tot == 0) {
                return rds;
            }

            ResponseData rd1 = new ResponseData();
            rd1.setPlace(Place.First_Place);
            rd1.setNumber(one);
            rd1.setPercentage(((double) one / (double) tot) * 100);

            ResponseData rd2 = new ResponseData();
            rd2.setPlace(Place.Second_Place);
            rd2.setNumber(two);
            rd2.setPercentage(((double) two / (double) tot) * 100);

            ResponseData rd3 = new ResponseData();
            rd3.setPlace(Place.Third_Place);
            rd3.setNumber(three);
            rd3.setPercentage(((double) three / (double) tot) * 100);

            ResponseData rd4 = new ResponseData();
            rd4.setPlace(Place.Other);
            rd4.setNumber(other);
            rd4.setPercentage(((double) other / (double) tot) * 100);

            ResponseData rd5 = new ResponseData();
            rd5.setPlace(null);
            rd5.setNumber(noPlace);
            rd5.setPercentage(((double) noPlace / (double) tot) * 100);

            rds.add(rd1);
            rds.add(rd2);
            rds.add(rd3);
            rds.add(rd4);
            rds.add(rd5);

        } else {
            tot = excellent + good + average + poor + worst + noResponse;
            hm.put("Excellent", excellent);
            hm.put("Good", good);
            hm.put("Average", average);
            hm.put("Poor", poor);
            hm.put("Worst", worst);
            hm.put("No Response", noResponse);

            if (tot == 0) {
                return rds;
            }

            ResponseData rd1 = new ResponseData();
            rd1.setResponse(Response.Excellent);
            rd1.setNumber(excellent);
            rd1.setPercentage(((double) excellent / (double) tot) * 100);

            ResponseData rd2 = new ResponseData();
            rd2.setResponse(Response.Good);
            rd2.setNumber(good);
            rd2.setPercentage(((double) good / (double) tot) * 100);

            ResponseData rd3 = new ResponseData();
            rd3.setResponse(Response.Average);
            rd3.setNumber(average);
            rd3.setPercentage(((double) average / (double) tot) * 100);

            ResponseData rd4 = new ResponseData();
            rd4.setResponse(Response.Poor);
            rd4.setNumber(poor);
            rd4.setPercentage(((double) poor / (double) tot) * 100);

            ResponseData rd5 = new ResponseData();
            rd5.setResponse(Response.Worst);
            rd5.setNumber(worst);
            rd5.setPercentage(((double) worst / (double) tot) * 100);

            ResponseData rd6 = new ResponseData();
            rd6.setResponse(null);
            rd6.setNumber(noResponse);
            rd6.setPercentage(((double) noResponse / (double) tot) * 100);

            rds.add(rd1);
            rds.add(rd2);
            rds.add(rd3);
            rds.add(rd4);
            rds.add(rd5);
            rds.add(rd6);
        }
        return rds;
    }

    public void fillSuggestionsByPeriod() {
        String j;
        Map m = new HashMap();
        j = "select q "
                + " from Questionnaire q "
                + " where q.questionnaireDate between :fd and :td "
                + " and q.suggestions <> ''  "
                + " order by q.id";
        m.put("fd", fromDate);
        m.put("td", toDate);
        selectedItems = getFacade().findBySQL(j, m);
    }

    public void fillExpectationsByPeriod() {
        String j;
        Map m = new HashMap();
        j = "select q "
                + " from Questionnaire q "
                + " where q.questionnaireDate between :fd and :td "
                + " and q.expectingFacilities <> '' "
                + " order by q.id";
        m.put("fd", fromDate);
        m.put("td", toDate);
        selectedItems = getFacade().findBySQL(j, m);
    }

    public WebUserController getWebUserController() {
        return webUserController;
    }

    public MailController() {
    }

    public String toAddNew() {
        selected = new Questionnaire();
        selected.setAddedDate(new Date());
        selected.setAddedTime(new Date());
        selected.setAddedUser(getWebUserController().getLoggedUser());
        selected.setCreatedDate(new Date());
        selected.setQuestionnaireDate(new Date());
        return "/mail/add";
    }

    public List<ResponseData> getResponseData() {
        return responseData;
    }

    public void setResponseData(List<ResponseData> responseData) {
        this.responseData = responseData;
    }

    public String saveAddNew() {
        if (selected == null) {
            JsfUtil.addErrorMessage("Nothing to save");
            return "";
        }
        getFacade().create(selected);
        items = null;
        return toAddNew();
    }

    public ResponseCategory getResponseCategory() {
        return responseCategory;
    }

    public void setResponseCategory(ResponseCategory responseCategory) {
        this.responseCategory = responseCategory;
    }

    public PieChartModel getPieModel() {
        return pieModel;
    }

    public Questionnaire getSelected() {
        return selected;
    }

    public void setSelected(Questionnaire selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private MailFacade getFacade() {
        return ejbFacade;
    }

    public Questionnaire prepareCreate() {
        selected = new Questionnaire();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("MailCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("MailUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("MailDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<Questionnaire> getItems() {
        if (items == null) {
            items = getFacade().findAll();
        }
        return items;
    }

    public BarChartModel getBarModel() {
        return barModel;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(selected);
                } else {
                    getFacade().remove(selected);
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            }
        }
    }

    public List<Questionnaire> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<Questionnaire> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = Questionnaire.class)
    public static class MailControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            MailController controller = (MailController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "mailController");
            return controller.getFacade().find(getKey(value));
        }

        java.lang.Long getKey(String value) {
            java.lang.Long key;
            key = Long.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Long value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Questionnaire) {
                Questionnaire o = (Questionnaire) object;
                return getStringKey(o.getId());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Questionnaire.class.getName()});
                return null;
            }
        }

    }

}
