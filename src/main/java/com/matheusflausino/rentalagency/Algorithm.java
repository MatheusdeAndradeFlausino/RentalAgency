/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.matheusflausino.rentalagency;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
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

    public abstract void calculeSolution();

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
                for (String date : dates) {
                    Pattern p = Pattern.compile("\\((.*?)\\)");
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

    public boolean isWeekend(String day) {
        return weekDays.contains(day);
    }
    
    public void print(){
        System.out.println("Is Special Price? " + this.isSpecialPrice);
        System.out.println("Number Passengers " + this.nrPassenger);
        for (String weekDay : weekDays) {
            System.out.print(weekDay + " ");
        }
        System.out.println("");
    }

}
