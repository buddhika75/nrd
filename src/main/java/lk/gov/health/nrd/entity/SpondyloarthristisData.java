/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gov.health.nrd.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import lk.gov.health.nrd.enums.CRPunits;

/**
 *
 * @author User
 */

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class SpondyloarthristisData extends Encounter {

private String cbp;
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
        
private String xray;    
private String hla_b27;
private String mri;
private boolean diagnosisSpA;
private boolean diagnosisAxialSpA;
private boolean diagnosisPeripheralSpA;
private boolean diagnosisOther;
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






    public boolean isDiagnosisSpA() {
        return diagnosisSpA;
    }

    public void setDiagnosisSpA(boolean diagnosisSpA) {
        this.diagnosisSpA = diagnosisSpA;
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

    public boolean isDiagnosisOther() {
        return diagnosisOther;
    }

    public void setDiagnosisOther(boolean diagnosisOther) {
        this.diagnosisOther = diagnosisOther;
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

    public String getXray() {
        return xray;
    }

    public void setXray(String xray) {
        this.xray = xray;
    }

    public String getHla_b27() {
        return hla_b27;
    }

    public void setHla_b27(String hla_b27) {
        this.hla_b27 = hla_b27;
    }

    public String getMri() {
        return mri;
    }

    public void setMri(String mri) {
        this.mri = mri;
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

    public String getCbp() {
        return cbp;
    }

    public void setCbp(String cbp) {
        this.cbp = cbp;
    }

    
}
