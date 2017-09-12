package lk.gov.health.nrd.controllers;

import lk.gov.health.nrd.entity.Patient;
import lk.gov.health.nrd.controllers.util.JsfUtil;
import lk.gov.health.nrd.controllers.util.JsfUtil.PersistAction;
import lk.gov.health.nrd.facades.PatientFacade;

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
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import lk.gov.health.nrd.entity.PatientDiagnosis;
import lk.gov.health.nrd.entity.RheumatoidArthritisData;
import lk.gov.health.nrd.entity.SystemicLupusErythematosusData;

@Named("patientController")
@SessionScoped
public class PatientController implements Serializable {

    @Inject
    WebUserController webUserController;

    @EJB
    private lk.gov.health.nrd.facades.PatientFacade ejbFacade;
    private List<Patient> items = null;
    private Patient selected;
    String searchText;

    PatientDiagnosis patientDiagnosis;
    RheumatoidArthritisData rheumatoidArthritisData;
    List<Patient> searchedPatients;

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    public List<Patient> getSearchedPatients() {
        return searchedPatients;
    }

    public void setSearchedPatients(List<Patient> searchedPatients) {
        this.searchedPatients = searchedPatients;
    }

    
    
    
    public PatientDiagnosis getPatientDiagnosis() {
        return patientDiagnosis;
    }

    public void setPatientDiagnosis(PatientDiagnosis patientDiagnosis) {
        this.patientDiagnosis = patientDiagnosis;
    }

    public RheumatoidArthritisData getRheumatoidArthritisData() {
        return rheumatoidArthritisData;
    }

    public void setRheumatoidArthritisData(RheumatoidArthritisData rheumatoidArthritisData) {
        this.rheumatoidArthritisData = rheumatoidArthritisData;
    }

    public PatientController() {
    }

    public WebUserController getWebUserController() {
        return webUserController;
    }

    public String toSearchPatient() {
        return "/patient/patient_search";
    }

    public String searchPatient(){
        String j = "select p "
                + " from Patient p "
                + " where lower(p.nameOfPatient) like :st or "
                + " p.nic like :st or "
                + " lower(p.clinicNumber) like :st "
                + " order by p.nameOfPatient";
        Map m = new HashMap();
        m.put("st", "%" + searchText.toLowerCase() + "%");
        searchedPatients = getFacade().findBySQL(j, m);
        return "/patient/patient_search";
    }
    
    public String toAddNewPatient() {
        selected = new Patient();
        selected.setDateOfBirth(new Date());
        selected.setDiagnosis(new PatientDiagnosis());
        selected.setRheumatoidArthritisData(new RheumatoidArthritisData());
        selected.setSystemicLupusErythematosusData(new SystemicLupusErythematosusData());

        System.out.println("webUserController.loggedUser = " + getWebUserController().getLoggedUser());
        if (getWebUserController().getLoggedUser() != null) {
            System.out.println("getWebUserController().getLoggedUser().getInstitute() = " + getWebUserController().getLoggedUser().getInstitute());
            selected.setRegisteredInstitute(getWebUserController().getLoggedUser().getInstitute());
            selected.setRegisteredDepartment(getWebUserController().getLoggedUser().getDepartment());
        }
        System.out.println("selected.getRegisteredInstitute()"
                + "= " + selected.getRegisteredInstitute());
        return "/patient/patient";
    }

    public String savePatient() {
        if (selected == null) {
            JsfUtil.addErrorMessage("Nothing to save");
            return "";
        }
        if (selected.getId() == null) {
            getFacade().create(selected);
            JsfUtil.addSuccessMessage("Created");
        } else {
            getFacade().edit(selected);
            JsfUtil.addSuccessMessage("Updated");
        }
        return "";
    }

    public Patient getSelected() {
        return selected;
    }

    public void setSelected(Patient selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private PatientFacade getFacade() {
        return ejbFacade;
    }

    public Patient prepareCreate() {
        selected = new Patient();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/BundlePt").getString("PatientCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/BundlePt").getString("PatientUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/BundlePt").getString("PatientDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<Patient> getItems() {
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
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/BundlePt").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/BundlePt").getString("PersistenceErrorOccured"));
            }
        }
    }

    public Patient getPatient(java.lang.Long id) {
        return getFacade().find(id);
    }

    public List<Patient> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<Patient> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = Patient.class)
    public static class PatientControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            PatientController controller = (PatientController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "patientController");
            return controller.getPatient(getKey(value));
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
            if (object instanceof Patient) {
                Patient o = (Patient) object;
                return getStringKey(o.getId());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Patient.class.getName()});
                return null;
            }
        }

    }

}
