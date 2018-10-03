/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gov.health.nrd.entity;

import java.util.Date;
import java.util.List;
import javax.faces.model.SelectItem;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import lk.gov.health.nrd.enums.CRPunits;
import lk.gov.health.nrd.enums.PositiveNegative;

/**
 *
 * @author User
 */

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class SpondyloarthristisData extends Encounter {

@Enumerated(EnumType.STRING)
private PositiveNegative xrayPN;
private PositiveNegative hlaPN;
private String cbpConfirm;
private String hlbConfirm;
private boolean ibp;
private boolean abp;
private boolean grtn;
private boolean pa;
private boolean enthesitis;
private boolean dactylitis;
private boolean psoriasis;
private boolean ibd;
private boolean uveitis;
private boolean eapr;
private boolean pi;
private boolean pfh;
private boolean sacroiliitis;
private boolean uorcorADO;
private int asastotal;
private String asasconfirm;
private String peripheralspaconfirm;
private boolean diagnosisAxialSpA;
private boolean diagnosisPeripheralSpA;
private String otherDiagnosis;
private boolean ankylosingSp;
private boolean PsoriaticA;
private boolean ibdassociatedSpA;
private boolean reactiveA;
private boolean undifferentiatedSpA;
private String otherTypeofSpA;
private int basdaiFatigue;
private int basdaiSpinalPain;
private int basdaiPeripheralArthritis;
private int basdaiEnthesitis;
private int basdaiMorningStiffnessIntensity;
private double basdaiMorningStiffnessDuration;
private double basdaiCalculatedScore;
private String basdaiClassified;
private int asdasSpinalPain;
private int asdasPeripheralArthritis;
private double asdasMorningStiffnessDuration;
private int asdasPatientGlobalAssessmennt;
private double asdasEsr;
private double asdasCrp;
private double asdasEsrScore;
private double asdasCrpScore;
private String asdasEsrScoreReference;
private String asdasCrpScoreReference;
@Enumerated(EnumType.STRING)
private CRPunits unitofCRP;

    public PositiveNegative getXrayPN() {
        return xrayPN;
    }

    public void setXrayPN(PositiveNegative xrayPN) {
        this.xrayPN = xrayPN;
    }

    public PositiveNegative getHlaPN() {
        return hlaPN;
    }

    public void setHlaPN(PositiveNegative hlaPN) {
        this.hlaPN = hlaPN;
    }

    public String getHlbConfirm() {
        return hlbConfirm;
    }

    public void setHlbConfirm(String hlbConfirm) {
        this.hlbConfirm = hlbConfirm;
    }


    public String getPeripheralspaconfirm() {
        return peripheralspaconfirm;
    }

    public void setPeripheralspaconfirm(String peripheralspaconfirm) {
        this.peripheralspaconfirm = peripheralspaconfirm;
    }



    

    public String getCbpConfirm() {
        return cbpConfirm;
    }

    public void setCbpConfirm(String cbpConfirm) {
        this.cbpConfirm = cbpConfirm;
    }










    public boolean isDiagnosisAxialSpA() {
        return diagnosisAxialSpA;
    }

    public void setDiagnosisAxialSpA(boolean diagnosisAxialSpA) {
        this.diagnosisAxialSpA = diagnosisAxialSpA;
    }

    public boolean isDiagnosisPeripheralSpA() {
        return diagnosisPeripheralSpA;
    }

    public void setDiagnosisPeripheralSpA(boolean diagnosisPeripheralSpA) {
        this.diagnosisPeripheralSpA = diagnosisPeripheralSpA;
    }

    

    public int getBasdaiFatigue() {
        return basdaiFatigue;
    }

    public void setBasdaiFatigue(int basdaiFatigue) {
        this.basdaiFatigue = basdaiFatigue;
    }

    public int getBasdaiSpinalPain() {
        return basdaiSpinalPain;
    }

    public void setBasdaiSpinalPain(int basdaiSpinalPain) {
        this.basdaiSpinalPain = basdaiSpinalPain;
    }

    public int getBasdaiPeripheralArthritis() {
        return basdaiPeripheralArthritis;
    }

    public void setBasdaiPeripheralArthritis(int basdaiPeripheralArthritis) {
        this.basdaiPeripheralArthritis = basdaiPeripheralArthritis;
    }

    public int getBasdaiEnthesitis() {
        return basdaiEnthesitis;
    }

    public void setBasdaiEnthesitis(int basdaiEnthesitis) {
        this.basdaiEnthesitis = basdaiEnthesitis;
    }

    public int getBasdaiMorningStiffnessIntensity() {
        return basdaiMorningStiffnessIntensity;
    }

    public void setBasdaiMorningStiffnessIntensity(int basdaiMorningStiffnessIntensity) {
        this.basdaiMorningStiffnessIntensity = basdaiMorningStiffnessIntensity;
    }

    public double getBasdaiMorningStiffnessDuration() {
        return basdaiMorningStiffnessDuration;
    }

    public void setBasdaiMorningStiffnessDuration(double basdaiMorningStiffnessDuration) {
        this.basdaiMorningStiffnessDuration = basdaiMorningStiffnessDuration;
    }

    public double getBasdaiCalculatedScore() {
        return basdaiCalculatedScore;
    }

    public void setBasdaiCalculatedScore(double basdaiCalculatedScore) {
        this.basdaiCalculatedScore = basdaiCalculatedScore;
    }

    public String getBasdaiClassified() {
        return basdaiClassified;
    }

    public void setBasdaiClassified(String basdaiClassified) {
        this.basdaiClassified = basdaiClassified;
    }

    public int getAsdasSpinalPain() {
        return asdasSpinalPain;
    }

    public void setAsdasSpinalPain(int asdasSpinalPain) {
        this.asdasSpinalPain = asdasSpinalPain;
    }

    public int getAsdasPeripheralArthritis() {
        return asdasPeripheralArthritis;
    }

    public void setAsdasPeripheralArthritis(int asdasPeripheralArthritis) {
        this.asdasPeripheralArthritis = asdasPeripheralArthritis;
    }

    public double getAsdasMorningStiffnessDuration() {
        return asdasMorningStiffnessDuration;
    }

    public void setAsdasMorningStiffnessDuration(double asdasMorningStiffnessDuration) {
        this.asdasMorningStiffnessDuration = asdasMorningStiffnessDuration;
    }

    public int getAsdasPatientGlobalAssessmennt() {
        return asdasPatientGlobalAssessmennt;
    }

    public void setAsdasPatientGlobalAssessmennt(int asdasPatientGlobalAssessmennt) {
        this.asdasPatientGlobalAssessmennt = asdasPatientGlobalAssessmennt;
    }

    public double getAsdasEsr() {
        return asdasEsr;
    }

    public void setAsdasEsr(double asdasEsr) {
        this.asdasEsr = asdasEsr;
    }

    

    public double getAsdasCrp() {
        return asdasCrp;
    }

    public void setAsdasCrp(double asdasCrp) {
        this.asdasCrp = asdasCrp;
    }

    public double getAsdasEsrScore() {
        return asdasEsrScore;
    }

    public void setAsdasEsrScore(double asdasEsrScore) {
        this.asdasEsrScore = asdasEsrScore;
    }

    public double getAsdasCrpScore() {
        return asdasCrpScore;
    }

    public void setAsdasCrpScore(double asdasCrpScore) {
        this.asdasCrpScore = asdasCrpScore;
    }

    public String getAsdasEsrScoreReference() {
        return asdasEsrScoreReference;
    }

    public void setAsdasEsrScoreReference(String asdasEsrScoreReference) {
        this.asdasEsrScoreReference = asdasEsrScoreReference;
    }

    public CRPunits getUnitofCRP() {
        return unitofCRP;
    }

    public void setUnitofCRP(CRPunits unitofCRP) {
        this.unitofCRP = unitofCRP;
    }

    public String getAsdasCrpScoreReference() {
        return asdasCrpScoreReference;
    }

    public void setAsdasCrpScoreReference(String asdasCrpScoreReference) {
        this.asdasCrpScoreReference = asdasCrpScoreReference;
    }

    public String getOtherDiagnosis() {
        return otherDiagnosis;
    }

    public void setOtherDiagnosis(String otherDiagnosis) {
        this.otherDiagnosis = otherDiagnosis;
    }

    


    public boolean isIbp() {
        return ibp;
    }

    public void setIbp(boolean ibp) {
        this.ibp = ibp;
    }

    public boolean isAbp() {
        return abp;
    }

    public void setAbp(boolean abp) {
        this.abp = abp;
    }

    public boolean isGrtn() {
        return grtn;
    }

    public void setGrtn(boolean grtn) {
        this.grtn = grtn;
    }

    public boolean isPa() {
        return pa;
    }

    public void setPa(boolean pa) {
        this.pa = pa;
    }

    public boolean isEnthesitis() {
        return enthesitis;
    }

    public void setEnthesitis(boolean enthesitis) {
        this.enthesitis = enthesitis;
    }

    public boolean isDactylitis() {
        return dactylitis;
    }

    public void setDactylitis(boolean dactylitis) {
        this.dactylitis = dactylitis;
    }

    public boolean isPsoriasis() {
        return psoriasis;
    }

    public void setPsoriasis(boolean psoriasis) {
        this.psoriasis = psoriasis;
    }

    public boolean isIbd() {
        return ibd;
    }

    public void setIbd(boolean ibd) {
        this.ibd = ibd;
    }

    public boolean isUveitis() {
        return uveitis;
    }

    public void setUveitis(boolean uveitis) {
        this.uveitis = uveitis;
    }

    public boolean isEapr() {
        return eapr;
    }

    public void setEapr(boolean eapr) {
        this.eapr = eapr;
    }

    public boolean isPi() {
        return pi;
    }

    public void setPi(boolean pi) {
        this.pi = pi;
    }

    public boolean isPfh() {
        return pfh;
    }

    public void setPfh(boolean pfh) {
        this.pfh = pfh;
    }

    public boolean isSacroiliitis() {
        return sacroiliitis;
    }

    public void setSacroiliitis(boolean sacroiliitis) {
        this.sacroiliitis = sacroiliitis;
    }

    public boolean isUorcorADO() {
        return uorcorADO;
    }

    public void setUorcorADO(boolean uorcorADO) {
        this.uorcorADO = uorcorADO;
    }

    public int getAsastotal() {
        return asastotal;
    }

    public void setAsastotal(int asastotal) {
        this.asastotal = asastotal;
    }

   

    public boolean isAnkylosingSp() {
        return ankylosingSp;
    }

    public void setAnkylosingSp(boolean ankylosingSp) {
        this.ankylosingSp = ankylosingSp;
    }

    public boolean isPsoriaticA() {
        return PsoriaticA;
    }

    public void setPsoriaticA(boolean PsoriaticA) {
        this.PsoriaticA = PsoriaticA;
    }

    public boolean isIbdassociatedSpA() {
        return ibdassociatedSpA;
    }

    public void setIbdassociatedSpA(boolean ibdassociatedSpA) {
        this.ibdassociatedSpA = ibdassociatedSpA;
    }

    public boolean isReactiveA() {
        return reactiveA;
    }

    public void setReactiveA(boolean reactiveA) {
        this.reactiveA = reactiveA;
    }

    public boolean isUndifferentiatedSpA() {
        return undifferentiatedSpA;
    }

    public void setUndifferentiatedSpA(boolean undifferentiatedSpA) {
        this.undifferentiatedSpA = undifferentiatedSpA;
    }

    public String getOtherTypeofSpA() {
        return otherTypeofSpA;
    }

    public void setOtherTypeofSpA(String otherTypeofSpA) {
        this.otherTypeofSpA = otherTypeofSpA;
    }

    
    
   
    public String getAsasconfirm() {
        return asasconfirm;
    }

    public void setAsasconfirm(String asasconfirm) {
        this.asasconfirm = asasconfirm;
    }

    
    
 
}
