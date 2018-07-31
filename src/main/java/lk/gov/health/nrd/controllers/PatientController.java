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
import lk.gov.health.nrd.entity.SpondyloarthristisData;
/**
 *
 * @author rheumahealth2018
 */
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
    private float n$;

    public String toAddRaDate() {
        if (selected == null) {
            JsfUtil.addErrorMessage("Select a Patient");
            return "";
        }
        if (selected.getRheumatoidArthritisData() == null) {
            selected.setRheumatoidArthritisData(new RheumatoidArthritisData());
        }
        return "/patient/patient_rad";
    }

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

    public String searchPatient() {
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
        selected.setSpondyloarthristisData(new SpondyloarthristisData());

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

    
    public void calculateJointCountAndTargetPopulation(){
        calculateJointCount();
        totalOfTargtPopulationcal();
    }
    
    
    public void calculateJointCount() {
       System.out.println("joint");
        int largeJoint = 0;
        int smallJoint = 0;
        int additionalJoint = 0;
        int tenderJointCount = 0;
        int swollenJointCount = 0;
        
        

        if (selected == null) {
            return;
        }
       System.out.println("22");
        
        if(selected.getRheumatoidArthritisData().isLl1Sj() == true || selected.getRheumatoidArthritisData().isLlTj1Sj()== true){
            largeJoint++;
        }

        if (selected.getRheumatoidArthritisData().isLl2Ej() == true || selected.getRheumatoidArthritisData().isLlTj2Ej() == true) {
            largeJoint++;
        }

        if (selected.getRheumatoidArthritisData().isLl3Wj() == true || selected.getRheumatoidArthritisData().isLlTj3Wj() == true) {
            largeJoint++;
        }

        if (selected.getRheumatoidArthritisData().isLl14Hj() == true || selected.getRheumatoidArthritisData().isLlTj14Hj() == true) {
            largeJoint++;
        }

        if (selected.getRheumatoidArthritisData().isLl15Kj() == true || selected.getRheumatoidArthritisData().isLlTj15Kj() == true) {
            largeJoint++;
        }

        if (selected.getRheumatoidArthritisData().isLl16Aj() == true || selected.getRheumatoidArthritisData().isLlTJ16AJ() == true) {
            largeJoint++;
        }

        if (selected.getRheumatoidArthritisData().isRl21Sj() == true || selected.getRheumatoidArthritisData().isRlTj21Sj() == true) {
            largeJoint++;
        }

        if (selected.getRheumatoidArthritisData().isRl22Ej() == true || selected.getRheumatoidArthritisData().isRlTj22Ej() == true) {
            largeJoint++;
        }

        if (selected.getRheumatoidArthritisData().isRl23Wj() == true || selected.getRheumatoidArthritisData().isRlTj23Wj() == true) {
            largeJoint++;
        }

        if (selected.getRheumatoidArthritisData().isRl34Hj() == true || selected.getRheumatoidArthritisData().isRlTj34Hj() == true) {
            largeJoint++;
        }

        if (selected.getRheumatoidArthritisData().isRl35Kj() == true || selected.getRheumatoidArthritisData().isRlTj35Kj() == true) {
            largeJoint++;
        }

        if (selected.getRheumatoidArthritisData().isRl36Aj() == true || selected.getRheumatoidArthritisData().isRlTj36Aj() == true) {
            largeJoint++;
        }

        if (selected.getRheumatoidArthritisData().isLs4Mcp1() == true || selected.getRheumatoidArthritisData().isLsTj4Mcp1() == true) {
            smallJoint++;
        }

        if (selected.getRheumatoidArthritisData().isLs5Mcp2() == true || selected.getRheumatoidArthritisData().isLsTj5Mcp2() == true) {
            smallJoint++;
        }

        if (selected.getRheumatoidArthritisData().isLs6Mcp3() == true || selected.getRheumatoidArthritisData().isLsTj6Mcp3() == true) {
            smallJoint++;
        }

        if (selected.getRheumatoidArthritisData().isLs7Mcp4() == true || selected.getRheumatoidArthritisData().isLsTj7Mcp4() == true) {
            smallJoint++;
        }

        if (selected.getRheumatoidArthritisData().isLs8Mcp5() == true || selected.getRheumatoidArthritisData().isLsTj8Mcp5() == true) {
            smallJoint++;
        }

        if (selected.getRheumatoidArthritisData().isLs9ThumbIp() == true || selected.getRheumatoidArthritisData().isLsTj9ThumbIp() == true) {
            smallJoint++;
        }

        if (selected.getRheumatoidArthritisData().isLs10Pip2() == true || selected.getRheumatoidArthritisData().isLsTj10Pip2() == true) {
            smallJoint++;
        }

        if (selected.getRheumatoidArthritisData().isLs11Pip3() == true || selected.getRheumatoidArthritisData().isLsTj11Pip3() == true) {
            smallJoint++;
        }

        if (selected.getRheumatoidArthritisData().isLs12Pip4() == true || selected.getRheumatoidArthritisData().isLsTj12Pip4() == true) {
            smallJoint++;
        }

        if (selected.getRheumatoidArthritisData().isLs13Pip5() == true || selected.getRheumatoidArthritisData().isLsTj13Pip5() == true) {
            smallJoint++;
        }

        if (selected.getRheumatoidArthritisData().isLs17Mtp2() == true || selected.getRheumatoidArthritisData().isLsTj17Mtp2() == true) {
            smallJoint++;
        }

        if (selected.getRheumatoidArthritisData().isLs18Mtp3()== true || selected.getRheumatoidArthritisData().isLsTj18Mtp3() == true) {
            smallJoint++;
        }

        if (selected.getRheumatoidArthritisData().isLs19Mtp4() == true || selected.getRheumatoidArthritisData().isLsTj19Mtp4()== true) {
            smallJoint++;
        }


        if (selected.getRheumatoidArthritisData().isLs20Mtp5() == true || selected.getRheumatoidArthritisData().isLsTj20Mtp5() == true) {
            smallJoint++;
        }

        if (selected.getRheumatoidArthritisData().isRs24Mcp1() == true || selected.getRheumatoidArthritisData().isRsTj24Mcp1() == true) {
            smallJoint++;
        }

        if (selected.getRheumatoidArthritisData().isRs25Mcp2() == true || selected.getRheumatoidArthritisData().isRsTj25Mcp2() == true) {
            smallJoint++;
        }

        if (selected.getRheumatoidArthritisData().isRs26Mcp3() == true || selected.getRheumatoidArthritisData().isRsTj26Mcp3() == true) {
            smallJoint++;
        }

        if (selected.getRheumatoidArthritisData().isRs27Mcp4() == true || selected.getRheumatoidArthritisData().isRsTj27Mcp4() == true) {
            smallJoint++;
        }

        if (selected.getRheumatoidArthritisData().isRs28Mcp5() == true || selected.getRheumatoidArthritisData().isRsTj28Mcp5() == true) {
            smallJoint++;
        }

        if (selected.getRheumatoidArthritisData().isRs29ThumbIP() == true || selected.getRheumatoidArthritisData().isRsTj29ThumbIp() == true) {
            smallJoint++;
        }

        if (selected.getRheumatoidArthritisData().isRs30Pip2() == true || selected.getRheumatoidArthritisData().isRsTj30Pip2() == true) {
            smallJoint++;
        }

        if (selected.getRheumatoidArthritisData().isRs31Pip3() == true || selected.getRheumatoidArthritisData().isRs31Pip3() == true) {
            smallJoint++;
        }

        if (selected.getRheumatoidArthritisData().isRs32Pip4() == true || selected.getRheumatoidArthritisData().isRs32Pip4() == true) {
            smallJoint++;
        }

        if (selected.getRheumatoidArthritisData().isRs33Pip5() == true || selected.getRheumatoidArthritisData().isRsTj33Pip5() == true) {
            smallJoint++;
        }

        if (selected.getRheumatoidArthritisData().isRs37Mtp2() == true || selected.getRheumatoidArthritisData().isRsTj37Mtp2() == true) {
            smallJoint++;
        }

        if (selected.getRheumatoidArthritisData().isRs38Mtp3() == true || selected.getRheumatoidArthritisData().isRsTj38Mtp3() == true) {
            smallJoint++;
        }

        if (selected.getRheumatoidArthritisData().isRs39Mtp4() == true || selected.getRheumatoidArthritisData().isRsTj39Mtp4()== true) {
            smallJoint++;
        }

        if (selected.getRheumatoidArthritisData().isRs40Mtp5()== true || selected.getRheumatoidArthritisData().isRsTj40Mtp5() == true) {
            smallJoint++;
        }

        
        if (selected.getRheumatoidArthritisData().isLaj41Tmj() == true || selected.getRheumatoidArthritisData().isLajTj41Tmj() == true) {
            additionalJoint++;
        }
        
        if (selected.getRheumatoidArthritisData().isLaj42Acc() == true || selected.getRheumatoidArthritisData().isLajTj42Acc() == true) {
            additionalJoint++;
        }
        
        if (selected.getRheumatoidArthritisData().isLaj43Stc() == true || selected.getRheumatoidArthritisData().isLajTj43Stc() == true) {
            additionalJoint++;
        }
        
        if (selected.getRheumatoidArthritisData().isRaj44Tmj() == true || selected.getRheumatoidArthritisData().isRajTj44Tmj() == true) {
            additionalJoint++;
        }
        
        if (selected.getRheumatoidArthritisData().isRaj45Acc()== true || selected.getRheumatoidArthritisData().isRajTj45Acc()== true) {
            additionalJoint++;
        }
        
        if (selected.getRheumatoidArthritisData().isRaj46Stc() == true || selected.getRheumatoidArthritisData().isRajTj46Stc() == true) {
            additionalJoint++;
        }
        
        
        if (selected.getRheumatoidArthritisData().isLlTj1Sj() == true) {
            tenderJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isLlTj2Ej() == true) {
            tenderJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isLlTj3Wj() == true) {
            tenderJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isLsTj4Mcp1() == true) {
            tenderJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isLsTj5Mcp2() == true) {
            tenderJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isLsTj6Mcp3() == true) {
            tenderJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isLsTj7Mcp4() == true) {
            tenderJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isLsTj8Mcp5() == true) {
            tenderJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isLsTj9ThumbIp() == true) {
            tenderJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isLsTj10Pip2() == true) {
            tenderJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isLsTj11Pip3() == true) {
            tenderJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isLsTj12Pip4() == true) {
            tenderJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isLsTj13Pip5() == true) {
            tenderJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isLlTj15Kj() == true) {
            tenderJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isRlTj21Sj() == true) {
            tenderJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isRlTj22Ej() == true) {
            tenderJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isRlTj23Wj() == true) {
            tenderJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isRsTj24Mcp1() == true) {
            tenderJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isRsTj25Mcp2() == true) {
            tenderJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isRsTj26Mcp3() == true) {
            tenderJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isRsTj27Mcp4() == true) {
            tenderJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isRsTj28Mcp5() == true) {
            tenderJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isRsTj29ThumbIp() == true) {
            tenderJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isRsTj30Pip2() == true) {
            tenderJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isRsTj31Pip3() == true) {
            tenderJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isRsTj32Pip4() == true) {
            tenderJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isRsTj33Pip5() == true) {
            tenderJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isRlTj35Kj() == true) {
            tenderJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isLl1Sj() == true) {
            swollenJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isLl2Ej() == true) {
            swollenJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isLl3Wj() == true) {
            swollenJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isLs4Mcp1() == true) {
            swollenJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isLs5Mcp2() == true) {
            swollenJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isLs6Mcp3() == true) {
            swollenJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isLs7Mcp4() == true) {
            swollenJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isLs8Mcp5() == true) {
            swollenJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isLs9ThumbIp() == true) {
            swollenJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isLs10Pip2() == true) {
            swollenJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isLs11Pip3() == true) {
            swollenJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isLs12Pip4() == true) {
            swollenJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isLs13Pip5() == true) {
            swollenJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isLl15Kj() == true) {
            swollenJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isRl21Sj() == true) {
            swollenJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isRl22Ej() == true) {
            swollenJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isRl23Wj() == true) {
            swollenJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isRs24Mcp1() == true) {
            swollenJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isRs25Mcp2() == true) {
            swollenJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isRs26Mcp3() == true) {
            swollenJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isRs27Mcp4() == true) {
            swollenJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isRs28Mcp5() == true) {
            swollenJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isRs29ThumbIP() == true) {
            swollenJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isRs30Pip2() == true) {
            swollenJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isRs31Pip3() == true) {
            swollenJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isRs32Pip4() == true) {
            swollenJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isRs33Pip5() == true) {
            swollenJointCount++;
        }

        if (selected.getRheumatoidArthritisData().isRl35Kj() == true) {
            swollenJointCount++;
        }

       
System.out.println("swollenJointCount = " + swollenJointCount);
        if (largeJoint == 1) {
            selected.getRheumatoidArthritisData().setJointInvolvementCal(0);
        } else if (largeJoint > 1 && largeJoint < 10) {
            selected.getRheumatoidArthritisData().setJointInvolvementCal(1);
        }

        if (smallJoint >= 1 && smallJoint < 4) {
            selected.getRheumatoidArthritisData().setJointInvolvementCal(2);
        } else if (smallJoint > 3 && smallJoint < 11) {
            selected.getRheumatoidArthritisData().setJointInvolvementCal(3);
        }

        if ((smallJoint + largeJoint + additionalJoint) > 10) {
            if (smallJoint > 0 || additionalJoint > 0) {
                selected.getRheumatoidArthritisData().setJointInvolvementCal(5);
            } 
          }
        

        selected.getRheumatoidArthritisData().setTenderJointCountDAS(tenderJointCount);

        selected.getRheumatoidArthritisData().setSwollenJointCountDAS(swollenJointCount);
        
        selected.getRheumatoidArthritisData().setTenderJointCountSDAICDAI(tenderJointCount);
        
        selected.getRheumatoidArthritisData().setSwellenJointCountSDAICDAI(swollenJointCount);
       
        
         switch(selected.getRheumatoidArthritisData().getSerology()){
       case High_positiveRF_or_high_positive_ACPA:
           selected.getRheumatoidArthritisData().setSerologyCal(3);
           break;
       case Low_positiveRF_or_low_positive_ACPA:
           selected.getRheumatoidArthritisData().setSerologyCal(2);
           break;
       case Negative_RF_and_negative_ACPA:
           selected.getRheumatoidArthritisData().setSerologyCal(0);
          break;
        }
     
         switch(selected.getRheumatoidArthritisData().getAcutePhaseReactants()){
             case Nomal_CRP_and_normal_ESR:
                 selected.getRheumatoidArthritisData().setAcutephaseReactantsCal(0);
                 break;
             case Abnormal_CRP_or_abnormal_ESR:
                 selected.getRheumatoidArthritisData().setAcutephaseReactantsCal(1);
                 break;
         }
         
         
         switch (selected.getRheumatoidArthritisData().getDurationOfSymptoms()){
             case Less_than_six_weeks:
                 selected.getRheumatoidArthritisData().setDurationOfSymptomsCal(0);
                 break;
             case Greater_than_six_weeks:
                 selected.getRheumatoidArthritisData().setDurationOfSymptomsCal(1);
                 break;
         }
     
    }
    
    public void totalOfTargtPopulationcal(){
         System.out.println("cal = ");
         int total ;
         String x = "Diognosis Confirmed";
         String y = "Diognosis Not Confirmed";
         
         if (selected == null) {
            return;
        }
         int a = selected.getRheumatoidArthritisData().getAcutephaseReactantsCal();
         int b = selected.getRheumatoidArthritisData().getDurationOfSymptomsCal();
         int c = selected.getRheumatoidArthritisData().getSerologyCal();
         int d = selected.getRheumatoidArthritisData().getJointInvolvementCal();
         double e = selected.getRheumatoidArthritisData().getEsrDAS();
         double f = selected.getRheumatoidArthritisData().getCrpDAS();
         int p = selected.getRheumatoidArthritisData().getPatientGlobalHealthDAS();
         int t = selected.getRheumatoidArthritisData().getTenderJointCountDAS();
         int s = selected.getRheumatoidArthritisData().getSwollenJointCountDAS();
         int pga =selected.getRheumatoidArthritisData().getPatientGlobalAssessmentSDAICDAI();
         int ega = selected.getRheumatoidArthritisData().getEvaluatorGlobalAssessmentSDAICDAI();
      
        
        
        total = a+b+c+d;
        selected.getRheumatoidArthritisData().setTotalScoreTargetPopulation(total);
        if(total>5){
        selected.getRheumatoidArthritisData().setTotalDiognosis(x);
        
        }
        else{
        selected.getRheumatoidArthritisData().setTotalDiognosis(y);
        }
        
        double pts = 1.0*(p+t+s);
        double dastotal = pts + e+f;
        
        selected.getRheumatoidArthritisData().setCalculatedScoreDAS(dastotal);
     
        
        double crp = selected.getRheumatoidArthritisData().getCrpSDAICDAI();
        double temp = 0;
    
        switch (selected.getRheumatoidArthritisData().getUnitofCRP()){
              case mgPerL:
                 temp = crp/10;
                    break;
              case mgPerDl:
                 temp = crp;
                    break;
      }
        
         double sdai = temp + 1.0*(t+s+ega+pga) ;
         double cdai = 1.0*(t+s+ega+pga);
        System.out.println("sdai = " + sdai);
         selected.getRheumatoidArthritisData().setSdaiRemissionSDAICDAI(sdai);
        
         selected.getRheumatoidArthritisData().setCdaiRemissionSDAICDAI(cdai);
    }
    
    public void criteriaCal() {
        System.out.println("cal = ");
        int c_Total;
        int clinical = 0;
        int immunologic = 0;
        String x = "Diognosis Confirmed";
        String y = "Diognosis Not Confirmed";

        if (selected == null) {
            return;
        }
        System.out.println("200");
        if (selected.getSystemicLupusErythematosusData().isClinicalCriteria1() == true) {
            clinical++;
        }

        if (selected.getSystemicLupusErythematosusData().isClinicalCriteria2() == true) {
            clinical++;
        }

        if (selected.getSystemicLupusErythematosusData().isClinicalCriteria3() == true) {
            clinical++;
        }

        if (selected.getSystemicLupusErythematosusData().isClinicalCriteria4() == true) {
            clinical++;
        }

        if (selected.getSystemicLupusErythematosusData().isClinicalCriteria5() == true) {
            clinical++;
        }

        if (selected.getSystemicLupusErythematosusData().isClinicalCriteria6() == true) {
            clinical++;
        }

        if (selected.getSystemicLupusErythematosusData().isClinicalCriteria7() == true) {
            clinical++;
        }

        if (selected.getSystemicLupusErythematosusData().isClinicalCriteria8() == true) {
            clinical++;
        }

        if (selected.getSystemicLupusErythematosusData().isClinicalCriteria9()== true) {
            clinical++;
        }

        if (selected.getSystemicLupusErythematosusData().isClinicalCriteria10() == true) {
            clinical++;
        }

        if (selected.getSystemicLupusErythematosusData().isClinicalCriteria11() == true) {
            clinical++;
        }

        if (selected.getSystemicLupusErythematosusData().isImmunologicCriteria1() == true) {
            immunologic++;
        }

        if (selected.getSystemicLupusErythematosusData().isImmunologicCriteria2() == true) {
            immunologic++;
        }

        if (selected.getSystemicLupusErythematosusData().isImmunologicCriteria3() == true) {
            immunologic++;
        }

        if (selected.getSystemicLupusErythematosusData().isImmunologicCriteria4() == true) {
            immunologic++;
        }

        if (selected.getSystemicLupusErythematosusData().isImmunologicCriteria5() == true) {
            immunologic++;
        }

        if (selected.getSystemicLupusErythematosusData().isImmunologicCriteria6() == true) {
            immunologic++;
        }
System.out.println("immunologic = " + immunologic);
        c_Total = clinical + immunologic;
        {
            selected.getSystemicLupusErythematosusData().setCriteriaTotal(c_Total);
        }

        if (clinical > 0 && immunologic > 0) {
            if(c_Total > 4)
            selected.getSystemicLupusErythematosusData().setDiognosisConfirm(x);
        }
            else
            selected.getSystemicLupusErythematosusData().setDiognosisConfirm(y);
       

    }

    
    
    public void sledaiTotalcal() {

        int s_Total = 0;
        int eight = 8;
        int four = 4;
        int two = 2;
        int one = 1;
        String a = "No Flare";
        String b = "Mild or moderate flare";
        String c = "Server Flare";

        if (selected == null) {
            return;
        }

        if (selected.getSystemicLupusErythematosusData().isSledaiSeizure8() == true) {
            s_Total = s_Total + eight;
        }

        if (selected.getSystemicLupusErythematosusData().isSledaiPsychosis8() == true) {
            s_Total = s_Total + eight;
        }

        if (selected.getSystemicLupusErythematosusData().isSledaiOrganicBrainSyndrome8() == true) {
            s_Total = s_Total + eight;
        }

        if (selected.getSystemicLupusErythematosusData().isSledaiVisualDisturbances8() == true) {
            s_Total = s_Total + eight;
        }

        if (selected.getSystemicLupusErythematosusData().isSledaiCranialNerveDisorder8() == true) {
            s_Total = s_Total + eight;
        }

        if (selected.getSystemicLupusErythematosusData().isSledaiLupusHeadache8() == true) {
            s_Total = s_Total + eight;
        }

        if (selected.getSystemicLupusErythematosusData().isSledaiCva8() == true) {
            s_Total = s_Total + eight;
        }

        if (selected.getSystemicLupusErythematosusData().isSledaiVasculitis8() == true) {
            s_Total = s_Total + eight;
        }

        if (selected.getSystemicLupusErythematosusData().isSledaiArthritis4() == true) {
            s_Total = s_Total + four;
        }

        if (selected.getSystemicLupusErythematosusData().isSledaiMyositis4() == true) {
            s_Total = s_Total + four;
        }

        if (selected.getSystemicLupusErythematosusData().isSledaiUrinaryCasts4() == true) {
            s_Total = s_Total + four;
        }

        if (selected.getSystemicLupusErythematosusData().isSledaiHematuria4() == true) {
            s_Total = s_Total + four;
        }

        if (selected.getSystemicLupusErythematosusData().isSledaiProteinuria4() == true) {
            s_Total = s_Total + four;
        }

        if (selected.getSystemicLupusErythematosusData().isSledaiPyuria4() == true) {
            s_Total = s_Total + four;
        }

        if (selected.getSystemicLupusErythematosusData().isSledaiNewRash2() == true) {
            s_Total = s_Total + two;
        }

        if (selected.getSystemicLupusErythematosusData().isSledaiAlopecia2() == true) {
            s_Total = s_Total + two;
        }

        if (selected.getSystemicLupusErythematosusData().isSledaiMucosalUlcers2() == true) {
            s_Total = s_Total + two;
        }

        if (selected.getSystemicLupusErythematosusData().isSledaiPleurisy2() == true) {
            s_Total = s_Total + two;
        }

        if (selected.getSystemicLupusErythematosusData().isSledaiPericarditis2() == true) {
            s_Total = s_Total + two;
        }

        if (selected.getSystemicLupusErythematosusData().isSledaiLowComplement2() == true) {
            s_Total = s_Total + two;
        }

        if (selected.getSystemicLupusErythematosusData().isSledaiIncreasedDNABinding2() == true) {
            s_Total = s_Total + two;
        }

        if (selected.getSystemicLupusErythematosusData().isSledaiFever1() == true) {
            s_Total = s_Total + one;
        }

        if (selected.getSystemicLupusErythematosusData().isSledaiThrombocytopenia1() == true) {
            s_Total = s_Total + one;
        }

        if (selected.getSystemicLupusErythematosusData().isSledaiLeukopenia1() == true) {
            s_Total = s_Total + one;
        }

        selected.getSystemicLupusErythematosusData().setSledaiTotal(s_Total);
        if (s_Total <= 3) {
            
            selected.getSystemicLupusErythematosusData().setSledaiFlare(a);
        }
        
        if (s_Total> 3) {
            if(s_Total < 12){
        
                selected.getSystemicLupusErythematosusData().setSledaiFlare(b);
            }
        }
        
        if (s_Total >= 12 ) {
            
            selected.getSystemicLupusErythematosusData().setSledaiFlare(c);
        }
        
    }
    
    
     public void spondyloarthristisdatBASDAI(){
        System.out.println("basdai  ");
        String x = "Classified";
        String y = "Not Classified";
        String a1 = " Inactive ";
        String a2 = " Moderate Activity ";
        String a3 = " High Activity ";
        String a4 = " Very High Activity ";
        double erro = 0.0;
         if (selected == null) {
            return;
        }
         System.out.println("14");
         int f  = selected.getSpondyloarthristisData().getBasdaiFatigue();
         int sp = selected.getSpondyloarthristisData().getBasdaiSpinalPain();
         int pa = selected.getSpondyloarthristisData().getBasdaiPeripheralArthritis();
         int e =selected.getSpondyloarthristisData().getBasdaiEnthesitis();
         int msi =selected.getSpondyloarthristisData().getBasdaiMorningStiffnessIntensity();
         double msd =selected.getSpondyloarthristisData().getBasdaiMorningStiffnessDuration();
         int pga = selected.getSpondyloarthristisData().getAsdasPatientGlobalAssessmennt();
         
        if (f>10){
        selected.getSpondyloarthristisData().setBasdaiFatigue(f=0);
        System.out.println("f1 = "+f);
        }
        
        if (sp>10){
        selected.getSpondyloarthristisData().setBasdaiSpinalPain(sp=0);
        System.out.println("sp = "+sp);
        }else{
        selected.getSpondyloarthristisData().setAsdasSpinalPain(sp);
        }
        
        if (pa>10){
        selected.getSpondyloarthristisData().setBasdaiPeripheralArthritis(pa=0);
        System.out.println("pa = "+pa);
        }else{
        selected.getSpondyloarthristisData().setAsdasPeripheralArthritis(pa);
        }
        
        if (e>10){
        selected.getSpondyloarthristisData().setBasdaiEnthesitis(e=0);
        System.out.println("e = "+e);
        }
        
        if (msi>10){
        selected.getSpondyloarthristisData().setBasdaiMorningStiffnessIntensity(msi=0);
        System.out.println("msi= "+msi);
        }
        
        if (msd>10.0){
        selected.getSpondyloarthristisData().setBasdaiMorningStiffnessDuration(msd=0.0);
        System.out.println("msd= "+msd);
        }else{
        selected.getSpondyloarthristisData().setAsdasMorningStiffnessDuration(msd);
        }
        
        
        
       
            
            double basdaiScore = 0.2*(f+sp+pa+e)+ 0.5*(msi+msd);
            System.out.println(" f3 = "+f);
            System.out.println("pa2 = "+pa);
            
            System.out.println("score = "+basdaiScore);
            selected.getSpondyloarthristisData().setBasdaiCalculatedScore(basdaiScore);
            
            if(basdaiScore > 3.9){
                selected.getSpondyloarthristisData().setBasdaiClassified(x);
            }
            else{
                selected.getSpondyloarthristisData().setBasdaiClassified(y);
            }
            
            
            
            double esr = selected.getSpondyloarthristisData().getAsdasEsr();
            
            
            double rootesr  = Math.sqrt(esr);
            System.out.println("rootesr = " + rootesr);
            
            double esrscore = 0.079*sp + 0.069*msd + 0.113*pga + 0.086*pa + 0.293*rootesr;
            
            double esrscoreround = (double)Math.round(esrscore * 100d) / 100d;
            System.out.println("esrscore = "+ esrscore );
            System.out.println("esrscoreround = "+ esrscoreround );
            selected.getSpondyloarthristisData().setAsdasEsrScore(esrscoreround);
            
            
            if(esrscoreround < 1.3){
                selected.getSpondyloarthristisData().setAsdasEsrScoreReference(a1);
            }
            if(1.3 < esrscoreround ){
                if (esrscoreround < 2.1){
                    selected.getSpondyloarthristisData().setAsdasEsrScoreReference(a2);
                }
            }
            if(2.1 <esrscoreround ){        
                if(esrscoreround < 3.5){
                    selected.getSpondyloarthristisData().setAsdasEsrScoreReference(a3);
                }
            }
            
            if(esrscoreround > 3.5 ){
                selected.getSpondyloarthristisData().setAsdasEsrScoreReference(a4);
            }
      
            
            double crp = selected.getSpondyloarthristisData().getAsdasCrp();
            
            double temp = 0;
            
            switch (selected.getSpondyloarthristisData().getUnitofCRP()){
                case mgPerL:
                    temp = crp/10;
                    break;
                case mgPerDl:
                    temp = crp;
                    break;
            }
            double logcrp = Math.log(temp+1);
            System.out.println("logcrp = " + logcrp);
            double crpScore = 0.121*sp + 0.058*msd + 0.11*pga + 0.073*pa + 0.579*logcrp;
            
            double crpScoreRound = (double)Math.round(crpScore * 100d) / 100d;
            System.out.println("crpScore = "+ crpScore );
            System.out.println("crpScoreRound = "+ crpScoreRound );
            
            
            selected.getSpondyloarthristisData().setAsdasCrpScore(crpScoreRound);
            
            
            if(crpScoreRound < 1.3){
                selected.getSpondyloarthristisData().setAsdasCrpScoreReference(a1);
            }
            if(1.3 < crpScoreRound ){
                if (crpScoreRound < 2.1){
                    selected.getSpondyloarthristisData().setAsdasCrpScoreReference(a2);
                }
            }
            if(2.1 <crpScoreRound ){
                if(crpScoreRound < 3.5){
                    selected.getSpondyloarthristisData().setAsdasCrpScoreReference(a3);
                }
            }
            
            if(crpScoreRound > 3.5 ){
                selected.getSpondyloarthristisData().setAsdasCrpScoreReference(a4);
            }
        }
     
     
      
    public void diagnosisType() {
        System.out.println("cal = ");
        
        String num1 = "RA";
        String num2 = "OA";

        if (selected == null) {
            return;
        }
        System.out.println("200");
         
         if(selected.getDiagnosis().isRa() == true){
             
         selected.setDiagnosisTypedisplay(num1);
         }
         if(selected.getDiagnosis().isOa()== true){
             
         selected.setDiagnosisTypedisplay(num2);
         }
        
        }
          
          
    }
     
     
    

  