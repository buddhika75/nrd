/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gov.health.nrd.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 *
 * @author User
 */
@Entity
public class PatientDiagnosis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    Patient patient;

    Boolean RA;
    Boolean OA;
    Boolean JIA;
    Boolean GOUT;
    Boolean Undifferentiated_IA;
    Boolean CTD;
    Boolean SLE;
    Boolean APS;
    Boolean MCTD;
    Boolean OVERLAP;
    Boolean Scleroderma;
    Boolean Dermato_Polymyositis;
    Boolean Sjogrens;
    Boolean Other_CTD;
    Boolean SpA;
    Boolean AS;
    Boolean Axial;
    Boolean Peripheral;
    Boolean Mixed_Axial_and_Peripheral;
    Boolean Reactive;
    Boolean Psoriatic;
    Boolean IBD_associated;
    Boolean Reiter_s;
    Boolean Juvenile;
    Boolean VASCULITIS;
    Boolean TKA;
    Boolean GCA;
    Boolean PAN;
    Boolean KD;
    Boolean AAV;
    Boolean MPA;
    Boolean GPA_WG;
    Boolean EGPA_CSS;
    Boolean Anti_GBM_GPS;
    Boolean CV;
    Boolean IgA_HSP;
    Boolean HUV;
    Boolean BD;
    Boolean Other_Vasculitis;
    Boolean Soft_Tissue_Diseases;
    Boolean Fibromyalgia;
    Boolean BT;
    Boolean Adhesive_Capsulitis;
    Boolean Other_SJ_Ds;
    Boolean TE;
    Boolean GE;
    Boolean DQTS;
    Boolean Ulna_Styloid;
    Boolean PF;
    Boolean Achilles_Tendinitis;
    Boolean Metatarsalgia;
    Boolean Regional_Pain_Syndromes;
    Boolean Backache;
    Boolean Neck_Pain;
    Boolean Other_Regional_Pain_Syndromes;
    Boolean OTHER;

    @Lob
    String disgnosisComments;
    String otherCtd;
    String otherVasculitis;
    String otherDiagnosis;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Boolean getRA() {
        return RA;
    }

    public void setRA(Boolean RA) {
        this.RA = RA;
    }

    public Boolean getOA() {
        return OA;
    }

    public void setOA(Boolean OA) {
        this.OA = OA;
    }

    public Boolean getJIA() {
        return JIA;
    }

    public void setJIA(Boolean JIA) {
        this.JIA = JIA;
    }

    public Boolean getGOUT() {
        return GOUT;
    }

    public void setGOUT(Boolean GOUT) {
        this.GOUT = GOUT;
    }

    public Boolean getUndifferentiated_IA() {
        return Undifferentiated_IA;
    }

    public void setUndifferentiated_IA(Boolean Undifferentiated_IA) {
        this.Undifferentiated_IA = Undifferentiated_IA;
    }

    public Boolean getCTD() {
        return CTD;
    }

    public void setCTD(Boolean CTD) {
        this.CTD = CTD;
    }

    public Boolean getSLE() {
        return SLE;
    }

    public void setSLE(Boolean SLE) {
        this.SLE = SLE;
    }

    public Boolean getAPS() {
        return APS;
    }

    public void setAPS(Boolean APS) {
        this.APS = APS;
    }

    public Boolean getMCTD() {
        return MCTD;
    }

    public void setMCTD(Boolean MCTD) {
        this.MCTD = MCTD;
    }

    public Boolean getOVERLAP() {
        return OVERLAP;
    }

    public void setOVERLAP(Boolean OVERLAP) {
        this.OVERLAP = OVERLAP;
    }

    public Boolean getScleroderma() {
        return Scleroderma;
    }

    public void setScleroderma(Boolean Scleroderma) {
        this.Scleroderma = Scleroderma;
    }

    public Boolean getDermato_Polymyositis() {
        return Dermato_Polymyositis;
    }

    public void setDermato_Polymyositis(Boolean Dermato_Polymyositis) {
        this.Dermato_Polymyositis = Dermato_Polymyositis;
    }

    public Boolean getSjogrens() {
        return Sjogrens;
    }

    public void setSjogrens(Boolean Sjogrens) {
        this.Sjogrens = Sjogrens;
    }

    public Boolean getOther_CTD() {
        return Other_CTD;
    }

    public void setOther_CTD(Boolean Other_CTD) {
        this.Other_CTD = Other_CTD;
    }

    public Boolean getSpA() {
        return SpA;
    }

    public void setSpA(Boolean SpA) {
        this.SpA = SpA;
    }

    public Boolean getAS() {
        return AS;
    }

    public void setAS(Boolean AS) {
        this.AS = AS;
    }

    public Boolean getAxial() {
        return Axial;
    }

    public void setAxial(Boolean Axial) {
        this.Axial = Axial;
    }

    public Boolean getPeripheral() {
        return Peripheral;
    }

    public void setPeripheral(Boolean Peripheral) {
        this.Peripheral = Peripheral;
    }

    public Boolean getMixed_Axial_and_Peripheral() {
        return Mixed_Axial_and_Peripheral;
    }

    public void setMixed_Axial_and_Peripheral(Boolean Mixed_Axial_and_Peripheral) {
        this.Mixed_Axial_and_Peripheral = Mixed_Axial_and_Peripheral;
    }

    public Boolean getReactive() {
        return Reactive;
    }

    public void setReactive(Boolean Reactive) {
        this.Reactive = Reactive;
    }

    public Boolean getPsoriatic() {
        return Psoriatic;
    }

    public void setPsoriatic(Boolean Psoriatic) {
        this.Psoriatic = Psoriatic;
    }

    public Boolean getIBD_associated() {
        return IBD_associated;
    }

    public void setIBD_associated(Boolean IBD_associated) {
        this.IBD_associated = IBD_associated;
    }

    public Boolean getReiter_s() {
        return Reiter_s;
    }

    public void setReiter_s(Boolean Reiter_s) {
        this.Reiter_s = Reiter_s;
    }

    public Boolean getJuvenile() {
        return Juvenile;
    }

    public void setJuvenile(Boolean Juvenile) {
        this.Juvenile = Juvenile;
    }

    public Boolean getVASCULITIS() {
        return VASCULITIS;
    }

    public void setVASCULITIS(Boolean VASCULITIS) {
        this.VASCULITIS = VASCULITIS;
    }

    public Boolean getTKA() {
        return TKA;
    }

    public void setTKA(Boolean TKA) {
        this.TKA = TKA;
    }

    public Boolean getGCA() {
        return GCA;
    }

    public void setGCA(Boolean GCA) {
        this.GCA = GCA;
    }

    public Boolean getPAN() {
        return PAN;
    }

    public void setPAN(Boolean PAN) {
        this.PAN = PAN;
    }

    public Boolean getKD() {
        return KD;
    }

    public void setKD(Boolean KD) {
        this.KD = KD;
    }

    public Boolean getAAV() {
        return AAV;
    }

    public void setAAV(Boolean AAV) {
        this.AAV = AAV;
    }

    public Boolean getMPA() {
        return MPA;
    }

    public void setMPA(Boolean MPA) {
        this.MPA = MPA;
    }

    public Boolean getGPA_WG() {
        return GPA_WG;
    }

    public void setGPA_WG(Boolean GPA_WG) {
        this.GPA_WG = GPA_WG;
    }

    public Boolean getEGPA_CSS() {
        return EGPA_CSS;
    }

    public void setEGPA_CSS(Boolean EGPA_CSS) {
        this.EGPA_CSS = EGPA_CSS;
    }

    public Boolean getAnti_GBM_GPS() {
        return Anti_GBM_GPS;
    }

    public void setAnti_GBM_GPS(Boolean Anti_GBM_GPS) {
        this.Anti_GBM_GPS = Anti_GBM_GPS;
    }

    public Boolean getCV() {
        return CV;
    }

    public void setCV(Boolean CV) {
        this.CV = CV;
    }

    public Boolean getIgA_HSP() {
        return IgA_HSP;
    }

    public void setIgA_HSP(Boolean IgA_HSP) {
        this.IgA_HSP = IgA_HSP;
    }

    public Boolean getHUV() {
        return HUV;
    }

    public void setHUV(Boolean HUV) {
        this.HUV = HUV;
    }

    public Boolean getBD() {
        return BD;
    }

    public void setBD(Boolean BD) {
        this.BD = BD;
    }

    public Boolean getOther_Vasculitis() {
        return Other_Vasculitis;
    }

    public void setOther_Vasculitis(Boolean Other_Vasculitis) {
        this.Other_Vasculitis = Other_Vasculitis;
    }

    public Boolean getSoft_Tissue_Diseases() {
        return Soft_Tissue_Diseases;
    }

    public void setSoft_Tissue_Diseases(Boolean Soft_Tissue_Diseases) {
        this.Soft_Tissue_Diseases = Soft_Tissue_Diseases;
    }

    public Boolean getFibromyalgia() {
        return Fibromyalgia;
    }

    public void setFibromyalgia(Boolean Fibromyalgia) {
        this.Fibromyalgia = Fibromyalgia;
    }

    public Boolean getBT() {
        return BT;
    }

    public void setBT(Boolean BT) {
        this.BT = BT;
    }

    public Boolean getAdhesive_Capsulitis() {
        return Adhesive_Capsulitis;
    }

    public void setAdhesive_Capsulitis(Boolean Adhesive_Capsulitis) {
        this.Adhesive_Capsulitis = Adhesive_Capsulitis;
    }

    public Boolean getOther_SJ_Ds() {
        return Other_SJ_Ds;
    }

    public void setOther_SJ_Ds(Boolean Other_SJ_Ds) {
        this.Other_SJ_Ds = Other_SJ_Ds;
    }

    public Boolean getTE() {
        return TE;
    }

    public void setTE(Boolean TE) {
        this.TE = TE;
    }

    public Boolean getGE() {
        return GE;
    }

    public void setGE(Boolean GE) {
        this.GE = GE;
    }

    public Boolean getDQTS() {
        return DQTS;
    }

    public void setDQTS(Boolean DQTS) {
        this.DQTS = DQTS;
    }

    public Boolean getUlna_Styloid() {
        return Ulna_Styloid;
    }

    public void setUlna_Styloid(Boolean Ulna_Styloid) {
        this.Ulna_Styloid = Ulna_Styloid;
    }

    public Boolean getPF() {
        return PF;
    }

    public void setPF(Boolean PF) {
        this.PF = PF;
    }

    public Boolean getAchilles_Tendinitis() {
        return Achilles_Tendinitis;
    }

    public void setAchilles_Tendinitis(Boolean Achilles_Tendinitis) {
        this.Achilles_Tendinitis = Achilles_Tendinitis;
    }

    public Boolean getMetatarsalgia() {
        return Metatarsalgia;
    }

    public void setMetatarsalgia(Boolean Metatarsalgia) {
        this.Metatarsalgia = Metatarsalgia;
    }

    public Boolean getRegional_Pain_Syndromes() {
        return Regional_Pain_Syndromes;
    }

    public void setRegional_Pain_Syndromes(Boolean Regional_Pain_Syndromes) {
        this.Regional_Pain_Syndromes = Regional_Pain_Syndromes;
    }

    public Boolean getBackache() {
        return Backache;
    }

    public void setBackache(Boolean Backache) {
        this.Backache = Backache;
    }

    public Boolean getNeck_Pain() {
        return Neck_Pain;
    }

    public void setNeck_Pain(Boolean Neck_Pain) {
        this.Neck_Pain = Neck_Pain;
    }

    public Boolean getOther_Regional_Pain_Syndromes() {
        return Other_Regional_Pain_Syndromes;
    }

    public void setOther_Regional_Pain_Syndromes(Boolean Other_Regional_Pain_Syndromes) {
        this.Other_Regional_Pain_Syndromes = Other_Regional_Pain_Syndromes;
    }

    public Boolean getOTHER() {
        return OTHER;
    }

    public void setOTHER(Boolean OTHER) {
        this.OTHER = OTHER;
    }

    public String getDisgnosisComments() {
        return disgnosisComments;
    }

    public void setDisgnosisComments(String disgnosisComments) {
        this.disgnosisComments = disgnosisComments;
    }

    public String getOtherCtd() {
        return otherCtd;
    }

    public void setOtherCtd(String otherCtd) {
        this.otherCtd = otherCtd;
    }

    public String getOtherVasculitis() {
        return otherVasculitis;
    }

    public void setOtherVasculitis(String otherVasculitis) {
        this.otherVasculitis = otherVasculitis;
    }

    public String getOtherDiagnosis() {
        return otherDiagnosis;
    }

    public void setOtherDiagnosis(String otherDiagnosis) {
        this.otherDiagnosis = otherDiagnosis;
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
        if (!(object instanceof PatientDiagnosis)) {
            return false;
        }
        PatientDiagnosis other = (PatientDiagnosis) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lk.gov.health.nrd.entity.PatientDiagnosis[ id=" + id + " ]";
    }

}
