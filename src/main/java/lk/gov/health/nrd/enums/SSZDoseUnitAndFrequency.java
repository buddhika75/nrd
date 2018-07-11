/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gov.health.nrd.enums;

/**
 *
 * @author HP
 */
public enum SSZDoseUnitAndFrequency {
     mgPerDay,
    mgPerBd,
    mgPerTd;
    
    
     public String getLabel() {
        switch (this) {
            case mgPerDay:
                return "mg/day";
            case mgPerBd:
                return "mg/bd";
             case mgPerTd:
                return "mg/td";    
        }
        return "Other";
    }
}
