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
public class Investigation extends Encounter {
    
    
    
    
    
 @Temporal(javax.persistence.TemporalType.DATE)
   Date dateOfvisit1;
 @Temporal(javax.persistence.TemporalType.DATE)
   Date dateOfvisit2;
 @Temporal(javax.persistence.TemporalType.DATE)
   Date dateOfvisit3;
 @Temporal(javax.persistence.TemporalType.DATE)
   Date dateOfvisit4;
 @Temporal(javax.persistence.TemporalType.DATE)
   Date dateOfvisit5;
 @Temporal(javax.persistence.TemporalType.DATE)
   Date dateOfvisit6;
 @Temporal(javax.persistence.TemporalType.DATE)
   Date dateOfvisit7;
 @Temporal(javax.persistence.TemporalType.DATE)
   Date dateOfvisit8;
 @Temporal(javax.persistence.TemporalType.DATE)
   Date dateOfvisit9;
 @Temporal(javax.persistence.TemporalType.DATE)
   Date dateOfvisit10;

 double esrDateOfVisit1;
 double esrDateOfVisit2;
 double esrDateOfVisit3;
 double esrDateOfVisit4;
 double esrDateOfVisit5;
 double esrDateOfVisit6;
 double esrDateOfVisit7;
 double esrDateOfVisit8;
 double esrDateOfVisit9;
 double esrDateOfVisit10;
 
 double crpDateOfVisit1;
 double crpDateOfVisit2;
 double crpDateOfVisit3;
 double crpDateOfVisit4;
 double crpDateOfVisit5;
 double crpDateOfVisit6;
 double crpDateOfVisit7;
 double crpDateOfVisit8;
 double crpDateOfVisit9;
 double crpDateOfVisit10;
 
 String rfDateOfVisit1;
 String rfDateOfVisit2;
 String rfDateOfVisit3;
 String rfDateOfVisit4;
 String rfDateOfVisit5;
 String rfDateOfVisit6;
 String rfDateOfVisit7;
 String rfDateOfVisit8;
 String rfDateOfVisit9;
 String rfDateOfVisit10;
 
 double antiCcpDateOfVisit1;
 double antiCcpDateOfVisit2;
 double antiCcpDateOfVisit3;
 double antiCcpDateOfVisit4;
 double antiCcpDateOfVisit5;
 double antiCcpDateOfVisit6;
 double antiCcpDateOfVisit7;
 double antiCcpDateOfVisit8;
 double antiCcpDateOfVisit9;
 double antiCcpDateOfVisit10;
 
 double anaDateOfVisit1;
 double anaDateOfVisit2;
 double anaDateOfVisit3;
 double anaDateOfVisit4;
 double anaDateOfVisit5;
 double anaDateOfVisit6;
 double anaDateOfVisit7;
 double anaDateOfVisit8;
 double anaDateOfVisit9;
 double anaDateOfVisit10;
 
 double dsDnaDateOfVisit1; 
 double dsDnaDateOfVisit2;
 double dsDnaDateOfVisit3;
 double dsDnaDateOfVisit4;
 double dsDnaDateOfVisit5;
 double dsDnaDateOfVisit6;
 double dsDnaDateOfVisit7;
 double dsDnaDateOfVisit8;
 double dsDnaDateOfVisit9;
 double dsDnaDateOfVisit10;
 
 double caNcaDateOfVisit1;
 double caNcaDateOfVisit2;
 double caNcaDateOfVisit3;
 double caNcaDateOfVisit4;
 double caNcaDateOfVisit5;
 double caNcaDateOfVisit6;
 double caNcaDateOfVisit7;
 double caNcaDateOfVisit8;
 double caNcaDateOfVisit9;
 double caNcaDateOfVisit10;
 
 double paNcaDateOfVisit1;
 double paNcaDateOfVisit2;
 double paNcaDateOfVisit3;
 double paNcaDateOfVisit4;
 double paNcaDateOfVisit5;
 double paNcaDateOfVisit6;
 double paNcaDateOfVisit7;
 double paNcaDateOfVisit8;
 double paNcaDateOfVisit9;
 double paNcaDateOfVisit10;
 
 double hbDateOfVisit1;
 double hbDateOfVisit2;
 double hbDateOfVisit3;
 double hbDateOfVisit4;
 double hbDateOfVisit5;
 double hbDateOfVisit6;
 double hbDateOfVisit7;
 double hbDateOfVisit8;
 double hbDateOfVisit9;
 double hbDateOfVisit10;
 
 double wbcDateOfVisit1;
 double wbcDateOfVisit2;
 double wbcDateOfVisit3;
 double wbcDateOfVisit4;
 double wbcDateOfVisit5;
 double wbcDateOfVisit6;
 double wbcDateOfVisit7;
 double wbcDateOfVisit8;
 double wbcDateOfVisit9;
 double wbcDateOfVisit10;
 
 double ndateOfVisit1;
 double ndateOfVisit2;
 double ndateOfVisit3;
 double ndateOfVisit4;
 double ndateOfVisit5;
 double ndateOfVisit6;
 double ndateOfVisit7;
 double ndateOfVisit8;
 double ndateOfVisit9;
 double ndateOfVisit10;
 
 double ldateOfVisit1;
 double ldateOfVisit2;
 double ldateOfVisit3;
 double ldateOfVisit4;
 double ldateOfVisit5;
 double ldateOfVisit6;
 double ldateOfVisit7;
 double ldateOfVisit8;
 double ldateOfVisit9;
 double ldateOfVisit10;
 
 double mdateOfVisit1;
 double mdateOfVisit2;
 double mdateOfVisit3;
 double mdateOfVisit4;
 double mdateOfVisit5;
 double mdateOfVisit6;
 double mdateOfVisit7;
 double mdateOfVisit8;
 double mdateOfVisit9;
 double mdateOfVisit10;
 
 double edateOfVisit1;
 double edateOfVisit2;
 double edateOfVisit3;
 double edateOfVisit4;
 double edateOfVisit5;
 double edateOfVisit6;
 double edateOfVisit7;
 double edateOfVisit8;
 double edateOfVisit9;
 double edateOfVisit10;
 
 double plateletsDateOfVisit1;
 double plateletsDateOfVisit2;
 double plateletsDateOfVisit3;
 double plateletsDateOfVisit4;
 double plateletsDateOfVisit5;
 double plateletsDateOfVisit6;
 double plateletsDateOfVisit7;
 double plateletsDateOfVisit8;
 double plateletsDateOfVisit9;
 double plateletsDateOfVisit10;
 
 double sgotAstDateOfVisit1;
 double sgotAstDateOfVisit2;
 double sgotAstDateOfVisit3;
 double sgotAstDateOfVisit4;
 double sgotAstDateOfVisit5;
 double sgotAstDateOfVisit6;
 double sgotAstDateOfVisit7;
 double sgotAstDateOfVisit8;
 double sgotAstDateOfVisit9;
 double sgotAstDateOfVisit10;
 
 double sgptAltDateOfVisit1;
 double sgptAltDateOfVisit2;
 double sgptAltDateOfVisit3;
 double sgptAltDateOfVisit4;
 double sgptAltDateOfVisit5;
 double sgptAltDateOfVisit6;
 double sgptAltDateOfVisit7;
 double sgptAltDateOfVisit8;
 double sgptAltDateOfVisit9;
 double sgptAltDateOfVisit10;
 
 double sbilirubinDateOfVisit1;
 double sbilirubinDateOfVisit2;
 double sbilirubinDateOfVisit3;
 double sbilirubinDateOfVisit4;
 double sbilirubinDateOfVisit5;
 double sbilirubinDateOfVisit6;
 double sbilirubinDateOfVisit7;
 double sbilirubinDateOfVisit8;
 double sbilirubinDateOfVisit9;
 double sbilirubinDateOfVisit10;
 
 double screatininDateOfVisit1;
 double screatininDateOfVisit2;
 double screatininDateOfVisit3;
 double screatininDateOfVisit4;
 double screatininDateOfVisit5;
 double screatininDateOfVisit6;
 double screatininDateOfVisit7;
 double screatininDateOfVisit8;
 double screatininDateOfVisit9;
 double screatininDateOfVisit10;
 
