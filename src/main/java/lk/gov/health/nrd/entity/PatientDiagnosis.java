/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gov.health.nrd.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;


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
    @OneToOne(mappedBy = "diagnosis")
    private Patient patient;

    private boolean ra;
    private boolean oa;
    private boolean jia;
    private boolean gout;
    private boolean undifferentiated_IA;
    private boolean ctd;
    private boolean sle;
    private boolean apls;
    private boolean mctd;
    private boolean overlap;
    private boolean scleroderma;
    private boolean dermato_Polymyositis;
    private boolean sjogrens;
    private boolean Other_CTD;
    private boolean spA;
    private boolean a_s;
    private boolean axial;
    private boolean peripheral;
    private boolean mixed_Axial_and_Peripheral;
    private boolean reactive;
    private boolean psoriatic;
    private boolean ibd_associated;
    private boolean reiter_s;
    private boolean juvenile;
    private boolean vasculitis;
    private boolean tka;
    private boolean gca;
    private boolean pan;
    private boolean kd;
    private boolean aav;
    private boolean mpa;
    private boolean gpa_WG;
    private boolean egpa_CSS;
    private boolean anti_GBM_GPS;
    private boolean cv;
    private boolean iga_HSP;
    private boolean huv;
    private boolean bd;
    private boolean other_Vasculitis;
    private boolean soft_Tissue_Diseases;
    private boolean fibromyalgia;
    private boolean bt;
    private boolean adhesive_Capsulitis;
    private boolean other_SJ_Ds;
    private boolean te;
    private boolean ge1;
    private boolean dqts;
    private boolean ulna_Styloid;
    private boolean pf;
    private boolean achilles_Tendinitis;
    private boolean metatarsalgia;
    private boolean regional_Pain_Syndromes;
    private boolean backache;
    private boolean neck_Pain;
    private boolean other_Regional_Pain_Syndromes;
    private boolean other_std;
     
     
    @Lob
    private String disgnosisComments;
    private String otherCtd;
    private String otherVasculitis;
    private String otherDiagnosis;
    
    
   
    
    
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

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isRa() {
        return ra;
    }

    public void setRa(boolean ra) {
        this.ra = ra;
    }

    public boolean isOa() {
        return oa;
    }

    public void setOa(boolean oa) {
        this.oa = oa;
    }

    public boolean isJia() {
        return jia;
    }

    public void setJia(boolean jia) {
        this.jia = jia;
    }

    public boolean isGout() {
        return gout;
    }

    public void setGout(boolean gout) {
        this.gout = gout;
    }

    public boolean isUndifferentiated_IA() {
        return undifferentiated_IA;
    }

    public void setUndifferentiated_IA(boolean undifferentiated_IA) {
        this.undifferentiated_IA = undifferentiated_IA;
    }

    public boolean isCtd() {
        return ctd;
    }

    public void setCtd(boolean ctd) {
        this.ctd = ctd;
    }

    public boolean isSle() {
        return sle;
    }

    public void setSle(boolean sle) {
        this.sle = sle;
    }

    public boolean isApls() {
        return apls;
    }

    public void setApls(boolean apls) {
        this.apls = apls;
    }

    public boolean isMctd() {
        return mctd;
    }

    public void setMctd(boolean mctd) {
        this.mctd = mctd;
    }

    public boolean isOverlap() {
        return overlap;
    }

    public void setOverlap(boolean overlap) {
        this.overlap = overlap;
    }

    public boolean isScleroderma() {
        return scleroderma;
    }

    public void setScleroderma(boolean scleroderma) {
        this.scleroderma = scleroderma;
    }

    public boolean isDermato_Polymyositis() {
        return dermato_Polymyositis;
    }

    public void setDermato_Polymyositis(boolean dermato_Polymyositis) {
        this.dermato_Polymyositis = dermato_Polymyositis;
    }

    public boolean isSjogrens() {
        return sjogrens;
    }

    public void setSjogrens(boolean sjogrens) {
        this.sjogrens = sjogrens;
    }

    public boolean isOther_CTD() {
        return Other_CTD;
    }

    public void setOther_CTD(boolean Other_CTD) {
        this.Other_CTD = Other_CTD;
    }

    public boolean isSpA() {
        return spA;
    }

    public void setSpA(boolean spA) {
        this.spA = spA;
    }

    public boolean isA_s() {
        return a_s;
    }

    public void setA_s(boolean a_s) {
        this.a_s = a_s;
    }

    public boolean isAxial() {
        return axial;
    }

    public void setAxial(boolean axial) {
        this.axial = axial;
    }

    public boolean isPeripheral() {
        return peripheral;
    }

    public void setPeripheral(boolean peripheral) {
        this.peripheral = peripheral;
    }

    public boolean isMixed_Axial_and_Peripheral() {
        return mixed_Axial_and_Peripheral;
    }

    public void setMixed_Axial_and_Peripheral(boolean mixed_Axial_and_Peripheral) {
        this.mixed_Axial_and_Peripheral = mixed_Axial_and_Peripheral;
    }

    public boolean isReactive() {
        return reactive;
    }

    public void setReactive(boolean reactive) {
        this.reactive = reactive;
    }

    public boolean isPsoriatic() {
        return psoriatic;
    }

    public void setPsoriatic(boolean psoriatic) {
        this.psoriatic = psoriatic;
    }

    public boolean isIbd_associated() {
        return ibd_associated;
    }

    public void setIbd_associated(boolean ibd_associated) {
        this.ibd_associated = ibd_associated;
    }

    public boolean isReiter_s() {
        return reiter_s;
    }

    public void setReiter_s(boolean reiter_s) {
        this.reiter_s = reiter_s;
    }

    public boolean isJuvenile() {
        return juvenile;
    }

    public void setJuvenile(boolean juvenile) {
        this.juvenile = juvenile;
    }

    public boolean isVasculitis() {
        return vasculitis;
    }

    public void setVasculitis(boolean vasculitis) {
        this.vasculitis = vasculitis;
    }

    public boolean isTka() {
        return tka;
    }

    public void setTka(boolean tka) {
        this.tka = tka;
    }

    public boolean isGca() {
        return gca;
    }

    public void setGca(boolean gca) {
        this.gca = gca;
    }

    public boolean isPan() {
        return pan;
    }

    public void setPan(boolean pan) {
        this.pan = pan;
    }

    public boolean isKd() {
        return kd;
    }

    public void setKd(boolean kd) {
        this.kd = kd;
    }

    public boolean isAav() {
        return aav;
    }

    public void setAav(boolean aav) {
        this.aav = aav;
    }

    public boolean isMpa() {
        return mpa;
    }

    public void setMpa(boolean mpa) {
        this.mpa = mpa;
    }

    public boolean isGpa_WG() {
        return gpa_WG;
    }

    public void setGpa_WG(boolean gpa_WG) {
        this.gpa_WG = gpa_WG;
    }

    public boolean isEgpa_CSS() {
        return egpa_CSS;
    }

    public void setEgpa_CSS(boolean egpa_CSS) {
        this.egpa_CSS = egpa_CSS;
    }

    public boolean isAnti_GBM_GPS() {
        return anti_GBM_GPS;
    }

    public void setAnti_GBM_GPS(boolean anti_GBM_GPS) {
        this.anti_GBM_GPS = anti_GBM_GPS;
    }

    public boolean isCv() {
        return cv;
    }

    public void setCv(boolean cv) {
        this.cv = cv;
    }

    public boolean isIga_HSP() {
        return iga_HSP;
    }

    public void setIga_HSP(boolean iga_HSP) {
        this.iga_HSP = iga_HSP;
    }

    public boolean isHuv() {
        return huv;
    }

    public void setHuv(boolean huv) {
        this.huv = huv;
    }

    public boolean isBd() {
        return bd;
    }

    public void setBd(boolean bd) {
        this.bd = bd;
    }

    public boolean isOther_Vasculitis() {
        return other_Vasculitis;
    }

    public void setOther_Vasculitis(boolean other_Vasculitis) {
        this.other_Vasculitis = other_Vasculitis;
    }

    public boolean isSoft_Tissue_Diseases() {
        return soft_Tissue_Diseases;
    }

    public void setSoft_Tissue_Diseases(boolean soft_Tissue_Diseases) {
        this.soft_Tissue_Diseases = soft_Tissue_Diseases;
    }

    public boolean isFibromyalgia() {
        return fibromyalgia;
    }

    public void setFibromyalgia(boolean fibromyalgia) {
        this.fibromyalgia = fibromyalgia;
    }

    public boolean isBt() {
        return bt;
    }

    public void setBt(boolean bt) {
        this.bt = bt;
    }

    public boolean isAdhesive_Capsulitis() {
        return adhesive_Capsulitis;
    }

    public void setAdhesive_Capsulitis(boolean adhesive_Capsulitis) {
        this.adhesive_Capsulitis = adhesive_Capsulitis;
    }

    public boolean isOther_SJ_Ds() {
        return other_SJ_Ds;
    }

    public void setOther_SJ_Ds(boolean other_SJ_Ds) {
        this.other_SJ_Ds = other_SJ_Ds;
    }

    public boolean isTe() {
        return te;
    }

    public void setTe(boolean te) {
        this.te = te;
    }

    public boolean isGe1() {
        return ge1;
    }

    public void setGe1(boolean ge1) {
        this.ge1 = ge1;
    }

    public boolean isDqts() {
        return dqts;
    }

    public void setDqts(boolean dqts) {
        this.dqts = dqts;
    }

    public boolean isUlna_Styloid() {
        return ulna_Styloid;
    }

    public void setUlna_Styloid(boolean ulna_Styloid) {
        this.ulna_Styloid = ulna_Styloid;
    }

    public boolean isPf() {
        return pf;
    }

    public void setPf(boolean pf) {
        this.pf = pf;
    }

    public boolean isAchilles_Tendinitis() {
        return achilles_Tendinitis;
    }

    public void setAchilles_Tendinitis(boolean achilles_Tendinitis) {
        this.achilles_Tendinitis = achilles_Tendinitis;
    }

    public boolean isMetatarsalgia() {
        return metatarsalgia;
    }

    public void setMetatarsalgia(boolean metatarsalgia) {
        this.metatarsalgia = metatarsalgia;
    }

    public boolean isRegional_Pain_Syndromes() {
        return regional_Pain_Syndromes;
    }

    public void setRegional_Pain_Syndromes(boolean regional_Pain_Syndromes) {
        this.regional_Pain_Syndromes = regional_Pain_Syndromes;
    }

    public boolean isBackache() {
        return backache;
    }

    public void setBackache(boolean backache) {
        this.backache = backache;
    }

    public boolean isNeck_Pain() {
        return neck_Pain;
    }

    public void setNeck_Pain(boolean neck_Pain) {
        this.neck_Pain = neck_Pain;
    }

    public boolean isOther_Regional_Pain_Syndromes() {
        return other_Regional_Pain_Syndromes;
    }

    public void setOther_Regional_Pain_Syndromes(boolean other_Regional_Pain_Syndromes) {
        this.other_Regional_Pain_Syndromes = other_Regional_Pain_Syndromes;
    }

    public boolean isOther_std() {
        return other_std;
    }

    public void setOther_std(boolean other_std) {
        this.other_std = other_std;
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

}
   

