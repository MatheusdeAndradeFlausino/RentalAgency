package com.matheusflausino.rentalagency;

import com.matheusflausino.rentalagency.cars.Category;

/**
 *
 * @author vanderlei
 */
public class SouthCar extends RentalAgency{
    
    @Override
    public String getRentalAgencyName() {
        return "SouthCar";
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
        return 210d;
    }

    @Override
    public Category getCarCategory() {
        return Category.COMPACT;
    }
    
    
    
}