 double fbsDateOfVisit1;
 double fbsDateOfVisit2;
 double fbsDateOfVisit3;
 double fbsDateOfVisit4;
 double fbsDateOfVisit5;
 double fbsDateOfVisit6;
 double fbsDateOfVisit7;
 double fbsDateOfVisit8;
 double fbsDateOfVisit9;
 double fbsDateOfVisit10;
 
 double suricAcidDateOfVisit1;
 double suricAcidDateOfVisit2;
 double suricAcidDateOfVisit3;
 double suricAcidDateOfVisit4;
 double suricAcidDateOfVisit5;
 double suricAcidDateOfVisit6;
 double suricAcidDateOfVisit7;
 double suricAcidDateOfVisit8;
 double suricAcidDateOfVisit9;
 double suricAcidDateOfVisit10;
 
 double ufrDateOfVisit1;
 double ufrDateOfVisit2;
 double ufrDateOfVisit3;
 double ufrDateOfVisit4;
 double ufrDateOfVisit5;
 double ufrDateOfVisit6;
 double ufrDateOfVisit7;
 double ufrDateOfVisit8;
 double ufrDateOfVisit9;
 double ufrDateOfVisit10;

 
 
    public Date getDateOfvisit1() {
        return dateOfvisit1;
    }

    public void setDateOfvisit1(Date dateOfvisit1) {
        this.dateOfvisit1 = dateOfvisit1;
    }

    public Date getDateOfvisit2() {
        return dateOfvisit2;
    }

    public void setDateOfvisit2(Date dateOfvisit2) {
        this.dateOfvisit2 = dateOfvisit2;
    }

    public Date getDateOfvisit3() {
        return dateOfvisit3;
    }

    public void setDateOfvisit3(Date dateOfvisit3) {
        this.dateOfvisit3 = dateOfvisit3;
    }

    public Date getDateOfvisit4() {
        return dateOfvisit4;
    }

    public void setDateOfvisit4(Date dateOfvisit4) {
        this.dateOfvisit4 = dateOfvisit4;
    }

    public Date getDateOfvisit5() {
        return dateOfvisit5;
    }

    public void setDateOfvisit5(Date dateOfvisit5) {
        this.dateOfvisit5 = dateOfvisit5;
    }

    public Date getDateOfvisit6() {
        return dateOfvisit6;
    }

    public void setDateOfvisit6(Date dateOfvisit6) {
        this.dateOfvisit6 = dateOfvisit6;
    }

    public Date getDateOfvisit7() {
        return dateOfvisit7;
    }

    public void setDateOfvisit7(Date dateOfvisit7) {
        this.dateOfvisit7 = dateOfvisit7;
    }

    public Date getDateOfvisit8() {
        return dateOfvisit8;
    }

    public void setDateOfvisit8(Date dateOfvisit8) {
        this.dateOfvisit8 = dateOfvisit8;
    }

    public Date getDateOfvisit9() {
        return dateOfvisit9;
    }

    public void setDateOfvisit9(Date dateOfvisit9) {
        this.dateOfvisit9 = dateOfvisit9;
    }

    public Date getDateOfvisit10() {
        return dateOfvisit10;
    }

    public void setDateOfvisit10(Date dateOfvisit10) {
        this.dateOfvisit10 = dateOfvisit10;
    }

    public double getEsrDateOfVisit1() {
        return esrDateOfVisit1;
    }

    public void setEsrDateOfVisit1(double esrDateOfVisit1) {
        this.esrDateOfVisit1 = esrDateOfVisit1;
    }

    public double getEsrDateOfVisit2() {
        return esrDateOfVisit2;
    }

    public void setEsrDateOfVisit2(double esrDateOfVisit2) {
        this.esrDateOfVisit2 = esrDateOfVisit2;
    }

    public double getEsrDateOfVisit3() {
        return esrDateOfVisit3;
    }

    public void setEsrDateOfVisit3(double esrDateOfVisit3) {
        this.esrDateOfVisit3 = esrDateOfVisit3;
    }

    public double getEsrDateOfVisit4() {
        return esrDateOfVisit4;
    }

    public void setEsrDateOfVisit4(double esrDateOfVisit4) {
        this.esrDateOfVisit4 = esrDateOfVisit4;
    }

    public double getEsrDateOfVisit5() {
        return esrDateOfVisit5;
    }

    public void setEsrDateOfVisit5(double esrDateOfVisit5) {
        this.esrDateOfVisit5 = esrDateOfVisit5;
    }

    public double getEsrDateOfVisit6() {
        return esrDateOfVisit6;
    }

    public void setEsrDateOfVisit6(double esrDateOfVisit6) {
        this.esrDateOfVisit6 = esrDateOfVisit6;
    }

    public double getEsrDateOfVisit7() {
        return esrDateOfVisit7;
    }

    public void setEsrDateOfVisit7(double esrDateOfVisit7) {
        this.esrDateOfVisit7 = esrDateOfVisit7;
    }

    public double getEsrDateOfVisit8() {
        return esrDateOfVisit8;
    }

    public void setEsrDateOfVisit8(double esrDateOfVisit8) {
        this.esrDateOfVisit8 = esrDateOfVisit8;
    }

    public double getEsrDateOfVisit9() {
        return esrDateOfVisit9;
    }

    public void setEsrDateOfVisit9(double esrDateOfVisit9) {
        this.esrDateOfVisit9 = esrDateOfVisit9;
    }

    public double getEsrDateOfVisit10() {
        return esrDateOfVisit10;
    }

    public void setEsrDateOfVisit10(double esrDateOfVisit10) {
        this.esrDateOfVisit10 = esrDateOfVisit10;
    }

    public double getCrpDateOfVisit1() {
        return crpDateOfVisit1;
    }

    public void setCrpDateOfVisit1(double crpDateOfVisit1) {
        this.crpDateOfVisit1 = crpDateOfVisit1;
    }

    public double getCrpDateOfVisit2() {
        return crpDateOfVisit2;
    }

    public void setCrpDateOfVisit2(double crpDateOfVisit2) {
        this.crpDateOfVisit2 = crpDateOfVisit2;
    }

    public double getCrpDateOfVisit3() {
        return crpDateOfVisit3;
    }

    public void setCrpDateOfVisit3(double crpDateOfVisit3) {
        this.crpDateOfVisit3 = crpDateOfVisit3;
    }

    public double getCrpDateOfVisit4() {
        return crpDateOfVisit4;
    }

    public void setCrpDateOfVisit4(double crpDateOfVisit4) {
        this.crpDateOfVisit4 = crpDateOfVisit4;
    }

    public double getCrpDateOfVisit5() {
        return crpDateOfVisit5;
    }

    public void setCrpDateOfVisit5(double crpDateOfVisit5) {
        this.crpDateOfVisit5 = crpDateOfVisit5;
    }

    public double getCrpDateOfVisit6() {
        return crpDateOfVisit6;
    }

    public void setCrpDateOfVisit6(double crpDateOfVisit6) {
        this.crpDateOfVisit6 = crpDateOfVisit6;
    }

    public double getCrpDateOfVisit7() {
        return crpDateOfVisit7;
    }

    public void setCrpDateOfVisit7(double crpDateOfVisit7) {
        this.crpDateOfVisit7 = crpDateOfVisit7;
    }

    public double getCrpDateOfVisit8() {
        return crpDateOfVisit8;
    }

    public void setCrpDateOfVisit8(double crpDateOfVisit8) {
        this.crpDateOfVisit8 = crpDateOfVisit8;
    }

    public double getCrpDateOfVisit9() {
        return crpDateOfVisit9;
    }

    public void setCrpDateOfVisit9(double crpDateOfVisit9) {
        this.crpDateOfVisit9 = crpDateOfVisit9;
    }

    public double getCrpDateOfVisit10() {
        return crpDateOfVisit10;
    }

    public void setCrpDateOfVisit10(double crpDateOfVisit10) {
        this.crpDateOfVisit10 = crpDateOfVisit10;
    }

    public String getRfDateOfVisit1() {
        return rfDateOfVisit1;
    }

    public void setRfDateOfVisit1(String rfDateOfVisit1) {
        this.rfDateOfVisit1 = rfDateOfVisit1;
    }

    public String getRfDateOfVisit2() {
        return rfDateOfVisit2;
    }

    public void setRfDateOfVisit2(String rfDateOfVisit2) {
        this.rfDateOfVisit2 = rfDateOfVisit2;
    }

