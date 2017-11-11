package com.matheusflausino.rentalagency.algorithms;

import com.matheusflausino.rentalagency.RentalAgency;
import com.matheusflausino.rentalagency.cars.Car;
import com.matheusflausino.rentalagency.exceptions.CrowdedCar;
import java.net.URI;
import java.util.List;

/**
 *
 * @author vanderlei
 */
public class SimpleAlgorithm extends Algorithm {

    public SimpleAlgorithm(URI path) throws CrowdedCar {
        super(path);
    }

    @Override
    public void calculeSolution(List<Car> cars, List<RentalAgency> agencies) {
        int i = 0;
        for (Input input : this.inputs) {
            RentalAgency bestAgency = null;
            List<Car> carsFromBestAgency = null;
            double bestPrice = Double.MAX_VALUE;

            for (RentalAgency agency : agencies) {
                if (!agency.getCarCategory().isExceedingPassenger(input.getNrPassenger())) {
                    double actualPrice = 0;
                    for (String day : input.getWeekDays()) {
                        actualPrice += agency.getPrice(this.isWeekend(day), input.isIsSpecialPrice());
                    }
                    if (actualPrice < bestPrice) {
                        bestAgency = agency;
                        carsFromBestAgency = this.getCarsFromCategory(cars, agency.getCarCategory());
                        bestPrice = actualPrice;
                    }
                }
            }

            printResult(bestAgency, carsFromBestAgency, i);
            i++;
        }
    }

    private void printResult(RentalAgency agency, List<Car> listCarsFromBestAgency, int index) {
        System.out.println("OUTPUT: " + index);
        System.out.print("\t");
        for (Car car : listCarsFromBestAgency) {
            System.out.print(car.getModel() + " ");
        }
        System.out.println(": " + agency.getRentalAgencyName());
    }

}
