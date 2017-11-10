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
public abstract class RentalAgency {

    public abstract String getRentalAgencyName();

    public abstract double getWeekendSpecialPrice();

    public abstract double getWeekendNormalPrice();

    public abstract double getNoWeekendSpecialPrice();

    public abstract double getNoWeekendNormalPrice();

    public abstract Category getCarCategory();

    public double getPrice(boolean isWeekEnd, boolean isPremium) {
        if (isWeekEnd) {
            if (isPremium) {
                return getWeekendSpecialPrice();
            }
            return getWeekendNormalPrice();
        } else {
            if (isPremium) {
                return getNoWeekendSpecialPrice();
            }
            return getNoWeekendNormalPrice();
        }
    }

}
