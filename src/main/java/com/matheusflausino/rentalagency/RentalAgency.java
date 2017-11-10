/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.matheusflausino.rentalagency;

/**
 *
 * @author vanderlei
 */
public abstract class RentalAgency {
    private double rate;
    private double weekendRate;
    private double normalPrice;
    private double specialPrice;

    public RentalAgency() {
    }
    
    public RentalAgency(double rate, double weekendRate, double normalPrice, double specialPrice) {
        this.rate = rate;
        this.weekendRate = weekendRate;
        this.normalPrice = normalPrice;
        this.specialPrice = specialPrice;
    }
    
    public abstract String getRentalAgencyName();

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getWeekendRate() {
        return weekendRate;
    }

    public void setWeekendRate(double weekendRate) {
        this.weekendRate = weekendRate;
    }

    public double getNormalPrice() {
        return normalPrice;
    }

    public void setNormalPrice(double normalPrice) {
        this.normalPrice = normalPrice;
    }

    public double getSpecialPrice() {
        return specialPrice;
    }

    public void setSpecialPrice(double specialPrice) {
        this.specialPrice = specialPrice;
    }   
    
}
