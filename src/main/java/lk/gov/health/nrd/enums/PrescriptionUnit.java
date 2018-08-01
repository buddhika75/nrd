/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gov.health.nrd.enums;

/**
 *
 * @author rheumahealth2018
 */
public enum PrescriptionUnit {
    mgPerWeek,
    mgPerDay,
    mgPerbd,
    mgPertds,
    mgPerMornings,
    mgPerNights,
    mgPerMorningAndNights;
    
    
    
     public String getLabel() {
        switch (this) {
            case mgPerWeek:
                return "mg/wk";
            case mgPerDay:
                return "mg/dy";
            case mgPerbd:
                return "mg/bd";
            case mgPertds:
                return "mg/tds";
            case mgPerMornings:
                return "mane";
            case mgPerNights:
                return "nocte";
            case mgPerMorningAndNights:
                return "mane-nocte";
        }
        return "Other";
    }
}

    

