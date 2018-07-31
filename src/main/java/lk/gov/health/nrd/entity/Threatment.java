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
 * @author rheumahealth2018
 */


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Threatment extends Encounter {
    
    private int methotrexate;
    private int sulphasalazine;
    private int leflunomide;
    private int hydroxychloroquine;
    private int folicacid;
    private int diclofenac_na;
    private int omeprazole;
    private int paracetamol;
    private int prednisolone;
    private int azathioprine;

    
    public int getMethotrexate() {
        return methotrexate;
    }

    public void setMethotrexate(int methotrexate) {
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

    public int getPrednisolone() {
        return prednisolone;
    }

    public void setPrednisolone(int prednisolone) {
        this.prednisolone = prednisolone;
    }

    public int getAzathioprine() {
        return azathioprine;
    }

    public void setAzathioprine(int azathioprine) {
        this.azathioprine = azathioprine;
    }




}
