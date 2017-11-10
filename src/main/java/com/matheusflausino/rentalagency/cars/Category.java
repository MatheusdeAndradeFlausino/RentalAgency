/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.matheusflausino.rentalagency.cars;

/**
 *
 * @author vanderlei
 */
public enum Category {

    SUV, COMPACT, SPORT;

    public int getMaxPassenger() {
        switch (this) {
            case SUV:
                return 7;
            case COMPACT:
                return 4;
            case SPORT:
                return 2;
            default:
                return 0;
        }
    }
    
    public boolean isExceedingPassenger(int nrPassenger){
        return nrPassenger > this.getMaxPassenger();
    }
}
