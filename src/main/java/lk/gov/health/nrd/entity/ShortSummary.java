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
public class ShortSummary extends Encounter {
    




}
 
