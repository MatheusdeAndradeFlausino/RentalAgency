package com.matheusflausino.rentalagency.algorithms;

import com.matheusflausino.rentalagency.RentalAgency;
import com.matheusflausino.rentalagency.cars.Car;
import com.matheusflausino.rentalagency.exceptions.CrowdedCar;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author vanderlei
 */
public class DefaultAlgorithm extends Algorithm {

    public DefaultAlgorithm(URI path) throws CrowdedCar {
        super(path);
    }

    @Override
    public void calculeSolution(List<Car> cars, List<RentalAgency> agencies) {
        int i = 0;
        for (Input input : this.inputs) {
            Map<RentalAgency, List<Car>> bestAgencies = new HashMap<>();            
            double bestPrice = Double.MAX_VALUE;

            for (RentalAgency agency : agencies) {
                if (!agency.getCarCategory().isExceedingPassenger(input.getNrPassenger())) {
                    double actualPrice = 0;
                    for (String day : input.getWeekDays()) {
                        actualPrice += agency.getPrice(this.isWeekend(day), input.isIsSpecialPrice());
                    }
                    if (actualPrice < bestPrice) {
                        bestAgencies.clear();
                        bestAgencies.put(agency, this.getCarsFromCategory(cars, agency.getCarCategory()));
                        bestPrice = actualPrice;
                    }else if(actualPrice == bestPrice){
                        bestAgencies.put(agency, this.getCarsFromCategory(cars, agency.getCarCategory()));
                    }
                }
            }

            printResult(bestAgencies, i);
            i++;
        }
    }
    
    private void printResult(Map<RentalAgency, List<Car>> bestAgencies, int index) {
        System.out.println("OUTPUT " + index);
        for (Map.Entry<RentalAgency, List<Car>> entrySet : bestAgencies.entrySet()) {
            System.out.print("\t");
            RentalAgency agency = entrySet.getKey();
            List<Car> cars = entrySet.getValue();
            for (Car car : cars) {
                System.out.print(car.getModel() + " ");
            }
            System.out.println(":" + agency.getRentalAgencyName());
        }
    }

}
