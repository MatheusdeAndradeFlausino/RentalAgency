package com.matheusflausino.rentalagency.main;

import com.matheusflausino.rentalagency.NorthCar;
import com.matheusflausino.rentalagency.RentalAgency;
import com.matheusflausino.rentalagency.SouthCar;
import com.matheusflausino.rentalagency.WestCar;
import com.matheusflausino.rentalagency.algorithms.Algorithm;
import com.matheusflausino.rentalagency.algorithms.DefaultAlgorithm;
import com.matheusflausino.rentalagency.algorithms.SimpleAlgorithm;
import com.matheusflausino.rentalagency.algorithms.SportsFanAlgorithm;
import com.matheusflausino.rentalagency.cars.Car;
import com.matheusflausino.rentalagency.cars.Category;
import com.matheusflausino.rentalagency.exceptions.CrowdedCar;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author vanderlei
 */
public class Main {

    /**
     * popula um List de RentalAgency com as filiais da locadora, se aparecer uma nova só adicioná-la aqui.
     * @param agencies um List que será populado com as agencias da locadora. 
     * 
     */
    public static void populateAgencies(List<RentalAgency> agencies) {
        agencies.clear();
        agencies.add(new NorthCar());
        agencies.add(new SouthCar());
        agencies.add(new WestCar());
    }
    
    /**
     * Popula os carros que serão utilizados no programa.
     * @param cars um List que será populado com os carros disponíveis nas agências.     * 
     */
    public static void populateCars(List<Car> cars) {
        cars.clear();
        cars.add(new Car(Category.COMPACT, "Argo"));
        cars.add(new Car(Category.COMPACT, "Fiesta"));
        cars.add(new Car(Category.COMPACT, "Uno"));
        cars.add(new Car(Category.COMPACT, "Monza"));
        cars.add(new Car(Category.SUV, "Navigator"));
        cars.add(new Car(Category.SPORT, "Ferrari"));
        cars.add(new Car(Category.SPORT, "Gallardo"));
    }

    public static Algorithm chooseOption() throws CrowdedCar, URISyntaxException {
        String instanceFileName;
        int opc = 1;
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o nome do arquivo de instância (sem a barra inicial). Ex: nome.formato");
        instanceFileName = "/" + s.nextLine();
        System.out.println("Escolha o algoritmo de execução");
        System.out.println("1 - Default Algorithm");
        System.out.println("2 - Simple Algorithm");
        System.out.println("3 - Sports Fan Algorithm");
        opc = s.nextInt();
        
        switch (opc) {
            case 1:
                return new DefaultAlgorithm(Main.class.getResource(instanceFileName).toURI());
            case 2:
                return new SimpleAlgorithm(Main.class.getResource(instanceFileName).toURI());
            case 3:
                return new SportsFanAlgorithm(Main.class.getResource(instanceFileName).toURI());
            default:
                return new DefaultAlgorithm(Main.class.getResource("/instance.txt").toURI());
        }        
    }

    public static void main(String[] args) {
        try {
            List<Car> cars = new ArrayList<>();
            List<RentalAgency> agencies = new ArrayList<>();
            
            populateAgencies(agencies);
            populateCars(cars);
            
            Algorithm algorithm = chooseOption();
            algorithm.calculeSolution(cars, agencies);
        } catch (CrowdedCar ex) {
            System.err.println("A linha do arquivo de instancia informado \n\t" + ex.getLine() + "\n possue um valor de passageiro maior que qualquer carro da locadora pode aceitar!");
        } catch (URISyntaxException ex) {
            System.err.println("Erro na URI (" + ex.getInput() +"). Mensagem: "+ ex.getMessage());
        } 
    }

}
