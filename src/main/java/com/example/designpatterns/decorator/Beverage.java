package com.example.designpatterns.decorator;

public abstract class Beverage {
    String description = "Drink";
    public String getDescription()
    {
        return  description;
    }
    public abstract double dubleCost();
    public abstract double cost();
}
