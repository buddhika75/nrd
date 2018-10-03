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
import lk.gov.health.nrd.enums.AreaType;
import lk.gov.health.nrd.enums.JointInvolvement;
import lk.gov.health.nrd.enums.Place;
import lk.gov.health.nrd.enums.Response;
import lk.gov.health.nrd.enums.ResponseCategory;
import lk.gov.health.nrd.enums.Serology;
import lk.gov.health.nrd.enums.Sex;
import lk.gov.health.nrd.enums.AcutePhaseReactants;
import lk.gov.health.nrd.enums.CRPunits;
import lk.gov.health.nrd.enums.DoseUnitAndFrequency;
import lk.gov.health.nrd.enums.DurationOfSymptoms;
import lk.gov.health.nrd.enums.SSZDoseUnitAndFrequency;
import lk.gov.health.nrd.enums.SteroidsType;
import lk.gov.health.nrd.enums.PrescriptionUnit;
import lk.gov.health.nrd.enums.EsrCrp;
import lk.gov.health.nrd.enums.LupusNephritis;
import lk.gov.health.nrd.enums.PositiveNegative;

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

    
    public AreaType[] getAreaTypes() {
        return AreaType.values();
    }
    
    public JointInvolvement[] getJointInvolvements(){
        return JointInvolvement.values();
    }
    
    public Serology[] getSerology(){
        return Serology.values();
    }
 
    public AcutePhaseReactants[] getAcutePhaseReactants(){
        return AcutePhaseReactants.values();
    }
    
    public DurationOfSymptoms[] getDurationOfSymptoms(){
        return DurationOfSymptoms.values();
    }
    
    public DoseUnitAndFrequency[] getDoseUnitAndFrequencies(){
        return DoseUnitAndFrequency.values();
    }
    
    public CRPunits[] getCRPunits(){
        return CRPunits.values();
    }
    
    public SSZDoseUnitAndFrequency[] getSSZDoseUnitAndFrequency(){
        return SSZDoseUnitAndFrequency.values();
    }
    
    public SteroidsType[] getSteroidsType(){
    return SteroidsType.values();
    }
    
    public PrescriptionUnit[] getTreatmentUnit(){
    return PrescriptionUnit.values();
    }
   
    public EsrCrp[] getEsrCrp(){
    return EsrCrp.values();
    }
    
    public LupusNephritis[] getLupusNephritis(){
    return LupusNephritis.values();
    }
    
    public PositiveNegative[] getPositiveNegative(){
    return PositiveNegative.values();
    }
}