    public String getRfDateOfVisit3() {
        return rfDateOfVisit3;
    }

    public void setRfDateOfVisit3(String rfDateOfVisit3) {
        this.rfDateOfVisit3 = rfDateOfVisit3;
    }

    public String getRfDateOfVisit4() {
        return rfDateOfVisit4;
    }

    public void setRfDateOfVisit4(String rfDateOfVisit4) {
        this.rfDateOfVisit4 = rfDateOfVisit4;
    }

    public String getRfDateOfVisit5() {
        return rfDateOfVisit5;
    }

    public void setRfDateOfVisit5(String rfDateOfVisit5) {
        this.rfDateOfVisit5 = rfDateOfVisit5;
    }

    public String getRfDateOfVisit6() {
        return rfDateOfVisit6;
    }

    public void setRfDateOfVisit6(String rfDateOfVisit6) {
        this.rfDateOfVisit6 = rfDateOfVisit6;
    }

    public String getRfDateOfVisit7() {
        return rfDateOfVisit7;
    }

    public void setRfDateOfVisit7(String rfDateOfVisit7) {
        this.rfDateOfVisit7 = rfDateOfVisit7;
    }

    public String getRfDateOfVisit8() {
        return rfDateOfVisit8;
    }

    public void setRfDateOfVisit8(String rfDateOfVisit8) {
        this.rfDateOfVisit8 = rfDateOfVisit8;
    }

    public String getRfDateOfVisit9() {
        return rfDateOfVisit9;
    }

    public void setRfDateOfVisit9(String rfDateOfVisit9) {
        this.rfDateOfVisit9 = rfDateOfVisit9;
    }

    public String getRfDateOfVisit10() {
        return rfDateOfVisit10;
    }

    public void setRfDateOfVisit10(String rfDateOfVisit10) {
        this.rfDateOfVisit10 = rfDateOfVisit10;
    }

    public double getAntiCcpDateOfVisit1() {
        return antiCcpDateOfVisit1;
    }

    public void setAntiCcpDateOfVisit1(double antiCcpDateOfVisit1) {
        this.antiCcpDateOfVisit1 = antiCcpDateOfVisit1;
    }

    public double getAntiCcpDateOfVisit2() {
        return antiCcpDateOfVisit2;
    }

    public void setAntiCcpDateOfVisit2(double antiCcpDateOfVisit2) {
        this.antiCcpDateOfVisit2 = antiCcpDateOfVisit2;
    }

    public double getAntiCcpDateOfVisit3() {
        return antiCcpDateOfVisit3;
    }

    public void setAntiCcpDateOfVisit3(double antiCcpDateOfVisit3) {
        this.antiCcpDateOfVisit3 = antiCcpDateOfVisit3;
    }

    public double getAntiCcpDateOfVisit4() {
        return antiCcpDateOfVisit4;
    }

    public void setAntiCcpDateOfVisit4(double antiCcpDateOfVisit4) {
        this.antiCcpDateOfVisit4 = antiCcpDateOfVisit4;
    }

    public double getAntiCcpDateOfVisit5() {
        return antiCcpDateOfVisit5;
    }

    public void setAntiCcpDateOfVisit5(double antiCcpDateOfVisit5) {
        this.antiCcpDateOfVisit5 = antiCcpDateOfVisit5;
    }

    public double getAntiCcpDateOfVisit6() {
        return antiCcpDateOfVisit6;
    }

    public void setAntiCcpDateOfVisit6(double antiCcpDateOfVisit6) {
        this.antiCcpDateOfVisit6 = antiCcpDateOfVisit6;
    }

    public double getAntiCcpDateOfVisit7() {
        return antiCcpDateOfVisit7;
    }

    public void setAntiCcpDateOfVisit7(double antiCcpDateOfVisit7) {
        this.antiCcpDateOfVisit7 = antiCcpDateOfVisit7;
    }

    public double getAntiCcpDateOfVisit8() {
        return antiCcpDateOfVisit8;
    }

    public void setAntiCcpDateOfVisit8(double antiCcpDateOfVisit8) {
        this.antiCcpDateOfVisit8 = antiCcpDateOfVisit8;
    }

    public double getAntiCcpDateOfVisit9() {
        return antiCcpDateOfVisit9;
    }

    public void setAntiCcpDateOfVisit9(double antiCcpDateOfVisit9) {
        this.antiCcpDateOfVisit9 = antiCcpDateOfVisit9;
    }

    public double getAntiCcpDateOfVisit10() {
        return antiCcpDateOfVisit10;
    }

    public void setAntiCcpDateOfVisit10(double antiCcpDateOfVisit10) {
        this.antiCcpDateOfVisit10 = antiCcpDateOfVisit10;
    }

    public double getAnaDateOfVisit1() {
        return anaDateOfVisit1;
    }

    public void setAnaDateOfVisit1(double anaDateOfVisit1) {
        this.anaDateOfVisit1 = anaDateOfVisit1;
    }

    public double getAnaDateOfVisit2() {
        return anaDateOfVisit2;
    }

    public void setAnaDateOfVisit2(double anaDateOfVisit2) {
        this.anaDateOfVisit2 = anaDateOfVisit2;
    }

    public double getAnaDateOfVisit3() {
        return anaDateOfVisit3;
    }

    public void setAnaDateOfVisit3(double anaDateOfVisit3) {
        this.anaDateOfVisit3 = anaDateOfVisit3;
    }

    public double getAnaDateOfVisit4() {
        return anaDateOfVisit4;
    }

    public void setAnaDateOfVisit4(double anaDateOfVisit4) {
        this.anaDateOfVisit4 = anaDateOfVisit4;
    }

    public double getAnaDateOfVisit5() {
        return anaDateOfVisit5;
    }

    public void setAnaDateOfVisit5(double anaDateOfVisit5) {
        this.anaDateOfVisit5 = anaDateOfVisit5;
    }

    public double getAnaDateOfVisit6() {
        return anaDateOfVisit6;
    }

    public void setAnaDateOfVisit6(double anaDateOfVisit6) {
        this.anaDateOfVisit6 = anaDateOfVisit6;
    }

    public double getAnaDateOfVisit7() {
        return anaDateOfVisit7;
    }

    public void setAnaDateOfVisit7(double anaDateOfVisit7) {
        this.anaDateOfVisit7 = anaDateOfVisit7;
    }

    public double getAnaDateOfVisit8() {
        return anaDateOfVisit8;
    }

    public void setAnaDateOfVisit8(double anaDateOfVisit8) {
        this.anaDateOfVisit8 = anaDateOfVisit8;
    }

    public double getAnaDateOfVisit9() {
        return anaDateOfVisit9;
    }

    public void setAnaDateOfVisit9(double anaDateOfVisit9) {
        this.anaDateOfVisit9 = anaDateOfVisit9;
    }

    public double getAnaDateOfVisit10() {
        return anaDateOfVisit10;
    }

    public void setAnaDateOfVisit10(double anaDateOfVisit10) {
        this.anaDateOfVisit10 = anaDateOfVisit10;
    }

    public double getDsDnaDateOfVisit1() {
        return dsDnaDateOfVisit1;
    }

    public void setDsDnaDateOfVisit1(double dsDnaDateOfVisit1) {
        this.dsDnaDateOfVisit1 = dsDnaDateOfVisit1;
    }

    public double getDsDnaDateOfVisit2() {
        return dsDnaDateOfVisit2;
    }

    public void setDsDnaDateOfVisit2(double dsDnaDateOfVisit2) {
        this.dsDnaDateOfVisit2 = dsDnaDateOfVisit2;
    }

    public double getDsDnaDateOfVisit3() {
        return dsDnaDateOfVisit3;
    }

    public void setDsDnaDateOfVisit3(double dsDnaDateOfVisit3) {
        this.dsDnaDateOfVisit3 = dsDnaDateOfVisit3;
    }

    public double getDsDnaDateOfVisit4() {
        return dsDnaDateOfVisit4;
    }

    public void setDsDnaDateOfVisit4(double dsDnaDateOfVisit4) {
        this.dsDnaDateOfVisit4 = dsDnaDateOfVisit4;
    }

    public double getDsDnaDateOfVisit5() {
        return dsDnaDateOfVisit5;
    }

