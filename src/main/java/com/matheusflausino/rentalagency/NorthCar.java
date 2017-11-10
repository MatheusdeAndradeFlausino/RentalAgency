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
public class NorthCar extends RentalAgency {

    public NorthCar(double rate, double weekendRate, double normalPrice, double specialPrice) {
        super(rate, weekendRate, normalPrice, specialPrice);
    }    
    
    @Override
    public String getRentalAgencyName() {
        return "NorthCar";
    }
    
}
