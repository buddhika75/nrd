/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gov.health.nrd.enums;

/**
 *
 * @author User
 */
public class ResponseData {
    ResponseCategory category;
    Response response;
    Place place;
    int number;
    double percentage;

    int excellentNumber;
    int goodNumber;
    int averageNumber;
    int poorNumber;
    int worstNumber;
    int noResponseNumber;

    public int getNoResponseNumber() {
        return noResponseNumber;
    }

    public void setNoResponseNumber(int noResponseNumber) {
        this.noResponseNumber = noResponseNumber;
    }
    
    

    public int getExcellentNumber() {
        return excellentNumber;
    }

    public void setExcellentNumber(int excellentNumber) {
        this.excellentNumber = excellentNumber;
    }

    public int getGoodNumber() {
        return goodNumber;
    }

    public void setGoodNumber(int goodNumber) {
        this.goodNumber = goodNumber;
    }

    public int getAverageNumber() {
        return averageNumber;
    }

    public void setAverageNumber(int averageNumber) {
        this.averageNumber = averageNumber;
    }

    public int getPoorNumber() {
        return poorNumber;
    }

    public void setPoorNumber(int poorNumber) {
        this.poorNumber = poorNumber;
    }

    public int getWorstNumber() {
        return worstNumber;
    }

    public void setWorstNumber(int worstNumber) {
        this.worstNumber = worstNumber;
    }
    
    
    
    public ResponseCategory getCategory() {
        return category;
    }

    public void setCategory(ResponseCategory category) {
        this.category = category;
    }

    
    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
    
    
}