    public void setDsDnaDateOfVisit5(double dsDnaDateOfVisit5) {
        this.dsDnaDateOfVisit5 = dsDnaDateOfVisit5;
    }

    public double getDsDnaDateOfVisit6() {
        return dsDnaDateOfVisit6;
    }

    public void setDsDnaDateOfVisit6(double dsDnaDateOfVisit6) {
        this.dsDnaDateOfVisit6 = dsDnaDateOfVisit6;
    }

    public double getDsDnaDateOfVisit7() {
        return dsDnaDateOfVisit7;
    }

    public void setDsDnaDateOfVisit7(double dsDnaDateOfVisit7) {
        this.dsDnaDateOfVisit7 = dsDnaDateOfVisit7;
    }

    public double getDsDnaDateOfVisit8() {
        return dsDnaDateOfVisit8;
    }

    public void setDsDnaDateOfVisit8(double dsDnaDateOfVisit8) {
        this.dsDnaDateOfVisit8 = dsDnaDateOfVisit8;
    }

    public double getDsDnaDateOfVisit9() {
        return dsDnaDateOfVisit9;
    }

    public void setDsDnaDateOfVisit9(double dsDnaDateOfVisit9) {
        this.dsDnaDateOfVisit9 = dsDnaDateOfVisit9;
    }

    public double getDsDnaDateOfVisit10() {
        return dsDnaDateOfVisit10;
    }

    public void setDsDnaDateOfVisit10(double dsDnaDateOfVisit10) {
        this.dsDnaDateOfVisit10 = dsDnaDateOfVisit10;
    }

    public double getCaNcaDateOfVisit1() {
        return caNcaDateOfVisit1;
    }

    public void setCaNcaDateOfVisit1(double caNcaDateOfVisit1) {
        this.caNcaDateOfVisit1 = caNcaDateOfVisit1;
    }

    public double getCaNcaDateOfVisit2() {
        return caNcaDateOfVisit2;
    }

    public void setCaNcaDateOfVisit2(double caNcaDateOfVisit2) {
        this.caNcaDateOfVisit2 = caNcaDateOfVisit2;
    }

    public double getCaNcaDateOfVisit3() {
        return caNcaDateOfVisit3;
    }

    public void setCaNcaDateOfVisit3(double caNcaDateOfVisit3) {
        this.caNcaDateOfVisit3 = caNcaDateOfVisit3;
    }

    public double getCaNcaDateOfVisit4() {
        return caNcaDateOfVisit4;
    }

    public void setCaNcaDateOfVisit4(double caNcaDateOfVisit4) {
        this.caNcaDateOfVisit4 = caNcaDateOfVisit4;
    }

    public double getCaNcaDateOfVisit5() {
        return caNcaDateOfVisit5;
    }

    public void setCaNcaDateOfVisit5(double caNcaDateOfVisit5) {
        this.caNcaDateOfVisit5 = caNcaDateOfVisit5;
    }

    public double getCaNcaDateOfVisit6() {
        return caNcaDateOfVisit6;
    }

    public void setCaNcaDateOfVisit6(double caNcaDateOfVisit6) {
        this.caNcaDateOfVisit6 = caNcaDateOfVisit6;
    }

    public double getCaNcaDateOfVisit7() {
        return caNcaDateOfVisit7;
    }

    public void setCaNcaDateOfVisit7(double caNcaDateOfVisit7) {
        this.caNcaDateOfVisit7 = caNcaDateOfVisit7;
    }

    public double getCaNcaDateOfVisit8() {
        return caNcaDateOfVisit8;
    }

    public void setCaNcaDateOfVisit8(double caNcaDateOfVisit8) {
        this.caNcaDateOfVisit8 = caNcaDateOfVisit8;
    }

    public double getCaNcaDateOfVisit9() {
        return caNcaDateOfVisit9;
    }

    public void setCaNcaDateOfVisit9(double caNcaDateOfVisit9) {
        this.caNcaDateOfVisit9 = caNcaDateOfVisit9;
    }

    public double getCaNcaDateOfVisit10() {
        return caNcaDateOfVisit10;
    }

    public void setCaNcaDateOfVisit10(double caNcaDateOfVisit10) {
        this.caNcaDateOfVisit10 = caNcaDateOfVisit10;
    }

    public double getPaNcaDateOfVisit1() {
        return paNcaDateOfVisit1;
    }

    public void setPaNcaDateOfVisit1(double paNcaDateOfVisit1) {
        this.paNcaDateOfVisit1 = paNcaDateOfVisit1;
    }

    public double getPaNcaDateOfVisit2() {
        return paNcaDateOfVisit2;
    }

    public void setPaNcaDateOfVisit2(double paNcaDateOfVisit2) {
        this.paNcaDateOfVisit2 = paNcaDateOfVisit2;
    }

    public double getPaNcaDateOfVisit3() {
        return paNcaDateOfVisit3;
    }

    public void setPaNcaDateOfVisit3(double paNcaDateOfVisit3) {
        this.paNcaDateOfVisit3 = paNcaDateOfVisit3;
    }

    public double getPaNcaDateOfVisit4() {
        return paNcaDateOfVisit4;
    }

    public void setPaNcaDateOfVisit4(double paNcaDateOfVisit4) {
        this.paNcaDateOfVisit4 = paNcaDateOfVisit4;
    }

    public double getPaNcaDateOfVisit5() {
        return paNcaDateOfVisit5;
    }

    public void setPaNcaDateOfVisit5(double paNcaDateOfVisit5) {
        this.paNcaDateOfVisit5 = paNcaDateOfVisit5;
    }

    public double getPaNcaDateOfVisit6() {
        return paNcaDateOfVisit6;
    }

    public void setPaNcaDateOfVisit6(double paNcaDateOfVisit6) {
        this.paNcaDateOfVisit6 = paNcaDateOfVisit6;
    }

    public double getPaNcaDateOfVisit7() {
        return paNcaDateOfVisit7;
    }

    public void setPaNcaDateOfVisit7(double paNcaDateOfVisit7) {
        this.paNcaDateOfVisit7 = paNcaDateOfVisit7;
    }

    public double getPaNcaDateOfVisit8() {
        return paNcaDateOfVisit8;
    }

    public void setPaNcaDateOfVisit8(double paNcaDateOfVisit8) {
        this.paNcaDateOfVisit8 = paNcaDateOfVisit8;
    }

    public double getPaNcaDateOfVisit9() {
        return paNcaDateOfVisit9;
    }

    public void setPaNcaDateOfVisit9(double paNcaDateOfVisit9) {
        this.paNcaDateOfVisit9 = paNcaDateOfVisit9;
    }

    public double getPaNcaDateOfVisit10() {
        return paNcaDateOfVisit10;
    }

    public void setPaNcaDateOfVisit10(double paNcaDateOfVisit10) {
        this.paNcaDateOfVisit10 = paNcaDateOfVisit10;
    }

    public double getHbDateOfVisit1() {
        return hbDateOfVisit1;
    }

    public void setHbDateOfVisit1(double hbDateOfVisit1) {
        this.hbDateOfVisit1 = hbDateOfVisit1;
    }

    public double getHbDateOfVisit2() {
        return hbDateOfVisit2;
    }

    public void setHbDateOfVisit2(double hbDateOfVisit2) {
        this.hbDateOfVisit2 = hbDateOfVisit2;
    }

    public double getHbDateOfVisit3() {
        return hbDateOfVisit3;
    }

    public void setHbDateOfVisit3(double hbDateOfVisit3) {
        this.hbDateOfVisit3 = hbDateOfVisit3;
    }

    public double getHbDateOfVisit4() {
        return hbDateOfVisit4;
    }

    public void setHbDateOfVisit4(double hbDateOfVisit4) {
        this.hbDateOfVisit4 = hbDateOfVisit4;
    }

    public double getHbDateOfVisit5() {
        return hbDateOfVisit5;
    }

    public void setHbDateOfVisit5(double hbDateOfVisit5) {
        this.hbDateOfVisit5 = hbDateOfVisit5;
    }

    public double getHbDateOfVisit6() {
        return hbDateOfVisit6;
    }

    public void setHbDateOfVisit6(double hbDateOfVisit6) {
        this.hbDateOfVisit6 = hbDateOfVisit6;
    }

    public double getHbDateOfVisit7() {
        return hbDateOfVisit7;
    }

