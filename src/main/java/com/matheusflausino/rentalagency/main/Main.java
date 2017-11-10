package com.matheusflausino.rentalagency.main;

import com.matheusflausino.rentalagency.NorthCar;
import com.matheusflausino.rentalagency.RentalAgency;
import com.matheusflausino.rentalagency.SouthCar;
import com.matheusflausino.rentalagency.WestCar;
import com.matheusflausino.rentalagency.algorithms.Algorithm;
import com.matheusflausino.rentalagency.algorithms.DefaultAlgorithm;
import com.matheusflausino.rentalagency.algorithms.SimpleAlgorithm;
import com.matheusflausino.rentalagency.cars.Car;
import com.matheusflausino.rentalagency.cars.Category;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vanderlei
 */
public class Main {

    public static void populateAgencies(List<RentalAgency> agencies) {
        agencies.clear();
        agencies.add(new NorthCar());
        agencies.add(new SouthCar());
        agencies.add(new WestCar());
    }

    public static void populateCars(List<Car> cars) {
        cars.clear();
        cars.add(new Car(Category.COMPACT, "Argo"));
        cars.add(new Car(Category.SUV, "Navigator"));
        cars.add(new Car(Category.SPORT, "Ferrari"));
    }

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        List<RentalAgency> agencies = new ArrayList<>();

        Main.populateAgencies(agencies);
        Main.populateCars(cars);

        Algorithm algorithm;
        
        try {
            // colocar arquivo de instância no pacote src/main/resources e alterar o nome '/instace.txt' para referenciá-lo
            algorithm = new SimpleAlgorithm(Main.class.getResource("/instance.txt").toURI());
            algorithm.calculeSolution(cars, agencies);
        } catch (URISyntaxException ex) {
            System.out.println("Erro -> " + ex.getMessage());
        }        
       
    }

}
