/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gov.health.dailymail.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import lk.gov.health.dailymail.enums.Place;
import lk.gov.health.dailymail.enums.Response;
import lk.gov.health.dailymail.enums.Sex;

/**
 *
 * @author User
 */
@Entity
public class Questionnaire implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ManyToOne
    Item position;
    @Enumerated(EnumType.STRING)
    Sex sex;
    Integer age;
    Integer servicePeriod;
    Integer institutionServicePeriod;
    
    @Enumerated(EnumType.STRING)
    Place place;
    
    @Enumerated(EnumType.STRING)
    Response increments;
    
    @Enumerated(EnumType.STRING)
    Response environment;
    
    @Enumerated(EnumType.STRING)
    Response clineliness;
    
    @Enumerated(EnumType.STRING)
    Response arrangement;
    
    @Enumerated(EnumType.STRING)
    Response groupWork;
    
    @Enumerated(EnumType.STRING)
    Response leadership;
    
    @Enumerated(EnumType.STRING)
    Response training;
    
    @Enumerated(EnumType.STRING)
    Response evaluation;
    
    @Enumerated(EnumType.STRING)
    Response wellfare;
    
    @Enumerated(EnumType.STRING)
    Response decpline;
    
    @Enumerated(EnumType.STRING)
    Response communication;
    
    @Enumerated(EnumType.STRING)
    Response discussions;
    
    @Enumerated(EnumType.STRING)
    Response requirement_Identification;
    
    @Enumerated(EnumType.STRING)
    Response quality_service;
    
    @Enumerated(EnumType.STRING)
    Response expectation_achievement;
    
    
    @Lob
    String suggestions;
    
    @Lob
    String expectingFacilities;
    
    
    
    @Temporal(javax.persistence.TemporalType.DATE)
    Date questionnaireDate;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date createdDate;
    
    @ManyToOne
    WebUser addedUser;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date addedDate;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    Date addedTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
    
    

    public Item getPosition() {
        return position;
    }

    public void setPosition(Item position) {
        this.position = position;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getServicePeriod() {
        return servicePeriod;
    }

    public void setServicePeriod(Integer servicePeriod) {
        this.servicePeriod = servicePeriod;
    }

    public Integer getInstitutionServicePeriod() {
        return institutionServicePeriod;
    }

    public void setInstitutionServicePeriod(Integer institutionServicePeriod) {
        this.institutionServicePeriod = institutionServicePeriod;
    }

    public Response getIncrements() {
        return increments;
    }

    public void setIncrements(Response increments) {
        this.increments = increments;
    }

    public Response getEnvironment() {
        return environment;
    }

    public void setEnvironment(Response environment) {
        this.environment = environment;
    }

    public Response getClineliness() {
        return clineliness;
    }

    public void setClineliness(Response clineliness) {
        this.clineliness = clineliness;
    }

    public Response getArrangement() {
        return arrangement;
    }

    public void setArrangement(Response arrangement) {
        this.arrangement = arrangement;
    }

    public Response getGroupWork() {
        return groupWork;
    }

    public void setGroupWork(Response groupWork) {
        this.groupWork = groupWork;
    }

    public Response getLeadership() {
        return leadership;
    }

    public void setLeadership(Response leadership) {
        this.leadership = leadership;
    }

    public Response getTraining() {
        return training;
    }

    public void setTraining(Response training) {
        this.training = training;
    }

    public Response getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(Response evaluation) {
        this.evaluation = evaluation;
    }

    public Response getWellfare() {
        return wellfare;
    }

    public void setWellfare(Response wellfare) {
        this.wellfare = wellfare;
    }

    public Response getDecpline() {
        return decpline;
    }

    public void setDecpline(Response decpline) {
        this.decpline = decpline;
    }

    public Response getCommunication() {
        return communication;
    }

    public void setCommunication(Response communication) {
        this.communication = communication;
    }

    public Response getDiscussions() {
        return discussions;
    }

    public void setDiscussions(Response discussions) {
        this.discussions = discussions;
    }

    public Response getRequirement_Identification() {
        return requirement_Identification;
    }

    public void setRequirement_Identification(Response requirement_Identification) {
        this.requirement_Identification = requirement_Identification;
    }

    public Response getQuality_service() {
        return quality_service;
    }

    public void setQuality_service(Response quality_service) {
        this.quality_service = quality_service;
    }

    public Response getExpectation_achievement() {
        return expectation_achievement;
    }

    public void setExpectation_achievement(Response expectation_achievement) {
        this.expectation_achievement = expectation_achievement;
    }

    public String getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(String suggestions) {
        this.suggestions = suggestions;
    }

    public String getExpectingFacilities() {
        return expectingFacilities;
    }

    public void setExpectingFacilities(String expectingFacilities) {
        this.expectingFacilities = expectingFacilities;
    }

    public Date getQuestionnaireDate() {
        return questionnaireDate;
    }

    public void setQuestionnaireDate(Date questionnaireDate) {
        this.questionnaireDate = questionnaireDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public WebUser getAddedUser() {
        return addedUser;
    }

    public void setAddedUser(WebUser addedUser) {
        this.addedUser = addedUser;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public Date getAddedTime() {
        return addedTime;
    }

    public void setAddedTime(Date addedTime) {
        this.addedTime = addedTime;
    }




    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Questionnaire)) {
            return false;
        }
        Questionnaire other = (Questionnaire) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lk.gov.health.dailymail.entity.Mail[ id=" + id + " ]";
    }
    
}
