/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gov.health.nrd.controllers;

import javax.faces.bean.ApplicationScoped;
import javax.inject.Named;
import lk.gov.health.nrd.entity.Occupation;
import lk.gov.health.nrd.entity.Race;
import lk.gov.health.nrd.entity.ReferredBy;
import lk.gov.health.nrd.entity.Religion;
import lk.gov.health.nrd.enums.Place;
import lk.gov.health.nrd.enums.Response;
import lk.gov.health.nrd.enums.ResponseCategory;
import lk.gov.health.nrd.enums.Sex;

/**
 *
 * @author User
 */
@Named
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

    public Place[] getPlaces() {
        return Place.values();
    }

    public Response[] getResponses() {
        return Response.values();
    }

    public ResponseCategory[] getResponseCategories() {
        return ResponseCategory.values();
    }

    public ReferredBy[] getReferredBys() {
        return ReferredBy.values();
    }

    public Occupation[] getOccupations() {
        return Occupation.values();
    }

    public Race[] getRaces() {
        return Race.values();
    }

    public Religion[] getReligions() {
        return Religion.values();
    }

}