package com.matheusflausino.rentalagency.exceptions;

/**
 *
 * @author vanderlei
 */
public class CrowdedCar extends Exception {

    private final String line;
        
    public CrowdedCar(String line) {
        this.line = line;
    }

    public String getLine() {
        return line;
    }
    
}
