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

    
    
private boolean positiveXray;
private boolean negativeXray;
private boolean positiveHlaB27;
private boolean negativeHlaB27;
private boolean positiveMri;
private boolean negativeMri;
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



    public boolean isPositiveXray() {
        return positiveXray;
    }

    public void setPositiveXray(boolean positiveXray) {
        this.positiveXray = positiveXray;
    }

    public boolean isNegativeXray() {
        return negativeXray;
    }

    public void setNegativeXray(boolean negativeXray) {
        this.negativeXray = negativeXray;
    }

    public boolean isPositiveHlaB27() {
        return positiveHlaB27;
    }

    public void setPositiveHlaB27(boolean positiveHlaB27) {
        this.positiveHlaB27 = positiveHlaB27;
    }

    public boolean isNegativeHlaB27() {
        return negativeHlaB27;
    }

    public void setNegativeHlaB27(boolean negativeHlaB27) {
        this.negativeHlaB27 = negativeHlaB27;
    }

    public boolean isPositiveMri() {
        return positiveMri;
    }

    public void setPositiveMri(boolean positiveMri) {
        this.positiveMri = positiveMri;
    }

    public boolean isNegativeMri() {
        return negativeMri;
    }

    public void setNegativeMri(boolean negativeMri) {
        this.negativeMri = negativeMri;
    }


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

   

    







    
}
