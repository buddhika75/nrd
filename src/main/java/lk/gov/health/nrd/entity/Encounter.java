package lk.gov.health.nrd.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author User
 */
@Entity
public class Encounter implements Serializable {

    @OneToMany(mappedBy = "encounter")
    private List<EncounterMedicine> encounterMedicines;

    @OneToMany(mappedBy = "encounter")
    private List<EncounterInvestigation> encounterInvestigations;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    
    @ManyToOne
    Patient patient;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date encounterDate;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    Date encounterDateTime;

    @Lob
    private String details;
    
    
    @OneToOne(cascade = CascadeType.ALL)
    private RheumatoidArthritisData rheumatoidArthritisData;
    @OneToOne(cascade = CascadeType.ALL)
    private SystemicLupusErythematosusData systemicLupusErythematosusData;
    @OneToOne(cascade = CascadeType.ALL)
    private SpondyloarthristisData SpondyloarthristisData;
    
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Date getEncounterDate() {
        return encounterDate;
    }

    public void setEncounterDate(Date encounterDate) {
        this.encounterDate = encounterDate;
    }

    public Date getEncounterDateTime() {
        return encounterDateTime;
    }

    public void setEncounterDateTime(Date encounterDateTime) {
        this.encounterDateTime = encounterDateTime;
    }

    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Encounter)) {
            return false;
        }
        Encounter other = (Encounter) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lk.gov.health.nrd.entity.Encounter[ id=" + id + " ]";
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public List<EncounterMedicine> getEncounterMedicines() {
        return encounterMedicines;
    }

    public void setEncounterMedicines(List<EncounterMedicine> encounterMedicines) {
        if(encounterMedicines==null){
            encounterMedicines = new ArrayList<EncounterMedicine>();
        }
        this.encounterMedicines = encounterMedicines;
    }

    public List<EncounterInvestigation> getEncounterInvestigations() {
        return encounterInvestigations;
    }

    public void setEncounterInvestigations(List<EncounterInvestigation> encounterInvestigations) {
        if(encounterInvestigations==null){
            encounterInvestigations = new ArrayList<EncounterInvestigation>();
        }
        this.encounterInvestigations = encounterInvestigations;
    }

    public RheumatoidArthritisData getRheumatoidArthritisData() {
        if(rheumatoidArthritisData==null){
            rheumatoidArthritisData = new RheumatoidArthritisData();
        }
        return rheumatoidArthritisData;
    }

    public void setRheumatoidArthritisData(RheumatoidArthritisData rheumatoidArthritisData) {
        this.rheumatoidArthritisData = rheumatoidArthritisData;
    }

    public SystemicLupusErythematosusData getSystemicLupusErythematosusData() {
        if(systemicLupusErythematosusData==null){
            systemicLupusErythematosusData = new SystemicLupusErythematosusData();
        }
        return systemicLupusErythematosusData;
    }

    public void setSystemicLupusErythematosusData(SystemicLupusErythematosusData systemicLupusErythematosusData) {
        this.systemicLupusErythematosusData = systemicLupusErythematosusData;
    }

    public SpondyloarthristisData getSpondyloarthristisData() {
        if(SpondyloarthristisData==null){
            SpondyloarthristisData = new SpondyloarthristisData();
        }
        return SpondyloarthristisData;
    }

    public void setSpondyloarthristisData(SpondyloarthristisData SpondyloarthristisData) {
        this.SpondyloarthristisData = SpondyloarthristisData;
    }

    
    
}
