/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gov.health.dailymail.controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import lk.gov.health.dailymail.enums.Place;
import lk.gov.health.dailymail.enums.Response;
import lk.gov.health.dailymail.enums.Sex;

/**
 *
 * @author User
 */
@ManagedBean
@ApplicationScoped
public class EnumController {

    /**
     * Creates a new instance of EnumController
     */
    public EnumController() {
    }

    public Sex[] getSexes() {
        return Sex.values();
    }

    public Place[] getPlaces(){
        return Place.values();
    }
    
    public Response[] getResponses(){
        return Response.values();
    }
    
}
