package com.matheusflausino.rentalagency.cars;

/**
 *
 * @author vanderlei
 */
public class Car {
    private Category category;
    private String model;

    public Car() {
    }

    public Car(Category category, String model) {
        this.category = category;
        this.model = model;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
           
}
