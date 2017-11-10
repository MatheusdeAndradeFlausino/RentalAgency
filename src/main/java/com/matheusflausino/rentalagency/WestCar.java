package com.matheusflausino.rentalagency;

import com.matheusflausino.rentalagency.cars.Category;

/**
 *
 * @author vanderlei
 */
public class WestCar extends RentalAgency{
        
    @Override
    public String getRentalAgencyName() {
        return "WestCar";
    }

    @Override
    public double getWeekendSpecialPrice() {
        return 90d;
    }

    @Override
    public double getWeekendNormalPrice() {
        return 200d;
    }

    @Override
    public double getNoWeekendSpecialPrice() {
        return 150d;
    }

    @Override
    public double getNoWeekendNormalPrice() {
        return 530d;
    }
    
    @Override
    public Category getCarCategory() {
        return Category.SPORT;
    }
    
}