    public void setHbDateOfVisit7(double hbDateOfVisit7) {
        this.hbDateOfVisit7 = hbDateOfVisit7;
    }

    public double getHbDateOfVisit8() {
        return hbDateOfVisit8;
    }

    public void setHbDateOfVisit8(double hbDateOfVisit8) {
        this.hbDateOfVisit8 = hbDateOfVisit8;
    }

    public double getHbDateOfVisit9() {
        return hbDateOfVisit9;
    }

    public void setHbDateOfVisit9(double hbDateOfVisit9) {
        this.hbDateOfVisit9 = hbDateOfVisit9;
    }

    public double getHbDateOfVisit10() {
        return hbDateOfVisit10;
    }

    public void setHbDateOfVisit10(double hbDateOfVisit10) {
        this.hbDateOfVisit10 = hbDateOfVisit10;
    }

    public double getWbcDateOfVisit1() {
        return wbcDateOfVisit1;
    }

    public void setWbcDateOfVisit1(double wbcDateOfVisit1) {
        this.wbcDateOfVisit1 = wbcDateOfVisit1;
    }

    public double getWbcDateOfVisit2() {
        return wbcDateOfVisit2;
    }

    public void setWbcDateOfVisit2(double wbcDateOfVisit2) {
        this.wbcDateOfVisit2 = wbcDateOfVisit2;
    }

    public double getWbcDateOfVisit3() {
        return wbcDateOfVisit3;
    }

    public void setWbcDateOfVisit3(double wbcDateOfVisit3) {
        this.wbcDateOfVisit3 = wbcDateOfVisit3;
    }

    public double getWbcDateOfVisit4() {
        return wbcDateOfVisit4;
    }

    public void setWbcDateOfVisit4(double wbcDateOfVisit4) {
        this.wbcDateOfVisit4 = wbcDateOfVisit4;
    }

    public double getWbcDateOfVisit5() {
        return wbcDateOfVisit5;
    }

    public void setWbcDateOfVisit5(double wbcDateOfVisit5) {
        this.wbcDateOfVisit5 = wbcDateOfVisit5;
    }

    public double getWbcDateOfVisit6() {
        return wbcDateOfVisit6;
    }

    public void setWbcDateOfVisit6(double wbcDateOfVisit6) {
        this.wbcDateOfVisit6 = wbcDateOfVisit6;
    }

    public double getWbcDateOfVisit7() {
        return wbcDateOfVisit7;
    }

    public void setWbcDateOfVisit7(double wbcDateOfVisit7) {
        this.wbcDateOfVisit7 = wbcDateOfVisit7;
    }

    public double getWbcDateOfVisit8() {
        return wbcDateOfVisit8;
    }

    public void setWbcDateOfVisit8(double wbcDateOfVisit8) {
        this.wbcDateOfVisit8 = wbcDateOfVisit8;
    }

    public double getWbcDateOfVisit9() {
        return wbcDateOfVisit9;
    }

    public void setWbcDateOfVisit9(double wbcDateOfVisit9) {
        this.wbcDateOfVisit9 = wbcDateOfVisit9;
    }

    public double getWbcDateOfVisit10() {
        return wbcDateOfVisit10;
    }

    public void setWbcDateOfVisit10(double wbcDateOfVisit10) {
        this.wbcDateOfVisit10 = wbcDateOfVisit10;
    }

    public double getNdateOfVisit1() {
        return ndateOfVisit1;
    }

    public void setNdateOfVisit1(double ndateOfVisit1) {
        this.ndateOfVisit1 = ndateOfVisit1;
    }

    public double getNdateOfVisit2() {
        return ndateOfVisit2;
    }

    public void setNdateOfVisit2(double ndateOfVisit2) {
        this.ndateOfVisit2 = ndateOfVisit2;
    }

    public double getNdateOfVisit3() {
        return ndateOfVisit3;
    }

    public void setNdateOfVisit3(double ndateOfVisit3) {
        this.ndateOfVisit3 = ndateOfVisit3;
    }

    public double getNdateOfVisit4() {
        return ndateOfVisit4;
    }

    public void setNdateOfVisit4(double ndateOfVisit4) {
        this.ndateOfVisit4 = ndateOfVisit4;
    }

    public double getNdateOfVisit5() {
        return ndateOfVisit5;
    }

    public void setNdateOfVisit5(double ndateOfVisit5) {
        this.ndateOfVisit5 = ndateOfVisit5;
    }

    public double getNdateOfVisit6() {
        return ndateOfVisit6;
    }

    public void setNdateOfVisit6(double ndateOfVisit6) {
        this.ndateOfVisit6 = ndateOfVisit6;
    }

    public double getNdateOfVisit7() {
        return ndateOfVisit7;
    }

    public void setNdateOfVisit7(double ndateOfVisit7) {
        this.ndateOfVisit7 = ndateOfVisit7;
    }

    public double getNdateOfVisit8() {
        return ndateOfVisit8;
    }

    public void setNdateOfVisit8(double ndateOfVisit8) {
        this.ndateOfVisit8 = ndateOfVisit8;
    }

    public double getNdateOfVisit9() {
        return ndateOfVisit9;
    }

    public void setNdateOfVisit9(double ndateOfVisit9) {
        this.ndateOfVisit9 = ndateOfVisit9;
    }

    public double getNdateOfVisit10() {
        return ndateOfVisit10;
    }

    public void setNdateOfVisit10(double ndateOfVisit10) {
        this.ndateOfVisit10 = ndateOfVisit10;
    }

    public double getLdateOfVisit1() {
        return ldateOfVisit1;
    }

    public void setLdateOfVisit1(double ldateOfVisit1) {
        this.ldateOfVisit1 = ldateOfVisit1;
    }

    public double getLdateOfVisit2() {
        return ldateOfVisit2;
    }

    public void setLdateOfVisit2(double ldateOfVisit2) {
        this.ldateOfVisit2 = ldateOfVisit2;
    }

    public double getLdateOfVisit3() {
        return ldateOfVisit3;
    }

    public void setLdateOfVisit3(double ldateOfVisit3) {
        this.ldateOfVisit3 = ldateOfVisit3;
    }

    public double getLdateOfVisit4() {
        return ldateOfVisit4;
    }

    public void setLdateOfVisit4(double ldateOfVisit4) {
        this.ldateOfVisit4 = ldateOfVisit4;
    }

    public double getLdateOfVisit5() {
        return ldateOfVisit5;
    }

    public void setLdateOfVisit5(double ldateOfVisit5) {
        this.ldateOfVisit5 = ldateOfVisit5;
    }

    public double getLdateOfVisit6() {
        return ldateOfVisit6;
    }

    public void setLdateOfVisit6(double ldateOfVisit6) {
        this.ldateOfVisit6 = ldateOfVisit6;
    }

    public double getLdateOfVisit7() {
        return ldateOfVisit7;
    }

    public void setLdateOfVisit7(double ldateOfVisit7) {
        this.ldateOfVisit7 = ldateOfVisit7;
    }

    public double getLdateOfVisit8() {
        return ldateOfVisit8;
    }

    public void setLdateOfVisit8(double ldateOfVisit8) {
        this.ldateOfVisit8 = ldateOfVisit8;
    }

    public double getLdateOfVisit9() {
        return ldateOfVisit9;
    }

    public void setLdateOfVisit9(double ldateOfVisit9) {
        this.ldateOfVisit9 = ldateOfVisit9;
    }

    public double getLdateOfVisit10() {
        return ldateOfVisit10;
    }

    public void setLdateOfVisit10(double ldateOfVisit10) {
        this.ldateOfVisit10 = ldateOfVisit10;
    }

    public double getMdateOfVisit1() {
        return mdateOfVisit1;
    }

    public void setMdateOfVisit1(double mdateOfVisit1) {
        this.mdateOfVisit1 = mdateOfVisit1;
    }

    public double getMdateOfVisit2() {
        return mdateOfVisit2;
    }

    public void setMdateOfVisit2(double mdateOfVisit2) {
        this.mdateOfVisit2 = mdateOfVisit2;
    }

    public double getMdateOfVisit3() {
        return mdateOfVisit3;
    }

    public void setMdateOfVisit3(double mdateOfVisit3) {
        this.mdateOfVisit3 = mdateOfVisit3;
    }

