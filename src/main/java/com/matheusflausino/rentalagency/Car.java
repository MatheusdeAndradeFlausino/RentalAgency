/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.matheusflausino.rentalagency;

/**
 *
 * @author vanderlei
 */
public class Car {
    private Category category;
    private int nrMaxPassenger;

    public Car() {
    }

    public Car(Category category, int nrMaxPassenger) {
        this.category = category;
        this.nrMaxPassenger = nrMaxPassenger;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getNrMaxPassenger() {
        return nrMaxPassenger;
    }

    public void setNrMaxPassenger(int nrMaxPassenger) {
        this.nrMaxPassenger = nrMaxPassenger;
    }
   
}
