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
public enum DoseUnitAndFrequency {
    mgPerDay,
    mgPerBd;
    
    
     public String getLabel() {
        switch (this) {
            case mgPerDay:
                return "mg/day";
            case mgPerBd:
                return "mg/bd";
        }
        return "Other";
    }
}
