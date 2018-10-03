/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gov.health.nrd.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import lk.gov.health.nrd.enums.JointInvolvement;
import lk.gov.health.nrd.enums.Serology;
import lk.gov.health.nrd.enums.AcutePhaseReactants;
import lk.gov.health.nrd.enums.DoseUnitAndFrequency;
import lk.gov.health.nrd.enums.DurationOfSymptoms;
import lk.gov.health.nrd.enums.CRPunits;
import lk.gov.health.nrd.enums.SSZDoseUnitAndFrequency;
import lk.gov.health.nrd.enums.EsrCrp;
import lk.gov.health.nrd.enums.SteroidsType;

/**
 *
 * @author User
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class RheumatoidArthritisData extends Encounter {

    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateOfEsr;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateOfCRP;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateOfRF;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateOfACPA;

    private boolean ll1Sj;
    private boolean ll2Ej;
    private boolean ll3Wj;
    private boolean ls4Mcp1;
    private boolean ls5Mcp2;
    private boolean ls6Mcp3;
    private boolean ls7Mcp4;
    private boolean ls8Mcp5;
    private boolean ls9ThumbIp;
    private boolean ls10Pip2;
    private boolean ls11Pip3;
    private boolean ls12Pip4;
    private boolean ls13Pip5;
    private boolean ll14Hj;
    private boolean ll15Kj;
    private boolean ll16Aj;
    private boolean ls17Mtp2;
    private boolean ls18Mtp3;
    private boolean ls19Mtp4;
    private boolean ls20Mtp5;
    
    private boolean rl21Sj;
    private boolean rl22Ej;
    private boolean rl23Wj;
    private boolean rs24Mcp1;
    private boolean rs25Mcp2;
    private boolean rs26Mcp3;
    private boolean rs27Mcp4;
    private boolean rs28Mcp5;
    private boolean rs29ThumbIP;
    private boolean rs30Pip2;
    private boolean rs31Pip3;
    private boolean rs32Pip4;
    private boolean rs33Pip5;
    private boolean rl34Hj;
    private boolean rl35Kj;
    private boolean rl36Aj;
    private boolean rs37Mtp2;
    private boolean rs38Mtp3;
    private boolean rs39Mtp4;
    private boolean rs40Mtp5;
    
   
    private boolean llTj1Sj;
    private boolean llTj2Ej;
    private boolean llTj3Wj;
    private boolean lsTj4Mcp1;
    private boolean lsTj5Mcp2;
    private boolean lsTj6Mcp3;
    private boolean lsTj7Mcp4;
    private boolean lsTj8Mcp5;
    private boolean lsTj9ThumbIp;
    private boolean lsTj10Pip2;
    private boolean lsTj11Pip3;
    private boolean lsTj12Pip4;
    private boolean lsTj13Pip5;
    private boolean llTj14Hj;
    private boolean llTj15Kj;
    private boolean llTJ16AJ;
    private boolean lsTj17Mtp2;
    private boolean lsTj18Mtp3;
    private boolean lsTj19Mtp4;
    private boolean lsTj20Mtp5;
    
    private boolean rlTj21Sj;
    private boolean rlTj22Ej;
    private boolean rlTj23Wj;
    private boolean rsTj24Mcp1;
    private boolean rsTj25Mcp2;
    private boolean rsTj26Mcp3;
    private boolean rsTj27Mcp4;
    private boolean rsTj28Mcp5;
    private boolean rsTj29ThumbIp;
    private boolean rsTj30Pip2;
    private boolean rsTj31Pip3;
    private boolean rsTj32Pip4;
    private boolean rsTj33Pip5;
    private boolean rlTj34Hj;
    private boolean rlTj35Kj;
    private boolean rlTj36Aj;
    private boolean rsTj37Mtp2;
    private boolean rsTj38Mtp3;
    private boolean rsTj39Mtp4;
    private boolean rsTj40Mtp5;
    
    private boolean laj41Tmj;
    private boolean laj42Acc;
    private boolean laj43Stc;
    private boolean raj44Tmj;
    private boolean raj45Acc;
    private boolean raj46Stc;
    
    private boolean lajTj41Tmj;
    private boolean lajTj42Acc;
    private boolean lajTj43Stc;
    private boolean rajTj44Tmj;
    private boolean rajTj45Acc;
    private boolean rajTj46Stc;
    

    @Enumerated(EnumType.STRING)
    private JointInvolvement jointInvolvement;
    @Enumerated(EnumType.STRING)
    private Serology serology;
    @Enumerated(EnumType.STRING)
    private AcutePhaseReactants acutePhaseReactants;
    @Enumerated(EnumType.STRING)
    private DurationOfSymptoms durationOfSymptoms;
    private int jointInvolvementCal;
    private int serologyCal;
    private int AcutephaseReactantsCal;
    private int durationOfSymptomsCal;
    
    private int negativeRfandNegativeAcpaSerology;
    private int lowPositiveRforLowPositiveAcpaSerology;
    private int highPositiveRforhighPositiveAcpaSerology;
    private int nomalCrpandNomalEsrAcutephaseReactants;
    private int abnormalCrporAbnormalEsrAcutePhaseReactants;
    private int durationOfSymptomsIsLessThanSixWeeks;
    private int durationOfSymptomsIsGreaterThanSixWeek;
    
    
    private int totalScore;
    private int tenderJointCountDAS;
    private int swollenJointCountDAS;
    private int patientGlobalHealthDAS;
    private double calculatedScoreDAS;
    private double esrValue;
    private double crpValue;
    private double rfValue;
    private double acpaValue;
    private boolean polyarticularPresentationPoorPrognosticFactors;
    private boolean rfPositivePoorPrognosticFactors;
    private boolean antiCPAPositivePoorPrognosticFactors;
    private boolean erosionsInXrayPoorPrognosticFactors;
    private double mtxInitialDrugTherapy;
    private double sszInitialDrugTherapy;
    private int lefInitialDrugTherapy;
    private int hcqInitialDrugTherapy;
    private int steroidsInitialDrugTherapy;
    @Enumerated(EnumType.STRING)
    private DoseUnitAndFrequency doseUnitAndFrequencyOfsteroidsInitialDrugTherapy;
    private int Unit;
    @Enumerated(EnumType.STRING)
    private CRPunits unitofCRP;
    @Enumerated(EnumType.STRING)
    private SSZDoseUnitAndFrequency unitofSSZ;
    private double sdaiRemissionSDAICDAI;
    private double cdaiRemissionSDAICDAI;
    private int tenderJointCountSDAICDAI;
    private int swellenJointCountSDAICDAI;
    private int patientGlobalAssessmentSDAICDAI;
    private int evaluatorGlobalAssessmentSDAICDAI;
    private double crpSDAICDAI;
    private int totalScoreTargetPopulation;
    private String totalDiognosis;
    @Enumerated(EnumType.STRING)
    private EsrCrp EsrCrp;
    private double resultOfEsrCrp;
    private String confirmDAS;
    private String sdaireference;
    private String cdaireference;
    @Enumerated(EnumType.STRING)
    private SteroidsType SteroidsType;
    
    
    

    public Date getDateOfEsr() {
        return dateOfEsr;
    }

    public void setDateOfEsr(Date dateOfEsr) {
        this.dateOfEsr = dateOfEsr;
    }

    public Date getDateOfCRP() {
        return dateOfCRP;
    }

    public void setDateOfCRP(Date dateOfCRP) {
        this.dateOfCRP = dateOfCRP;
    }

    public Date getDateOfRF() {
        return dateOfRF;
    }

    public void setDateOfRF(Date dateOfRF) {
        this.dateOfRF = dateOfRF;
    }

    public Date getDateOfACPA() {
        return dateOfACPA;
    }

    public void setDateOfACPA(Date dateOfACPA) {
        this.dateOfACPA = dateOfACPA;
    }

    
    
    
    
    public boolean isLl1Sj() {
        return ll1Sj;
    }

    public void setLl1Sj(boolean ll1Sj) {
        this.ll1Sj = ll1Sj;
    }

    public boolean isLl2Ej() {
        return ll2Ej;
    }

    public void setLl2Ej(boolean ll2Ej) {
        this.ll2Ej = ll2Ej;
    }

    public boolean isLl3Wj() {
        return ll3Wj;
    }

    public void setLl3Wj(boolean ll3Wj) {
        this.ll3Wj = ll3Wj;
    }

    public boolean isLs4Mcp1() {
        return ls4Mcp1;
    }

    public void setLs4Mcp1(boolean ls4Mcp1) {
        this.ls4Mcp1 = ls4Mcp1;
    }

    public boolean isLs5Mcp2() {
        return ls5Mcp2;
    }

    public void setLs5Mcp2(boolean ls5Mcp2) {
        this.ls5Mcp2 = ls5Mcp2;
    }

    public boolean isLs6Mcp3() {
        return ls6Mcp3;
    }

    public void setLs6Mcp3(boolean ls6Mcp3) {
        this.ls6Mcp3 = ls6Mcp3;
    }

    public boolean isLs7Mcp4() {
        return ls7Mcp4;
    }

    public void setLs7Mcp4(boolean ls7Mcp4) {
        this.ls7Mcp4 = ls7Mcp4;
    }

    public boolean isLs8Mcp5() {
        return ls8Mcp5;
    }

    public void setLs8Mcp5(boolean ls8Mcp5) {
        this.ls8Mcp5 = ls8Mcp5;
    }

    public boolean isLs9ThumbIp() {
        return ls9ThumbIp;
    }

    public void setLs9ThumbIp(boolean ls9ThumbIp) {
        this.ls9ThumbIp = ls9ThumbIp;
    }

    public boolean isLs10Pip2() {
        return ls10Pip2;
    }

    public void setLs10Pip2(boolean ls10Pip2) {
        this.ls10Pip2 = ls10Pip2;
    }

    public boolean isLs11Pip3() {
        return ls11Pip3;
    }

    public void setLs11Pip3(boolean ls11Pip3) {
        this.ls11Pip3 = ls11Pip3;
    }

    public boolean isLs12Pip4() {
        return ls12Pip4;
    }

    public void setLs12Pip4(boolean ls12Pip4) {
        this.ls12Pip4 = ls12Pip4;
    }

    public boolean isLs13Pip5() {
        return ls13Pip5;
    }

    public void setLs13Pip5(boolean ls13Pip5) {
        this.ls13Pip5 = ls13Pip5;
    }

    public boolean isLl14Hj() {
        return ll14Hj;
    }

    public void setLl14Hj(boolean ll14Hj) {
        this.ll14Hj = ll14Hj;
    }

    public boolean isLl15Kj() {
        return ll15Kj;
    }

    public void setLl15Kj(boolean ll15Kj) {
        this.ll15Kj = ll15Kj;
    }

    public boolean isLl16Aj() {
        return ll16Aj;
    }

    public void setLl16Aj(boolean ll16Aj) {
        this.ll16Aj = ll16Aj;
    }

    public boolean isLs17Mtp2() {
        return ls17Mtp2;
    }

    public void setLs17Mtp2(boolean ls17Mtp2) {
        this.ls17Mtp2 = ls17Mtp2;
    }

    public boolean isLs18Mtp3() {
        return ls18Mtp3;
    }

    public void setLs18Mtp3(boolean ls18Mtp3) {
        this.ls18Mtp3 = ls18Mtp3;
    }

    public boolean isLs19Mtp4() {
        return ls19Mtp4;
    }

    public void setLs19Mtp4(boolean ls19Mtp4) {
        this.ls19Mtp4 = ls19Mtp4;
    }

    public boolean isLs20Mtp5() {
        return ls20Mtp5;
    }

    public void setLs20Mtp5(boolean ls20Mtp5) {
        this.ls20Mtp5 = ls20Mtp5;
    }

    public boolean isRl21Sj() {
        return rl21Sj;
    }

    public void setRl21Sj(boolean rl21Sj) {
        this.rl21Sj = rl21Sj;
    }

    public boolean isRl22Ej() {
        return rl22Ej;
    }

    public void setRl22Ej(boolean rl22Ej) {
        this.rl22Ej = rl22Ej;
    }

    public boolean isRl23Wj() {
        return rl23Wj;
    }

    public void setRl23Wj(boolean rl23Wj) {
        this.rl23Wj = rl23Wj;
    }

    public boolean isRs24Mcp1() {
        return rs24Mcp1;
    }

    public void setRs24Mcp1(boolean rs24Mcp1) {
        this.rs24Mcp1 = rs24Mcp1;
    }

    public boolean isRs25Mcp2() {
        return rs25Mcp2;
    }

    public void setRs25Mcp2(boolean rs25Mcp2) {
        this.rs25Mcp2 = rs25Mcp2;
    }

    public boolean isRs26Mcp3() {
        return rs26Mcp3;
    }

    public void setRs26Mcp3(boolean rs26Mcp3) {
        this.rs26Mcp3 = rs26Mcp3;
    }

    public boolean isRs27Mcp4() {
        return rs27Mcp4;
    }

    public void setRs27Mcp4(boolean rs27Mcp4) {
        this.rs27Mcp4 = rs27Mcp4;
    }

    public boolean isRs28Mcp5() {
        return rs28Mcp5;
    }

    public void setRs28Mcp5(boolean rs28Mcp5) {
        this.rs28Mcp5 = rs28Mcp5;
    }

    public boolean isRs29ThumbIP() {
        return rs29ThumbIP;
    }

    public void setRs29ThumbIP(boolean rs29ThumbIP) {
        this.rs29ThumbIP = rs29ThumbIP;
    }

    public boolean isRs30Pip2() {
        return rs30Pip2;
    }

    public void setRs30Pip2(boolean rs30Pip2) {
        this.rs30Pip2 = rs30Pip2;
    }

    public boolean isRs31Pip3() {
        return rs31Pip3;
    }

    public void setRs31Pip3(boolean rs31Pip3) {
        this.rs31Pip3 = rs31Pip3;
    }

    public boolean isRs32Pip4() {
        return rs32Pip4;
    }

    public void setRs32Pip4(boolean rs32Pip4) {
        this.rs32Pip4 = rs32Pip4;
    }

    public boolean isRs33Pip5() {
        return rs33Pip5;
    }

    public void setRs33Pip5(boolean rs33Pip5) {
        this.rs33Pip5 = rs33Pip5;
    }

    public boolean isRl34Hj() {
        return rl34Hj;
    }

    public void setRl34Hj(boolean rl34Hj) {
        this.rl34Hj = rl34Hj;
    }

    public boolean isRl35Kj() {
        return rl35Kj;
    }

    public void setRl35Kj(boolean rl35Kj) {
        this.rl35Kj = rl35Kj;
    }

    public boolean isRl36Aj() {
        return rl36Aj;
    }

    public void setRl36Aj(boolean rl36Aj) {
        this.rl36Aj = rl36Aj;
    }

    public boolean isRs37Mtp2() {
        return rs37Mtp2;
    }

    public void setRs37Mtp2(boolean rs37Mtp2) {
        this.rs37Mtp2 = rs37Mtp2;
    }

    public boolean isRs38Mtp3() {
        return rs38Mtp3;
    }

    public void setRs38Mtp3(boolean rs38Mtp3) {
        this.rs38Mtp3 = rs38Mtp3;
    }

    public boolean isRs39Mtp4() {
        return rs39Mtp4;
    }

    public void setRs39Mtp4(boolean rs39Mtp4) {
        this.rs39Mtp4 = rs39Mtp4;
    }

    public boolean isRs40Mtp5() {
        return rs40Mtp5;
    }

    public void setRs40Mtp5(boolean rs40Mtp5) {
        this.rs40Mtp5 = rs40Mtp5;
    }

    public boolean isLlTj1Sj() {
        return llTj1Sj;
    }

    public void setLlTj1Sj(boolean llTj1Sj) {
        this.llTj1Sj = llTj1Sj;
    }

    public boolean isLlTj2Ej() {
        return llTj2Ej;
    }

    public void setLlTj2Ej(boolean llTj2Ej) {
        this.llTj2Ej = llTj2Ej;
    }

    public boolean isLlTj3Wj() {
        return llTj3Wj;
    }

    public void setLlTj3Wj(boolean llTj3Wj) {
        this.llTj3Wj = llTj3Wj;
    }

    public boolean isLsTj4Mcp1() {
        return lsTj4Mcp1;
    }

    public void setLsTj4Mcp1(boolean lsTj4Mcp1) {
        this.lsTj4Mcp1 = lsTj4Mcp1;
    }

    public boolean isLsTj5Mcp2() {
        return lsTj5Mcp2;
    }

    public void setLsTj5Mcp2(boolean lsTj5Mcp2) {
        this.lsTj5Mcp2 = lsTj5Mcp2;
    }

    public boolean isLsTj6Mcp3() {
        return lsTj6Mcp3;
    }

    public void setLsTj6Mcp3(boolean lsTj6Mcp3) {
        this.lsTj6Mcp3 = lsTj6Mcp3;
    }

    public boolean isLsTj7Mcp4() {
        return lsTj7Mcp4;
    }

    public void setLsTj7Mcp4(boolean lsTj7Mcp4) {
        this.lsTj7Mcp4 = lsTj7Mcp4;
    }

    public boolean isLsTj8Mcp5() {
        return lsTj8Mcp5;
    }

    public void setLsTj8Mcp5(boolean lsTj8Mcp5) {
        this.lsTj8Mcp5 = lsTj8Mcp5;
    }

    public boolean isLsTj9ThumbIp() {
        return lsTj9ThumbIp;
    }

    public void setLsTj9ThumbIp(boolean lsTj9ThumbIp) {
        this.lsTj9ThumbIp = lsTj9ThumbIp;
    }

    public boolean isLsTj10Pip2() {
        return lsTj10Pip2;
    }

    public void setLsTj10Pip2(boolean lsTj10Pip2) {
        this.lsTj10Pip2 = lsTj10Pip2;
    }

    public boolean isLsTj11Pip3() {
        return lsTj11Pip3;
    }

    public void setLsTj11Pip3(boolean lsTj11Pip3) {
        this.lsTj11Pip3 = lsTj11Pip3;
    }

    public boolean isLsTj12Pip4() {
        return lsTj12Pip4;
    }

    public void setLsTj12Pip4(boolean lsTj12Pip4) {
        this.lsTj12Pip4 = lsTj12Pip4;
    }

    public boolean isLsTj13Pip5() {
        return lsTj13Pip5;
    }

    public void setLsTj13Pip5(boolean lsTj13Pip5) {
        this.lsTj13Pip5 = lsTj13Pip5;
    }

    public boolean isLlTj14Hj() {
        return llTj14Hj;
    }

    public void setLlTj14Hj(boolean llTj14Hj) {
        this.llTj14Hj = llTj14Hj;
    }

    public boolean isLlTj15Kj() {
        return llTj15Kj;
    }

    public void setLlTj15Kj(boolean llTj15Kj) {
        this.llTj15Kj = llTj15Kj;
    }

    public boolean isLlTJ16AJ() {
        return llTJ16AJ;
    }

    public void setLlTJ16AJ(boolean llTJ16AJ) {
        this.llTJ16AJ = llTJ16AJ;
    }

    public boolean isLsTj17Mtp2() {
        return lsTj17Mtp2;
    }

    public void setLsTj17Mtp2(boolean lsTj17Mtp2) {
        this.lsTj17Mtp2 = lsTj17Mtp2;
    }

    public boolean isLsTj18Mtp3() {
        return lsTj18Mtp3;
    }

    public void setLsTj18Mtp3(boolean lsTj18Mtp3) {
        this.lsTj18Mtp3 = lsTj18Mtp3;
    }

    public boolean isLsTj19Mtp4() {
        return lsTj19Mtp4;
    }

    public void setLsTj19Mtp4(boolean lsTj19Mtp4) {
        this.lsTj19Mtp4 = lsTj19Mtp4;
    }

    public boolean isLsTj20Mtp5() {
        return lsTj20Mtp5;
    }

    public void setLsTj20Mtp5(boolean lsTj20Mtp5) {
        this.lsTj20Mtp5 = lsTj20Mtp5;
    }

    public boolean isRlTj21Sj() {
        return rlTj21Sj;
    }

    public void setRlTj21Sj(boolean rlTj21Sj) {
        this.rlTj21Sj = rlTj21Sj;
    }

    public boolean isRlTj22Ej() {
        return rlTj22Ej;
    }

    public void setRlTj22Ej(boolean rlTj22Ej) {
        this.rlTj22Ej = rlTj22Ej;
    }

    public boolean isRlTj23Wj() {
        return rlTj23Wj;
    }

    public void setRlTj23Wj(boolean rlTj23Wj) {
        this.rlTj23Wj = rlTj23Wj;
    }

    public boolean isRsTj24Mcp1() {
        return rsTj24Mcp1;
    }

    public void setRsTj24Mcp1(boolean rsTj24Mcp1) {
        this.rsTj24Mcp1 = rsTj24Mcp1;
    }

    public boolean isRsTj25Mcp2() {
        return rsTj25Mcp2;
    }

    public void setRsTj25Mcp2(boolean rsTj25Mcp2) {
        this.rsTj25Mcp2 = rsTj25Mcp2;
    }

    public boolean isRsTj26Mcp3() {
        return rsTj26Mcp3;
    }

    public void setRsTj26Mcp3(boolean rsTj26Mcp3) {
        this.rsTj26Mcp3 = rsTj26Mcp3;
    }

    public boolean isRsTj27Mcp4() {
        return rsTj27Mcp4;
    }

    public void setRsTj27Mcp4(boolean rsTj27Mcp4) {
        this.rsTj27Mcp4 = rsTj27Mcp4;
    }

    public boolean isRsTj28Mcp5() {
        return rsTj28Mcp5;
    }

    public void setRsTj28Mcp5(boolean rsTj28Mcp5) {
        this.rsTj28Mcp5 = rsTj28Mcp5;
    }

    public boolean isRsTj29ThumbIp() {
        return rsTj29ThumbIp;
    }

    public void setRsTj29ThumbIp(boolean rsTj29ThumbIp) {
        this.rsTj29ThumbIp = rsTj29ThumbIp;
    }

    public boolean isRsTj30Pip2() {
        return rsTj30Pip2;
    }

    public void setRsTj30Pip2(boolean rsTj30Pip2) {
        this.rsTj30Pip2 = rsTj30Pip2;
    }

    public boolean isRsTj31Pip3() {
        return rsTj31Pip3;
    }

    public void setRsTj31Pip3(boolean rsTj31Pip3) {
        this.rsTj31Pip3 = rsTj31Pip3;
    }

    public boolean isRsTj32Pip4() {
        return rsTj32Pip4;
    }

    public void setRsTj32Pip4(boolean rsTj32Pip4) {
        this.rsTj32Pip4 = rsTj32Pip4;
    }

    public boolean isRsTj33Pip5() {
        return rsTj33Pip5;
    }

    public void setRsTj33Pip5(boolean rsTj33Pip5) {
        this.rsTj33Pip5 = rsTj33Pip5;
    }

    public boolean isRlTj34Hj() {
        return rlTj34Hj;
    }

    public void setRlTj34Hj(boolean rlTj34Hj) {
        this.rlTj34Hj = rlTj34Hj;
    }

    public boolean isRlTj35Kj() {
        return rlTj35Kj;
    }

    public void setRlTj35Kj(boolean rlTj35Kj) {
        this.rlTj35Kj = rlTj35Kj;
    }

    public boolean isRlTj36Aj() {
        return rlTj36Aj;
    }

    public void setRlTj36Aj(boolean rlTj36Aj) {
        this.rlTj36Aj = rlTj36Aj;
    }

    public boolean isRsTj37Mtp2() {
        return rsTj37Mtp2;
    }

    public void setRsTj37Mtp2(boolean rsTj37Mtp2) {
        this.rsTj37Mtp2 = rsTj37Mtp2;
    }

    public boolean isRsTj38Mtp3() {
        return rsTj38Mtp3;
    }

    public void setRsTj38Mtp3(boolean rsTj38Mtp3) {
        this.rsTj38Mtp3 = rsTj38Mtp3;
    }

    public boolean isRsTj39Mtp4() {
        return rsTj39Mtp4;
    }

    public void setRsTj39Mtp4(boolean rsTj39Mtp4) {
        this.rsTj39Mtp4 = rsTj39Mtp4;
    }

    public boolean isRsTj40Mtp5() {
        return rsTj40Mtp5;
    }

    public void setRsTj40Mtp5(boolean rsTj40Mtp5) {
        this.rsTj40Mtp5 = rsTj40Mtp5;
    }

    public boolean isLaj41Tmj() {
        return laj41Tmj;
    }

    public void setLaj41Tmj(boolean laj41Tmj) {
        this.laj41Tmj = laj41Tmj;
    }

    public boolean isLaj42Acc() {
        return laj42Acc;
    }

    public void setLaj42Acc(boolean laj42Acc) {
        this.laj42Acc = laj42Acc;
    }

    public boolean isLaj43Stc() {
        return laj43Stc;
    }

    public void setLaj43Stc(boolean laj43Stc) {
        this.laj43Stc = laj43Stc;
    }

    public boolean isRaj44Tmj() {
        return raj44Tmj;
    }

    public void setRaj44Tmj(boolean raj44Tmj) {
        this.raj44Tmj = raj44Tmj;
    }

    public boolean isRaj45Acc() {
        return raj45Acc;
    }

    public void setRaj45Acc(boolean raj45Acc) {
        this.raj45Acc = raj45Acc;
    }

    public boolean isRaj46Stc() {
        return raj46Stc;
    }

    public void setRaj46Stc(boolean raj46Stc) {
        this.raj46Stc = raj46Stc;
    }

    public boolean isLajTj41Tmj() {
        return lajTj41Tmj;
    }

    public void setLajTj41Tmj(boolean lajTj41Tmj) {
        this.lajTj41Tmj = lajTj41Tmj;
    }

    public boolean isLajTj42Acc() {
        return lajTj42Acc;
    }

    public void setLajTj42Acc(boolean lajTj42Acc) {
        this.lajTj42Acc = lajTj42Acc;
    }

    public boolean isLajTj43Stc() {
        return lajTj43Stc;
    }

    public void setLajTj43Stc(boolean lajTj43Stc) {
        this.lajTj43Stc = lajTj43Stc;
    }

    public boolean isRajTj44Tmj() {
        return rajTj44Tmj;
    }

    public void setRajTj44Tmj(boolean rajTj44Tmj) {
        this.rajTj44Tmj = rajTj44Tmj;
    }

    public boolean isRajTj45Acc() {
        return rajTj45Acc;
    }

    public void setRajTj45Acc(boolean rajTj45Acc) {
        this.rajTj45Acc = rajTj45Acc;
    }

    public boolean isRajTj46Stc() {
        return rajTj46Stc;
    }

    public void setRajTj46Stc(boolean rajTj46Stc) {
        this.rajTj46Stc = rajTj46Stc;
    }

    
    
    public JointInvolvement getJointInvolvement() {
        return jointInvolvement;
    }

    public void setJointInvolvement(JointInvolvement jointInvolvement) {
        this.jointInvolvement = jointInvolvement;
    }

    public Serology getSerology() {
        return serology;
    }

    public void setSerology(Serology serology) {
        this.serology = serology;
    }

    public AcutePhaseReactants getAcutePhaseReactants() {
        return acutePhaseReactants;
    }

    public void setAcutePhaseReactants(AcutePhaseReactants acutePhaseReactants) {
        this.acutePhaseReactants = acutePhaseReactants;
    }

    public DurationOfSymptoms getDurationOfSymptoms() {
        return durationOfSymptoms;
    }

    public void setDurationOfSymptoms(DurationOfSymptoms durationOfSymptoms) {
        this.durationOfSymptoms = durationOfSymptoms;
    }

    public int getJointInvolvementCal() {
        return jointInvolvementCal;
    }

    public void setJointInvolvementCal(int jointInvolvementCal) {
        this.jointInvolvementCal = jointInvolvementCal;
    }

    public int getSerologyCal() {
        return serologyCal;
    }

    public void setSerologyCal(int serologyCal) {
        this.serologyCal = serologyCal;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int getTenderJointCountDAS() {
        return tenderJointCountDAS;
    }

    public void setTenderJointCountDAS(int tenderJointCountDAS) {
        this.tenderJointCountDAS = tenderJointCountDAS;
    }

    public int getSwollenJointCountDAS() {
        return swollenJointCountDAS;
    }

    public void setSwollenJointCountDAS(int swollenJointCountDAS) {
        this.swollenJointCountDAS = swollenJointCountDAS;
    }

    public int getPatientGlobalHealthDAS() {
        return patientGlobalHealthDAS;
    }

    public void setPatientGlobalHealthDAS(int patientGlobalHealthDAS) {
        this.patientGlobalHealthDAS = patientGlobalHealthDAS;
    }

    public double getCalculatedScoreDAS() {
        return calculatedScoreDAS;
    }

    public void setCalculatedScoreDAS(double calculatedScoreDAS) {
        this.calculatedScoreDAS = calculatedScoreDAS;
    }

    public double getEsrValue() {
        return esrValue;
    }

    public void setEsrValue(double esrValue) {
        this.esrValue = esrValue;
    }

    public double getCrpValue() {
        return crpValue;
    }

    public void setCrpValue(double crpValue) {
        this.crpValue = crpValue;
    }

    public double getRfValue() {
        return rfValue;
    }

    public void setRfValue(double rfValue) {
        this.rfValue = rfValue;
    }

    public double getAcpaValue() {
        return acpaValue;
    }

    public void setAcpaValue(double acpaValue) {
        this.acpaValue = acpaValue;
    }

    public boolean getPolyarticularPresentationPoorPrognosticFactors() {
        return polyarticularPresentationPoorPrognosticFactors;
    }

    public void setPolyarticularPresentationPoorPrognosticFactors(boolean polyarticularPresentationPoorPrognosticFactors) {
        this.polyarticularPresentationPoorPrognosticFactors = polyarticularPresentationPoorPrognosticFactors;
    }

    public boolean getRfPositivePoorPrognosticFactors() {
        return rfPositivePoorPrognosticFactors;
    }

    public void setRfPositivePoorPrognosticFactors(boolean rfPositivePoorPrognosticFactors) {
        this.rfPositivePoorPrognosticFactors = rfPositivePoorPrognosticFactors;
    }

    public boolean getAntiCPAPositivePoorPrognosticFactors() {
        return antiCPAPositivePoorPrognosticFactors;
    }

    public void setAntiCPAPositivePoorPrognosticFactors(boolean antiCPAPositivePoorPrognosticFactors) {
        this.antiCPAPositivePoorPrognosticFactors = antiCPAPositivePoorPrognosticFactors;
    }

    public boolean getErosionsInXrayPoorPrognosticFactors() {
        return erosionsInXrayPoorPrognosticFactors;
    }

    public void setErosionsInXrayPoorPrognosticFactors(boolean erosionsInXrayPoorPrognosticFactors) {
        this.erosionsInXrayPoorPrognosticFactors = erosionsInXrayPoorPrognosticFactors;
    }

    public double getMtxInitialDrugTherapy() {
        return mtxInitialDrugTherapy;
    }

    public void setMtxInitialDrugTherapy(double mtxInitialDrugTherapy) {
        this.mtxInitialDrugTherapy = mtxInitialDrugTherapy;
    }

    public double getSszInitialDrugTherapy() {
        return sszInitialDrugTherapy;
    }

    public void setSszInitialDrugTherapy(double sszInitialDrugTherapy) {
        this.sszInitialDrugTherapy = sszInitialDrugTherapy;
    }

    public int getLefInitialDrugTherapy() {
        return lefInitialDrugTherapy;
    }

    public void setLefInitialDrugTherapy(int lefInitialDrugTherapy) {
        this.lefInitialDrugTherapy = lefInitialDrugTherapy;
    }

    public int getHcqInitialDrugTherapy() {
        return hcqInitialDrugTherapy;
    }

    public void setHcqInitialDrugTherapy(int hcqInitialDrugTherapy) {
        this.hcqInitialDrugTherapy = hcqInitialDrugTherapy;
    }

    public int getSteroidsInitialDrugTherapy() {
        return steroidsInitialDrugTherapy;
    }

    public void setSteroidsInitialDrugTherapy(int steroidsInitialDrugTherapy) {
        this.steroidsInitialDrugTherapy = steroidsInitialDrugTherapy;
    }

    public DoseUnitAndFrequency getDoseUnitAndFrequencyOfsteroidsInitialDrugTherapy() {
        return doseUnitAndFrequencyOfsteroidsInitialDrugTherapy;
    }

    public void setDoseUnitAndFrequencyOfsteroidsInitialDrugTherapy(DoseUnitAndFrequency doseUnitAndFrequencyOfsteroidsInitialDrugTherapy) {
        this.doseUnitAndFrequencyOfsteroidsInitialDrugTherapy = doseUnitAndFrequencyOfsteroidsInitialDrugTherapy;
    }

    public int getUnit() {
        return Unit;
    }

    public void setUnit(int Unit) {
        this.Unit = Unit;
    }

    public CRPunits getUnitofCRP() {
        return unitofCRP;
    }

    public void setUnitofCRP(CRPunits unitofCRP) {
        this.unitofCRP = unitofCRP;
    }


    public SSZDoseUnitAndFrequency getUnitofSSZ() {
        return unitofSSZ;
    }

    public void setUnitofSSZ(SSZDoseUnitAndFrequency unitofSSZ) {
        this.unitofSSZ = unitofSSZ;
    }

    public double getSdaiRemissionSDAICDAI() {
        return sdaiRemissionSDAICDAI;
    }

    public void setSdaiRemissionSDAICDAI(double sdaiRemissionSDAICDAI) {
        this.sdaiRemissionSDAICDAI = sdaiRemissionSDAICDAI;
    }

    public double getCdaiRemissionSDAICDAI() {
        return cdaiRemissionSDAICDAI;
    }

    public void setCdaiRemissionSDAICDAI(double cdaiRemissionSDAICDAI) {
        this.cdaiRemissionSDAICDAI = cdaiRemissionSDAICDAI;
    }

    public int getTenderJointCountSDAICDAI() {
        return tenderJointCountSDAICDAI;
    }

    public void setTenderJointCountSDAICDAI(int tenderJointCountSDAICDAI) {
        this.tenderJointCountSDAICDAI = tenderJointCountSDAICDAI;
    }

    public int getSwellenJointCountSDAICDAI() {
        return swellenJointCountSDAICDAI;
    }

    public void setSwellenJointCountSDAICDAI(int swellenJointCountSDAICDAI) {
        this.swellenJointCountSDAICDAI = swellenJointCountSDAICDAI;
    }

    public int getPatientGlobalAssessmentSDAICDAI() {
        return patientGlobalAssessmentSDAICDAI;
    }

    public void setPatientGlobalAssessmentSDAICDAI(int patientGlobalAssessmentSDAICDAI) {
        this.patientGlobalAssessmentSDAICDAI = patientGlobalAssessmentSDAICDAI;
    }

    public int getEvaluatorGlobalAssessmentSDAICDAI() {
        return evaluatorGlobalAssessmentSDAICDAI;
    }

    public void setEvaluatorGlobalAssessmentSDAICDAI(int evaluatorGlobalAssessmentSDAICDAI) {
        this.evaluatorGlobalAssessmentSDAICDAI = evaluatorGlobalAssessmentSDAICDAI;
    }

    public double getCrpSDAICDAI() {
        return crpSDAICDAI;
    }

    public void setCrpSDAICDAI(double crpSDAICDAI) {
        this.crpSDAICDAI = crpSDAICDAI;
    }

    public int getNegativeRfandNegativeAcpaSerology() {
        return negativeRfandNegativeAcpaSerology;
    }

    public void setNegativeRfandNegativeAcpaSerology(int negativeRfandNegativeAcpaSerology) {
        this.negativeRfandNegativeAcpaSerology = negativeRfandNegativeAcpaSerology;
    }

    public int getLowPositiveRforLowPositiveAcpaSerology() {
        return lowPositiveRforLowPositiveAcpaSerology;
    }

    public void setLowPositiveRforLowPositiveAcpaSerology(int lowPositiveRforLowPositiveAcpaSerology) {
        this.lowPositiveRforLowPositiveAcpaSerology = lowPositiveRforLowPositiveAcpaSerology;
    }

    public int getHighPositiveRforhighPositiveAcpaSerology() {
        return highPositiveRforhighPositiveAcpaSerology;
    }

    public void setHighPositiveRforhighPositiveAcpaSerology(int highPositiveRforhighPositiveAcpaSerology) {
        this.highPositiveRforhighPositiveAcpaSerology = highPositiveRforhighPositiveAcpaSerology;
    }

    public int getNomalCrpandNomalEsrAcutephaseReactants() {
        return nomalCrpandNomalEsrAcutephaseReactants;
    }

    public void setNomalCrpandNomalEsrAcutephaseReactants(int nomalCrpandNomalEsrAcutephaseReactants) {
        this.nomalCrpandNomalEsrAcutephaseReactants = nomalCrpandNomalEsrAcutephaseReactants;
    }

    public int getAbnormalCrporAbnormalEsrAcutePhaseReactants() {
        return abnormalCrporAbnormalEsrAcutePhaseReactants;
    }

    public void setAbnormalCrporAbnormalEsrAcutePhaseReactants(int abnormalCrporAbnormalEsrAcutePhaseReactants) {
        this.abnormalCrporAbnormalEsrAcutePhaseReactants = abnormalCrporAbnormalEsrAcutePhaseReactants;
    }

    public int getDurationOfSymptomsIsLessThanSixWeeks() {
        return durationOfSymptomsIsLessThanSixWeeks;
    }

    public void setDurationOfSymptomsIsLessThanSixWeeks(int durationOfSymptomsIsLessThanSixWeeks) {
        this.durationOfSymptomsIsLessThanSixWeeks = durationOfSymptomsIsLessThanSixWeeks;
    }

    public int getDurationOfSymptomsIsGreaterThanSixWeek() {
        return durationOfSymptomsIsGreaterThanSixWeek;
    }

    public void setDurationOfSymptomsIsGreaterThanSixWeek(int durationOfSymptomsIsGreaterThanSixWeek) {
        this.durationOfSymptomsIsGreaterThanSixWeek = durationOfSymptomsIsGreaterThanSixWeek;
    }

    public int getAcutephaseReactantsCal() {
        return AcutephaseReactantsCal;
    }

    public void setAcutephaseReactantsCal(int AcutephaseReactantsCal) {
        this.AcutephaseReactantsCal = AcutephaseReactantsCal;
    }

    public int getDurationOfSymptomsCal() {
        return durationOfSymptomsCal;
    }

    public void setDurationOfSymptomsCal(int durationOfSymptomsCal) {
        this.durationOfSymptomsCal = durationOfSymptomsCal;
    }

    public int getTotalScoreTargetPopulation() {
        return totalScoreTargetPopulation;
    }

    public void setTotalScoreTargetPopulation(int totalScoreTargetPopulation) {
        this.totalScoreTargetPopulation = totalScoreTargetPopulation;
    }

    public String getTotalDiognosis() {
        return totalDiognosis;
    }

    public void setTotalDiognosis(String totalDiognosis) {
        this.totalDiognosis = totalDiognosis;
    }

    public EsrCrp getEsrCrp() {
        return EsrCrp;
    }

    public void setEsrCrp(EsrCrp EsrCrp) {
        this.EsrCrp = EsrCrp;
    }

    public double getResultOfEsrCrp() {
        return resultOfEsrCrp;
    }

    public void setResultOfEsrCrp(double resultOfEsrCrp) {
        this.resultOfEsrCrp = resultOfEsrCrp;
    }

    public String getConfirmDAS() {
        return confirmDAS;
    }

    public void setConfirmDAS(String confirmDAS) {
        this.confirmDAS = confirmDAS;
    }

    public String getSdaireference() {
        return sdaireference;
    }

    public void setSdaireference(String sdaireference) {
        this.sdaireference = sdaireference;
    }

    public String getCdaireference() {
        return cdaireference;
    }

    public void setCdaireference(String cdaireference) {
        this.cdaireference = cdaireference;
    }

    public void setTotalScoreTargetPopulation(String temStr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public SteroidsType getSteroidsType() {
        return SteroidsType;
    }

    public void setSteroidsType(SteroidsType SteroidsType) {
        this.SteroidsType = SteroidsType;
    }
   
    
    
}
