/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gov.health.nrd.entity;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author User
 */

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class SpondyloarthristisData extends Encounter {

    
    
    
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

    







    
}