    public double getMdateOfVisit4() {
        return mdateOfVisit4;
    }

    public void setMdateOfVisit4(double mdateOfVisit4) {
        this.mdateOfVisit4 = mdateOfVisit4;
    }

    public double getMdateOfVisit5() {
        return mdateOfVisit5;
    }

    public void setMdateOfVisit5(double mdateOfVisit5) {
        this.mdateOfVisit5 = mdateOfVisit5;
    }

    public double getMdateOfVisit6() {
        return mdateOfVisit6;
    }

    public void setMdateOfVisit6(double mdateOfVisit6) {
        this.mdateOfVisit6 = mdateOfVisit6;
    }

    public double getMdateOfVisit7() {
        return mdateOfVisit7;
    }

    public void setMdateOfVisit7(double mdateOfVisit7) {
        this.mdateOfVisit7 = mdateOfVisit7;
    }

    public double getMdateOfVisit8() {
        return mdateOfVisit8;
    }

    public void setMdateOfVisit8(double mdateOfVisit8) {
        this.mdateOfVisit8 = mdateOfVisit8;
    }

    public double getMdateOfVisit9() {
        return mdateOfVisit9;
    }

    public void setMdateOfVisit9(double mdateOfVisit9) {
        this.mdateOfVisit9 = mdateOfVisit9;
    }

    public double getMdateOfVisit10() {
        return mdateOfVisit10;
    }

    public void setMdateOfVisit10(double mdateOfVisit10) {
        this.mdateOfVisit10 = mdateOfVisit10;
    }

    public double getEdateOfVisit1() {
        return edateOfVisit1;
    }

    public void setEdateOfVisit1(double edateOfVisit1) {
        this.edateOfVisit1 = edateOfVisit1;
    }

    public double getEdateOfVisit2() {
        return edateOfVisit2;
    }

    public void setEdateOfVisit2(double edateOfVisit2) {
        this.edateOfVisit2 = edateOfVisit2;
    }

    public double getEdateOfVisit3() {
        return edateOfVisit3;
    }

    public void setEdateOfVisit3(double edateOfVisit3) {
        this.edateOfVisit3 = edateOfVisit3;
    }

    public double getEdateOfVisit4() {
        return edateOfVisit4;
    }

    public void setEdateOfVisit4(double edateOfVisit4) {
        this.edateOfVisit4 = edateOfVisit4;
    }

    public double getEdateOfVisit5() {
        return edateOfVisit5;
    }

    public void setEdateOfVisit5(double edateOfVisit5) {
        this.edateOfVisit5 = edateOfVisit5;
    }

    public double getEdateOfVisit6() {
        return edateOfVisit6;
    }

    public void setEdateOfVisit6(double edateOfVisit6) {
        this.edateOfVisit6 = edateOfVisit6;
    }

    public double getEdateOfVisit7() {
        return edateOfVisit7;
    }

    public void setEdateOfVisit7(double edateOfVisit7) {
        this.edateOfVisit7 = edateOfVisit7;
    }

    public double getEdateOfVisit8() {
        return edateOfVisit8;
    }

    public void setEdateOfVisit8(double edateOfVisit8) {
        this.edateOfVisit8 = edateOfVisit8;
    }

    public double getEdateOfVisit9() {
        return edateOfVisit9;
    }

    public void setEdateOfVisit9(double edateOfVisit9) {
        this.edateOfVisit9 = edateOfVisit9;
    }

    public double getEdateOfVisit10() {
        return edateOfVisit10;
    }

    public void setEdateOfVisit10(double edateOfVisit10) {
        this.edateOfVisit10 = edateOfVisit10;
    }

    public double getPlateletsDateOfVisit1() {
        return plateletsDateOfVisit1;
    }

    public void setPlateletsDateOfVisit1(double plateletsDateOfVisit1) {
        this.plateletsDateOfVisit1 = plateletsDateOfVisit1;
    }

    public double getPlateletsDateOfVisit2() {
        return plateletsDateOfVisit2;
    }

    public void setPlateletsDateOfVisit2(double plateletsDateOfVisit2) {
        this.plateletsDateOfVisit2 = plateletsDateOfVisit2;
    }

    public double getPlateletsDateOfVisit3() {
        return plateletsDateOfVisit3;
    }

    public void setPlateletsDateOfVisit3(double plateletsDateOfVisit3) {
        this.plateletsDateOfVisit3 = plateletsDateOfVisit3;
    }

    public double getPlateletsDateOfVisit4() {
        return plateletsDateOfVisit4;
    }

    public void setPlateletsDateOfVisit4(double plateletsDateOfVisit4) {
        this.plateletsDateOfVisit4 = plateletsDateOfVisit4;
    }

    public double getPlateletsDateOfVisit5() {
        return plateletsDateOfVisit5;
    }

    public void setPlateletsDateOfVisit5(double plateletsDateOfVisit5) {
        this.plateletsDateOfVisit5 = plateletsDateOfVisit5;
    }

    public double getPlateletsDateOfVisit6() {
        return plateletsDateOfVisit6;
    }

    public void setPlateletsDateOfVisit6(double plateletsDateOfVisit6) {
        this.plateletsDateOfVisit6 = plateletsDateOfVisit6;
    }

    public double getPlateletsDateOfVisit7() {
        return plateletsDateOfVisit7;
    }

    public void setPlateletsDateOfVisit7(double plateletsDateOfVisit7) {
        this.plateletsDateOfVisit7 = plateletsDateOfVisit7;
    }

    public double getPlateletsDateOfVisit8() {
        return plateletsDateOfVisit8;
    }

    public void setPlateletsDateOfVisit8(double plateletsDateOfVisit8) {
        this.plateletsDateOfVisit8 = plateletsDateOfVisit8;
    }

    public double getPlateletsDateOfVisit9() {
        return plateletsDateOfVisit9;
    }

    public void setPlateletsDateOfVisit9(double plateletsDateOfVisit9) {
        this.plateletsDateOfVisit9 = plateletsDateOfVisit9;
    }

    public double getPlateletsDateOfVisit10() {
        return plateletsDateOfVisit10;
    }

    public void setPlateletsDateOfVisit10(double plateletsDateOfVisit10) {
        this.plateletsDateOfVisit10 = plateletsDateOfVisit10;
    }

    public double getSgotAstDateOfVisit1() {
        return sgotAstDateOfVisit1;
    }

    public void setSgotAstDateOfVisit1(double sgotAstDateOfVisit1) {
        this.sgotAstDateOfVisit1 = sgotAstDateOfVisit1;
    }

    public double getSgotAstDateOfVisit2() {
        return sgotAstDateOfVisit2;
    }

    public void setSgotAstDateOfVisit2(double sgotAstDateOfVisit2) {
        this.sgotAstDateOfVisit2 = sgotAstDateOfVisit2;
    }

    public double getSgotAstDateOfVisit3() {
        return sgotAstDateOfVisit3;
    }

    public void setSgotAstDateOfVisit3(double sgotAstDateOfVisit3) {
        this.sgotAstDateOfVisit3 = sgotAstDateOfVisit3;
    }

    public double getSgotAstDateOfVisit4() {
        return sgotAstDateOfVisit4;
    }

    public void setSgotAstDateOfVisit4(double sgotAstDateOfVisit4) {
        this.sgotAstDateOfVisit4 = sgotAstDateOfVisit4;
    }

    public double getSgotAstDateOfVisit5() {
        return sgotAstDateOfVisit5;
    }

    public void setSgotAstDateOfVisit5(double sgotAstDateOfVisit5) {
        this.sgotAstDateOfVisit5 = sgotAstDateOfVisit5;
    }

    public double getSgotAstDateOfVisit6() {
        return sgotAstDateOfVisit6;
    }

    public void setSgotAstDateOfVisit6(double sgotAstDateOfVisit6) {
        this.sgotAstDateOfVisit6 = sgotAstDateOfVisit6;
    }

    public double getSgotAstDateOfVisit7() {
        return sgotAstDateOfVisit7;
    }

    public void setSgotAstDateOfVisit7(double sgotAstDateOfVisit7) {
        this.sgotAstDateOfVisit7 = sgotAstDateOfVisit7;
    }

    public double getSgotAstDateOfVisit8() {
        return sgotAstDateOfVisit8;
    }

