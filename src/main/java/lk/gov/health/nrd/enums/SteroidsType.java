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
public enum SteroidsType {
      Steroid_Prednisolone,
    Steroid_M_Prednisolone;
    
    
     public String getLabel() {
        switch (this) {
            case  Steroid_Prednisolone:
                return "Prednisolone";
            case Steroid_M_Prednisolone:
                return "M.Prednisolone";
        }
        return "Other";
    }
}