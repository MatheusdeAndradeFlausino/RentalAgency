/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.matheusflausino.rentalagency.algorithms;

import com.matheusflausino.rentalagency.RentalAgency;
import com.matheusflausino.rentalagency.cars.Car;
import com.matheusflausino.rentalagency.cars.Category;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author vanderlei
 */
public abstract class Algorithm {

    protected LinkedList<Input> inputs;

    public Algorithm() {
        this.inputs = new LinkedList<>();
    }

    public abstract void calculeSolution(List<Car> cars, List<RentalAgency> agencies);

    public void readFile(String path) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = br.readLine();
            while (line != null) {
                Input input = new Input();
                String parts[] = line.split(":");
                input.setIsSpecialPrice(parts[0].equals("Premium"));
                input.setNrPassenger(Integer.parseInt(parts[1]));

                String dates[] = parts[2].split(",");
                ArrayList<String> days = new ArrayList<>();
                Pattern p = Pattern.compile("\\((.*?)\\)");
                
                for (String date : dates) {
                    Matcher m = p.matcher(date);

                    if (m.find()) {
                        days.add(m.group(1));
                    }
                }
                
                input.setWeekDays(days);
                this.inputs.add(input);
                line = br.readLine();
            }            
        } catch (FileNotFoundException ex) {
            System.out.println("Ocorreu um erro ao tentar abrir o arquivo! Path: " + path);
            System.out.println("Erro: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Ocorreu um erro ao tentar ler o arquivo! Path: " + path);
            System.out.println("Erro: " + ex.getMessage());
        }
    }
    
    public boolean isWeekend(String day) {
        return day.equals("sab") || day.equals("dom");
    }
    
    public List<Car> getCarsFromCategory(List<Car> cars, Category category){
        List<Car> selectedCars = new LinkedList<>();
        for (Car car : cars) {
            if(car.getCategory().equals(category))
                selectedCars.add(car);
        }
        return selectedCars;
    }

}

class Input {

    private boolean isSpecialPrice;
    private int nrPassenger;
    private ArrayList<String> weekDays;

    public Input() {
        this.weekDays = new ArrayList<>();
    }

    public boolean isIsSpecialPrice() {
        return isSpecialPrice;
    }

    public void setIsSpecialPrice(boolean isSpecialPrice) {
        this.isSpecialPrice = isSpecialPrice;
    }

    public int getNrPassenger() {
        return nrPassenger;
    }

    public void setNrPassenger(int nrPassenger) {
        this.nrPassenger = nrPassenger;
    }

    public ArrayList<String> getWeekDays() {
        return weekDays;
    }

    public void setWeekDays(ArrayList<String> weekDays) {
        this.weekDays = weekDays;
    }
    
    public void print(){
        System.out.println("Is Special Price? " + this.isSpecialPrice);
        System.out.println("Number Passengers " + this.nrPassenger);
        System.out.print(" Week days : ");
        for (String weekDay : weekDays) {
            System.out.print(weekDay + " ");
        }
        System.out.println("");
    }

}
