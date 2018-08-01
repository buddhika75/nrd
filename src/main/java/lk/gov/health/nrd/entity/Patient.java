/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gov.health.nrd.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import lk.gov.health.nrd.enums.Sex;

/**
 *
 * @author User
 */
@Entity
public class Patient implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    Institute registeredInstitute;
    @ManyToOne
    Department registeredDepartment;
    String clinicNumber;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateOfRegistration;
    String nameOfPatient;
    Sex Sex;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateOfBirth;
    String Age;
    double ageInDays;
    String telephoneNoMobile;
    String telephoneNoHome;
    @Lob
    String address;
    @ManyToOne
    Area city;
    String nic;
   

    @Enumerated(EnumType.STRING)
    ReferredBy referredBy;
    String otherReferredBY;
    @Enumerated(EnumType.STRING)
    Occupation occupation;
    String otherOccupation;
    @Enumerated(EnumType.STRING)
    Race race;
    String raceOther;

    @OneToOne(cascade = CascadeType.ALL)
    PatientDiagnosis diagnosis;
    @OneToOne(cascade = CascadeType.ALL)
    RheumatoidArthritisData rheumatoidArthritisData;
    @OneToOne(cascade = CascadeType.ALL)
    SystemicLupusErythematosusData systemicLupusErythematosusData;
    @OneToOne(cascade = CascadeType.ALL)
    SpondyloarthristisData SpondyloarthristisData;
    @OneToOne(cascade = CascadeType.ALL)
    Investigation Investigation;
    @OneToOne(cascade = CascadeType.ALL)
    ShortSummary ShortSummary;
    @OneToOne(cascade = CascadeType.ALL)
    Prescription Prescription;
    @OneToOne(cascade = CascadeType.ALL)
    Visit Visit;

    public Department getRegisteredDepartment() {
        return registeredDepartment;
    }

    public void setRegisteredDepartment(Department registeredDepartment) {
        this.registeredDepartment = registeredDepartment;
    }

    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Institute getRegisteredInstitute() {
        return registeredInstitute;
    }

    public void setRegisteredInstitute(Institute registeredInstitute) {
        this.registeredInstitute = registeredInstitute;
    }

    public String getClinicNumber() {
        return clinicNumber;
    }

    public void setClinicNumber(String clinicNumber) {
        this.clinicNumber = clinicNumber;
    }

    public Date getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(Date dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public String getNameOfPatient() {
        return nameOfPatient;
    }

    public void setNameOfPatient(String nameOfPatient) {
        this.nameOfPatient = nameOfPatient;
    }

    public Sex getSex() {
        return Sex;
    }

    public void setSex(Sex Sex) {
        this.Sex = Sex;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public double getAgeInDays() {
        return ageInDays;
    }

    public void setAgeInDays(double ageInDays) {
        this.ageInDays = ageInDays;
    }

    public String getTelephoneNoMobile() {
        return telephoneNoMobile;
    }

    public void setTelephoneNoMobile(String telephoneNoMobile) {
        this.telephoneNoMobile = telephoneNoMobile;
    }

    public String getTelephoneNoHome() {
        return telephoneNoHome;
    }

    public void setTelephoneNoHome(String telephoneNoHome) {
        this.telephoneNoHome = telephoneNoHome;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Area getCity() {
        return city;
    }

    public void setCity(Area city) {
        this.city = city;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public ReferredBy getReferredBy() {
        return referredBy;
    }

    public void setReferredBy(ReferredBy referredBy) {
        this.referredBy = referredBy;
    }

    public String getOtherReferredBY() {
        return otherReferredBY;
    }

    public void setOtherReferredBY(String otherReferredBY) {
        this.otherReferredBY = otherReferredBY;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }

    public String getOtherOccupation() {
        return otherOccupation;
    }

    public void setOtherOccupation(String otherOccupation) {
        this.otherOccupation = otherOccupation;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public String getRaceOther() {
        return raceOther;
    }

    public void setRaceOther(String raceOther) {
        this.raceOther = raceOther;
    }

    public PatientDiagnosis getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(PatientDiagnosis diagnosis) {
        this.diagnosis = diagnosis;
    }

    public RheumatoidArthritisData getRheumatoidArthritisData() {
        if(rheumatoidArthritisData ==null){
            rheumatoidArthritisData = new RheumatoidArthritisData();
        }
        return rheumatoidArthritisData;
    }

    public void setRheumatoidArthritisData(RheumatoidArthritisData rheumatoidArthritisData) {
        this.rheumatoidArthritisData = rheumatoidArthritisData;
    }

    public SystemicLupusErythematosusData getSystemicLupusErythematosusData() {
        if(systemicLupusErythematosusData ==null){
            systemicLupusErythematosusData = new SystemicLupusErythematosusData();
        }
        return systemicLupusErythematosusData;
    }

    public void setSystemicLupusErythematosusData(SystemicLupusErythematosusData systemicLupusErythematosusData) {
        this.systemicLupusErythematosusData = systemicLupusErythematosusData;
    }

    public SpondyloarthristisData getSpondyloarthristisData() {
        if(SpondyloarthristisData == null){
            SpondyloarthristisData = new SpondyloarthristisData();
                    }
        return SpondyloarthristisData;
    }

    public void setSpondyloarthristisData(SpondyloarthristisData SpondyloarthristisData) {
        this.SpondyloarthristisData = SpondyloarthristisData;
    }

    public Investigation getInvestigation() {
        if(Investigation == null){
            Investigation = new Investigation();
                    }
        return Investigation;
    }

    public void setInvestigation(Investigation Investigation) {
        this.Investigation = Investigation;
    }

    public ShortSummary getShortSummary() {
        if(ShortSummary == null){
        ShortSummary =new ShortSummary();
        }
        return ShortSummary;
    }

    public void setShortSummary(ShortSummary ShortSummary) {
        this.ShortSummary = ShortSummary;
    }

    public Prescription getPrescription() {
        if(Prescription == null){
        Prescription = new Prescription();
        }
        return Prescription;
    }

    public void setPrescription(Prescription Prescription) {
        this.Prescription = Prescription;
    }

    
    
    
    public Visit getVisit() {
        if(Visit == null){
        Visit = new Visit();
        }
        return Visit;
    }

    public void setVisit(Visit Visit) {
        this.Visit = Visit;
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
        if (!(object instanceof Patient)) {
            return false;
        }
        Patient other = (Patient) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "lk.gov.health.nrd.entity.Patient[ id=" + id + " ]";
    }

   
}
