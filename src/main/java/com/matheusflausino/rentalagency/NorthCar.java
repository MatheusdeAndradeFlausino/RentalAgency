/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.matheusflausino.rentalagency;

import com.matheusflausino.rentalagency.cars.Category;

/**
 *
 * @author vanderlei
 */
public class NorthCar extends RentalAgency {
    
    @Override
    public String getRentalAgencyName() {
        return "NorthCar";
    }

    @Override
    public double getWeekendSpecialPrice() {
        return 590d;
    }

    @Override
    public double getWeekendNormalPrice() {
        return 600d;
    }

    @Override
    public double getNoWeekendSpecialPrice() {
        return 580d;
    }

    @Override
    public double getNoWeekendNormalPrice() {
        return 630d;
    }
    
    @Override
    public Category getCarCategory() {
        return Category.SUV;
    }
}
