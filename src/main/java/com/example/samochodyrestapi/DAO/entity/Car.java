package com.example.samochodyrestapi.DAO.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Car {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    private String model;

    private  String color;

    private LocalDate productionDate;

    public Car() {
    }

    public Car(long id, String model, String color ,LocalDate productionDate) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.productionDate = productionDate;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getProductionDate() {
        return this.productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
