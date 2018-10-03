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
public enum PositiveNegative {
    One,
    Two;
    public String getLabel() {
        switch (this){
            case One:
                return " Positive";
            case Two:
                return " Negative";
         }
        return "Other";
    }
    
}
