/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gov.health.nrd.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;

/**
 *
 * @author rheumahealth2018
 */

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Followup extends Encounter {
    
    @Temporal(javax.persistence.TemporalType.DATE)
   private Date dateOfvisit;
  private double esr;
  private double crp;
  private String rf;
  private double anticcp;
  private double ana;
  private double dsdna;
  private double canca;  
  private double panca;
  private double hb;
  private double wbc;
  private double n;
  private double l;
  private double m; 
  private double e;
  private double platelet;
  private double sgotAST;
  private double sgptALT;
  private double sbilirubin;
  private double screatinin; 
  private double fbs;
  private double suricacid;
  private double ufr;

    public Date getDateOfvisit() {
        return dateOfvisit;
    }

    public void setDateOfvisit(Date dateOfvisit) {
        this.dateOfvisit = dateOfvisit;
    }

    public double getEsr() {
        return esr;
    }

    public void setEsr(double esr) {
        this.esr = esr;
    }

    public double getCrp() {
        return crp;
    }

    public void setCrp(double crp) {
        this.crp = crp;
    }

    public String getRf() {
        return rf;
    }

    public void setRf(String rf) {
        this.rf = rf;
    }

    public double getAnticcp() {
        return anticcp;
    }

    public void setAnticcp(double anticcp) {
        this.anticcp = anticcp;
    }

    public double getAna() {
        return ana;
    }

    public void setAna(double ana) {
        this.ana = ana;
    }

    public double getDsdna() {
        return dsdna;
    }

    public void setDsdna(double dsdna) {
        this.dsdna = dsdna;
    }

    public double getCanca() {
        return canca;
    }

    public void setCanca(double canca) {
        this.canca = canca;
    }

    public double getPanca() {
        return panca;
    }

    public void setPanca(double panca) {
        this.panca = panca;
    }

    public double getHb() {
        return hb;
    }

    public void setHb(double hb) {
        this.hb = hb;
    }

    public double getWbc() {
        return wbc;
    }

    public void setWbc(double wbc) {
        this.wbc = wbc;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getM() {
        return m;
    }

    public void setM(double m) {
        this.m = m;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getPlatelet() {
        return platelet;
    }

    public void setPlatelet(double platelet) {
        this.platelet = platelet;
    }

    public double getSgotAST() {
        return sgotAST;
    }

    public void setSgotAST(double sgotAST) {
        this.sgotAST = sgotAST;
    }

    public double getSgptALT() {
        return sgptALT;
    }

    public void setSgptALT(double sgptALT) {
        this.sgptALT = sgptALT;
    }

    public double getSbilirubin() {
        return sbilirubin;
    }

    public void setSbilirubin(double sbilirubin) {
        this.sbilirubin = sbilirubin;
    }

    public double getScreatinin() {
        return screatinin;
    }

    public void setScreatinin(double screatinin) {
        this.screatinin = screatinin;
    }

    public double getFbs() {
        return fbs;
    }

    public void setFbs(double fbs) {
        this.fbs = fbs;
    }

    public double getSuricacid() {
        return suricacid;
    }

    public void setSuricacid(double suricacid) {
        this.suricacid = suricacid;
    }

    public double getUfr() {
        return ufr;
    }

    public void setUfr(double ufr) {
        this.ufr = ufr;
    }

    
    
 
}