    public void setSgotAstDateOfVisit8(double sgotAstDateOfVisit8) {
        this.sgotAstDateOfVisit8 = sgotAstDateOfVisit8;
    }

    public double getSgotAstDateOfVisit9() {
        return sgotAstDateOfVisit9;
    }

    public void setSgotAstDateOfVisit9(double sgotAstDateOfVisit9) {
        this.sgotAstDateOfVisit9 = sgotAstDateOfVisit9;
    }

    public double getSgotAstDateOfVisit10() {
        return sgotAstDateOfVisit10;
    }

    public void setSgotAstDateOfVisit10(double sgotAstDateOfVisit10) {
        this.sgotAstDateOfVisit10 = sgotAstDateOfVisit10;
    }

    public double getSgptAltDateOfVisit1() {
        return sgptAltDateOfVisit1;
    }

    public void setSgptAltDateOfVisit1(double sgptAltDateOfVisit1) {
        this.sgptAltDateOfVisit1 = sgptAltDateOfVisit1;
    }

    public double getSgptAltDateOfVisit2() {
        return sgptAltDateOfVisit2;
    }

    public void setSgptAltDateOfVisit2(double sgptAltDateOfVisit2) {
        this.sgptAltDateOfVisit2 = sgptAltDateOfVisit2;
    }

    public double getSgptAltDateOfVisit3() {
        return sgptAltDateOfVisit3;
    }

    public void setSgptAltDateOfVisit3(double sgptAltDateOfVisit3) {
        this.sgptAltDateOfVisit3 = sgptAltDateOfVisit3;
    }

    public double getSgptAltDateOfVisit4() {
        return sgptAltDateOfVisit4;
    }

    public void setSgptAltDateOfVisit4(double sgptAltDateOfVisit4) {
        this.sgptAltDateOfVisit4 = sgptAltDateOfVisit4;
    }

    public double getSgptAltDateOfVisit5() {
        return sgptAltDateOfVisit5;
    }

    public void setSgptAltDateOfVisit5(double sgptAltDateOfVisit5) {
        this.sgptAltDateOfVisit5 = sgptAltDateOfVisit5;
    }

    public double getSgptAltDateOfVisit6() {
        return sgptAltDateOfVisit6;
    }

    public void setSgptAltDateOfVisit6(double sgptAltDateOfVisit6) {
        this.sgptAltDateOfVisit6 = sgptAltDateOfVisit6;
    }

    public double getSgptAltDateOfVisit7() {
        return sgptAltDateOfVisit7;
    }

    public void setSgptAltDateOfVisit7(double sgptAltDateOfVisit7) {
        this.sgptAltDateOfVisit7 = sgptAltDateOfVisit7;
    }

    public double getSgptAltDateOfVisit8() {
        return sgptAltDateOfVisit8;
    }

    public void setSgptAltDateOfVisit8(double sgptAltDateOfVisit8) {
        this.sgptAltDateOfVisit8 = sgptAltDateOfVisit8;
    }

    public double getSgptAltDateOfVisit9() {
        return sgptAltDateOfVisit9;
    }

    public void setSgptAltDateOfVisit9(double sgptAltDateOfVisit9) {
        this.sgptAltDateOfVisit9 = sgptAltDateOfVisit9;
    }

    public double getSgptAltDateOfVisit10() {
        return sgptAltDateOfVisit10;
    }

    public void setSgptAltDateOfVisit10(double sgptAltDateOfVisit10) {
        this.sgptAltDateOfVisit10 = sgptAltDateOfVisit10;
    }

    public double getSbilirubinDateOfVisit1() {
        return sbilirubinDateOfVisit1;
    }

    public void setSbilirubinDateOfVisit1(double sbilirubinDateOfVisit1) {
        this.sbilirubinDateOfVisit1 = sbilirubinDateOfVisit1;
    }

    public double getSbilirubinDateOfVisit2() {
        return sbilirubinDateOfVisit2;
    }

    public void setSbilirubinDateOfVisit2(double sbilirubinDateOfVisit2) {
        this.sbilirubinDateOfVisit2 = sbilirubinDateOfVisit2;
    }

    public double getSbilirubinDateOfVisit3() {
        return sbilirubinDateOfVisit3;
    }

    public void setSbilirubinDateOfVisit3(double sbilirubinDateOfVisit3) {
        this.sbilirubinDateOfVisit3 = sbilirubinDateOfVisit3;
    }

    public double getSbilirubinDateOfVisit4() {
        return sbilirubinDateOfVisit4;
    }

    public void setSbilirubinDateOfVisit4(double sbilirubinDateOfVisit4) {
        this.sbilirubinDateOfVisit4 = sbilirubinDateOfVisit4;
    }

    public double getSbilirubinDateOfVisit5() {
        return sbilirubinDateOfVisit5;
    }

    public void setSbilirubinDateOfVisit5(double sbilirubinDateOfVisit5) {
        this.sbilirubinDateOfVisit5 = sbilirubinDateOfVisit5;
    }

    public double getSbilirubinDateOfVisit6() {
        return sbilirubinDateOfVisit6;
    }

    public void setSbilirubinDateOfVisit6(double sbilirubinDateOfVisit6) {
        this.sbilirubinDateOfVisit6 = sbilirubinDateOfVisit6;
    }

    public double getSbilirubinDateOfVisit7() {
        return sbilirubinDateOfVisit7;
    }

    public void setSbilirubinDateOfVisit7(double sbilirubinDateOfVisit7) {
        this.sbilirubinDateOfVisit7 = sbilirubinDateOfVisit7;
    }

    public double getSbilirubinDateOfVisit8() {
        return sbilirubinDateOfVisit8;
    }

    public void setSbilirubinDateOfVisit8(double sbilirubinDateOfVisit8) {
        this.sbilirubinDateOfVisit8 = sbilirubinDateOfVisit8;
    }

    public double getSbilirubinDateOfVisit9() {
        return sbilirubinDateOfVisit9;
    }

    public void setSbilirubinDateOfVisit9(double sbilirubinDateOfVisit9) {
        this.sbilirubinDateOfVisit9 = sbilirubinDateOfVisit9;
    }

    public double getSbilirubinDateOfVisit10() {
        return sbilirubinDateOfVisit10;
    }

    public void setSbilirubinDateOfVisit10(double sbilirubinDateOfVisit10) {
        this.sbilirubinDateOfVisit10 = sbilirubinDateOfVisit10;
    }

    public double getScreatininDateOfVisit1() {
        return screatininDateOfVisit1;
    }

    public void setScreatininDateOfVisit1(double screatininDateOfVisit1) {
        this.screatininDateOfVisit1 = screatininDateOfVisit1;
    }

    public double getScreatininDateOfVisit2() {
        return screatininDateOfVisit2;
    }

    public void setScreatininDateOfVisit2(double screatininDateOfVisit2) {
        this.screatininDateOfVisit2 = screatininDateOfVisit2;
    }

    public double getScreatininDateOfVisit3() {
        return screatininDateOfVisit3;
    }

    public void setScreatininDateOfVisit3(double screatininDateOfVisit3) {
        this.screatininDateOfVisit3 = screatininDateOfVisit3;
    }

    public double getScreatininDateOfVisit4() {
        return screatininDateOfVisit4;
    }

    public void setScreatininDateOfVisit4(double screatininDateOfVisit4) {
        this.screatininDateOfVisit4 = screatininDateOfVisit4;
    }

    public double getScreatininDateOfVisit5() {
        return screatininDateOfVisit5;
    }

    public void setScreatininDateOfVisit5(double screatininDateOfVisit5) {
        this.screatininDateOfVisit5 = screatininDateOfVisit5;
    }

    public double getScreatininDateOfVisit6() {
        return screatininDateOfVisit6;
    }

    public void setScreatininDateOfVisit6(double screatininDateOfVisit6) {
        this.screatininDateOfVisit6 = screatininDateOfVisit6;
    }

    public double getScreatininDateOfVisit7() {
        return screatininDateOfVisit7;
    }

    public void setScreatininDateOfVisit7(double screatininDateOfVisit7) {
        this.screatininDateOfVisit7 = screatininDateOfVisit7;
    }

    public double getScreatininDateOfVisit8() {
        return screatininDateOfVisit8;
    }

    public void setScreatininDateOfVisit8(double screatininDateOfVisit8) {
        this.screatininDateOfVisit8 = screatininDateOfVisit8;
    }

