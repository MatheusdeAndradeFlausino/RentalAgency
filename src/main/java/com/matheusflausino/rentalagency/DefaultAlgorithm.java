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
public class DefaultAlgorithm extends Algorithm{

    public DefaultAlgorithm() {
        super();
        this.readFile("/home/vanderlei/teste.txt");
    }
   
    
    @Override
    public void calculeSolution() {
        for (Input input : this.inputs) {
            input.print();
        }
    }
    
}
