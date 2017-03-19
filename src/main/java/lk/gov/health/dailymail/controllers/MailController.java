package lk.gov.health.dailymail.controllers;

import lk.gov.health.dailymail.entity.Questionnaire;
import lk.gov.health.dailymail.controllers.util.JsfUtil;
import lk.gov.health.dailymail.controllers.util.JsfUtil.PersistAction;
import lk.gov.health.dailymail.facades.MailFacade;

import java.io.Serializable;
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

@Named
@SessionScoped
public class MailController implements Serializable {

    @EJB
    private lk.gov.health.dailymail.facades.MailFacade ejbFacade;
    private List<Questionnaire> items = null;
    private List<Questionnaire> selectedItems = null;
    private Questionnaire selected;

    @Inject
    WebUserController webUserController;
    @Inject
    CommonController commonController;

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
        if(toDate==null){
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

    public String saveAddNew() {
        if (selected == null) {
            JsfUtil.addErrorMessage("Nothing to save");
            return "";
        }
        getFacade().create(selected);
        items = null;
        return toAddNew();
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
