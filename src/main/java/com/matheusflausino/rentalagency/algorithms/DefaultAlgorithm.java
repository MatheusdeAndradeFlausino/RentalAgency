/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.matheusflausino.rentalagency.algorithms;

import com.matheusflausino.rentalagency.RentalAgency;
import com.matheusflausino.rentalagency.cars.Car;
import java.util.List;

/**
 *
 * @author vanderlei
 */
public class DefaultAlgorithm extends Algorithm{

    public DefaultAlgorithm(String path) {
        super();
        this.readFile(path);
    }   

    @Override
    public void calculeSolution(List<Car> cars, List<RentalAgency> agencies) {
        
    }
    
   
    
}
