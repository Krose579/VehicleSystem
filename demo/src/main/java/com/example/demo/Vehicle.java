package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle")
public class Vehicle {
    @Id
    private String vin;
    private Integer year;
    private Make make;
    private Model model;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Make getMake() {
        return make;
    }

    public void setMake(Make make) {
        this.make = make;
    }

    public Model getModel() {
        return model;
    }
    
    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle [make=" + make + ", model=" + model + ", vin=" + vin + ", year=" + year + "]";
    }
}
