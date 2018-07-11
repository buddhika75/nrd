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
public enum CRPunits {
     mgPerL,
    mgPerDl;
    
    
     public String getLabel() {
        switch (this) {
            case mgPerL:
                return "mg/l";
            case mgPerDl:
                return "mg/dl";
        }
        return "Other";
    }
}
