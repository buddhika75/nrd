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
import lk.gov.health.nrd.enums.PrescriptionUnit;



/**
 *
 * @author rheumahealth2018
 */


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Prescription extends Encounter {
    
    private double methotrexate;
    private int sulphasalazine;
    private int leflunomide;
    private int hydroxychloroquine;
    private int folicacid;
    private int diclofenac_na;
    private int omeprazole;
    private int paracetamol;
    private double prednisolone;
    private int azathioprine;
    private String nameOfdrug1;
    private String nameOfdrug2;
    private String nameOfdrug3;
    private String nameOfdrug4;
    private String nameOfdrug5;
    private double doseOfdrug1;
    private double doseOfdruge2;
    private double doseOfdruge3;
    private double doseOfdruge4;
    private double doseOfdruge5;
     @Enumerated(EnumType.STRING)
    private PrescriptionUnit unitofdrugs;

    public double getMethotrexate() {
        return methotrexate;
    }

    public void setMethotrexate(double methotrexate) {
        this.methotrexate = methotrexate;
    }

    public int getSulphasalazine() {
        return sulphasalazine;
    }

    public void setSulphasalazine(int sulphasalazine) {
        this.sulphasalazine = sulphasalazine;
    }

    public int getLeflunomide() {
        return leflunomide;
    }

    public void setLeflunomide(int leflunomide) {
        this.leflunomide = leflunomide;
    }

    public int getHydroxychloroquine() {
        return hydroxychloroquine;
    }

    public void setHydroxychloroquine(int hydroxychloroquine) {
        this.hydroxychloroquine = hydroxychloroquine;
    }

    public int getFolicacid() {
        return folicacid;
    }

    public void setFolicacid(int folicacid) {
        this.folicacid = folicacid;
    }

    public int getDiclofenac_na() {
        return diclofenac_na;
    }

    public void setDiclofenac_na(int diclofenac_na) {
        this.diclofenac_na = diclofenac_na;
    }

    public int getOmeprazole() {
        return omeprazole;
    }

    public void setOmeprazole(int omeprazole) {
        this.omeprazole = omeprazole;
    }

    public int getParacetamol() {
        return paracetamol;
    }

    public void setParacetamol(int paracetamol) {
        this.paracetamol = paracetamol;
    }

    public double getPrednisolone() {
        return prednisolone;
    }

    public void setPrednisolone(double prednisolone) {
        this.prednisolone = prednisolone;
    }

    public int getAzathioprine() {
        return azathioprine;
    }

    public void setAzathioprine(int azathioprine) {
        this.azathioprine = azathioprine;
    }

    public PrescriptionUnit getUnitofdrugs() {
        return unitofdrugs;
    }

    public void setUnitofdrugs(PrescriptionUnit unitofdrugs) {
        this.unitofdrugs = unitofdrugs;
    }

    public String getNameOfdrug1() {
        return nameOfdrug1;
    }

    public void setNameOfdrug1(String nameOfdrug1) {
        this.nameOfdrug1 = nameOfdrug1;
    }

    public String getNameOfdrug2() {
        return nameOfdrug2;
    }

    public void setNameOfdrug2(String nameOfdrug2) {
        this.nameOfdrug2 = nameOfdrug2;
    }

    public String getNameOfdrug3() {
        return nameOfdrug3;
    }

    public void setNameOfdrug3(String nameOfdrug3) {
        this.nameOfdrug3 = nameOfdrug3;
    }

    public String getNameOfdrug4() {
        return nameOfdrug4;
    }

    public void setNameOfdrug4(String nameOfdrug4) {
        this.nameOfdrug4 = nameOfdrug4;
    }

    public String getNameOfdrug5() {
        return nameOfdrug5;
    }

    public void setNameOfdrug5(String nameOfdrug5) {
        this.nameOfdrug5 = nameOfdrug5;
    }

    public double getDoseOfdrug1() {
        return doseOfdrug1;
    }

    public void setDoseOfdrug1(double doseOfdrug1) {
        this.doseOfdrug1 = doseOfdrug1;
    }

    public double getDoseOfdruge2() {
        return doseOfdruge2;
    }

    public void setDoseOfdruge2(double doseOfdruge2) {
        this.doseOfdruge2 = doseOfdruge2;
    }

    public double getDoseOfdruge3() {
        return doseOfdruge3;
    }

    public void setDoseOfdruge3(double doseOfdruge3) {
        this.doseOfdruge3 = doseOfdruge3;
    }

    public double getDoseOfdruge4() {
        return doseOfdruge4;
    }

    public void setDoseOfdruge4(double doseOfdruge4) {
        this.doseOfdruge4 = doseOfdruge4;
    }

    public double getDoseOfdruge5() {
        return doseOfdruge5;
    }

    public void setDoseOfdruge5(double doseOfdruge5) {
        this.doseOfdruge5 = doseOfdruge5;
    }

    
}