    public double getScreatininDateOfVisit9() {
        return screatininDateOfVisit9;
    }

    public void setScreatininDateOfVisit9(double screatininDateOfVisit9) {
        this.screatininDateOfVisit9 = screatininDateOfVisit9;
    }

    public double getScreatininDateOfVisit10() {
        return screatininDateOfVisit10;
    }

    public void setScreatininDateOfVisit10(double screatininDateOfVisit10) {
        this.screatininDateOfVisit10 = screatininDateOfVisit10;
    }

    public double getFbsDateOfVisit1() {
        return fbsDateOfVisit1;
    }

    public void setFbsDateOfVisit1(double fbsDateOfVisit1) {
        this.fbsDateOfVisit1 = fbsDateOfVisit1;
    }

    public double getFbsDateOfVisit2() {
        return fbsDateOfVisit2;
    }

    public void setFbsDateOfVisit2(double fbsDateOfVisit2) {
        this.fbsDateOfVisit2 = fbsDateOfVisit2;
    }

    public double getFbsDateOfVisit3() {
        return fbsDateOfVisit3;
    }

    public void setFbsDateOfVisit3(double fbsDateOfVisit3) {
        this.fbsDateOfVisit3 = fbsDateOfVisit3;
    }

    public double getFbsDateOfVisit4() {
        return fbsDateOfVisit4;
    }

    public void setFbsDateOfVisit4(double fbsDateOfVisit4) {
        this.fbsDateOfVisit4 = fbsDateOfVisit4;
    }

    public double getFbsDateOfVisit5() {
        return fbsDateOfVisit5;
    }

    public void setFbsDateOfVisit5(double fbsDateOfVisit5) {
        this.fbsDateOfVisit5 = fbsDateOfVisit5;
    }

    public double getFbsDateOfVisit6() {
        return fbsDateOfVisit6;
    }

    public void setFbsDateOfVisit6(double fbsDateOfVisit6) {
        this.fbsDateOfVisit6 = fbsDateOfVisit6;
    }

    public double getFbsDateOfVisit7() {
        return fbsDateOfVisit7;
    }

    public void setFbsDateOfVisit7(double fbsDateOfVisit7) {
        this.fbsDateOfVisit7 = fbsDateOfVisit7;
    }

    public double getFbsDateOfVisit8() {
        return fbsDateOfVisit8;
    }

    public void setFbsDateOfVisit8(double fbsDateOfVisit8) {
        this.fbsDateOfVisit8 = fbsDateOfVisit8;
    }

    public double getFbsDateOfVisit9() {
        return fbsDateOfVisit9;
    }

    public void setFbsDateOfVisit9(double fbsDateOfVisit9) {
        this.fbsDateOfVisit9 = fbsDateOfVisit9;
    }

    public double getFbsDateOfVisit10() {
        return fbsDateOfVisit10;
    }

    public void setFbsDateOfVisit10(double fbsDateOfVisit10) {
        this.fbsDateOfVisit10 = fbsDateOfVisit10;
    }

    public double getSuricAcidDateOfVisit1() {
        return suricAcidDateOfVisit1;
    }

    public void setSuricAcidDateOfVisit1(double suricAcidDateOfVisit1) {
        this.suricAcidDateOfVisit1 = suricAcidDateOfVisit1;
    }

    public double getSuricAcidDateOfVisit2() {
        return suricAcidDateOfVisit2;
    }

    public void setSuricAcidDateOfVisit2(double suricAcidDateOfVisit2) {
        this.suricAcidDateOfVisit2 = suricAcidDateOfVisit2;
    }

    public double getSuricAcidDateOfVisit3() {
        return suricAcidDateOfVisit3;
    }

    public void setSuricAcidDateOfVisit3(double suricAcidDateOfVisit3) {
        this.suricAcidDateOfVisit3 = suricAcidDateOfVisit3;
    }

    public double getSuricAcidDateOfVisit4() {
        return suricAcidDateOfVisit4;
    }

    public void setSuricAcidDateOfVisit4(double suricAcidDateOfVisit4) {
        this.suricAcidDateOfVisit4 = suricAcidDateOfVisit4;
    }

    public double getSuricAcidDateOfVisit5() {
        return suricAcidDateOfVisit5;
    }

    public void setSuricAcidDateOfVisit5(double suricAcidDateOfVisit5) {
        this.suricAcidDateOfVisit5 = suricAcidDateOfVisit5;
    }

    public double getSuricAcidDateOfVisit6() {
        return suricAcidDateOfVisit6;
    }

    public void setSuricAcidDateOfVisit6(double suricAcidDateOfVisit6) {
        this.suricAcidDateOfVisit6 = suricAcidDateOfVisit6;
    }

    public double getSuricAcidDateOfVisit7() {
        return suricAcidDateOfVisit7;
    }

    public void setSuricAcidDateOfVisit7(double suricAcidDateOfVisit7) {
        this.suricAcidDateOfVisit7 = suricAcidDateOfVisit7;
    }

    public double getSuricAcidDateOfVisit8() {
        return suricAcidDateOfVisit8;
    }

    public void setSuricAcidDateOfVisit8(double suricAcidDateOfVisit8) {
        this.suricAcidDateOfVisit8 = suricAcidDateOfVisit8;
    }

    public double getSuricAcidDateOfVisit9() {
        return suricAcidDateOfVisit9;
    }

    public void setSuricAcidDateOfVisit9(double suricAcidDateOfVisit9) {
        this.suricAcidDateOfVisit9 = suricAcidDateOfVisit9;
    }

    public double getSuricAcidDateOfVisit10() {
        return suricAcidDateOfVisit10;
    }

    public void setSuricAcidDateOfVisit10(double suricAcidDateOfVisit10) {
        this.suricAcidDateOfVisit10 = suricAcidDateOfVisit10;
    }

    public double getUfrDateOfVisit1() {
        return ufrDateOfVisit1;
    }

    public void setUfrDateOfVisit1(double ufrDateOfVisit1) {
        this.ufrDateOfVisit1 = ufrDateOfVisit1;
    }

    public double getUfrDateOfVisit2() {
        return ufrDateOfVisit2;
    }

    public void setUfrDateOfVisit2(double ufrDateOfVisit2) {
        this.ufrDateOfVisit2 = ufrDateOfVisit2;
    }

    public double getUfrDateOfVisit3() {
        return ufrDateOfVisit3;
    }

    public void setUfrDateOfVisit3(double ufrDateOfVisit3) {
        this.ufrDateOfVisit3 = ufrDateOfVisit3;
    }

    public double getUfrDateOfVisit4() {
        return ufrDateOfVisit4;
    }

    public void setUfrDateOfVisit4(double ufrDateOfVisit4) {
        this.ufrDateOfVisit4 = ufrDateOfVisit4;
    }

    public double getUfrDateOfVisit5() {
        return ufrDateOfVisit5;
    }

    public void setUfrDateOfVisit5(double ufrDateOfVisit5) {
        this.ufrDateOfVisit5 = ufrDateOfVisit5;
    }

    public double getUfrDateOfVisit6() {
        return ufrDateOfVisit6;
    }

    public void setUfrDateOfVisit6(double ufrDateOfVisit6) {
        this.ufrDateOfVisit6 = ufrDateOfVisit6;
    }

    public double getUfrDateOfVisit7() {
        return ufrDateOfVisit7;
    }

    public void setUfrDateOfVisit7(double ufrDateOfVisit7) {
        this.ufrDateOfVisit7 = ufrDateOfVisit7;
    }

    public double getUfrDateOfVisit8() {
        return ufrDateOfVisit8;
    }

    public void setUfrDateOfVisit8(double ufrDateOfVisit8) {
        this.ufrDateOfVisit8 = ufrDateOfVisit8;
    }

    public double getUfrDateOfVisit9() {
        return ufrDateOfVisit9;
    }

    public void setUfrDateOfVisit9(double ufrDateOfVisit9) {
        this.ufrDateOfVisit9 = ufrDateOfVisit9;
    }

    public double getUfrDateOfVisit10() {
        return ufrDateOfVisit10;
    }

    public void setUfrDateOfVisit10(double ufrDateOfVisit10) {
        this.ufrDateOfVisit10 = ufrDateOfVisit10;
    }
 
 
 
 
    
}
