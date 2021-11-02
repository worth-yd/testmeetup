package com.example.designpatterns.decorator;

public class Milk extends CondimentDecorator{
    Beverage bev;

    public Milk(Beverage beverage)
    {
        this.bev = beverage;
    }
    @Override
    public String getDescription() {
        return bev.description + " Sütlü";
    }

    @Override
    public double cost() {
        return bev.cost();
    }

    @Override
    public double dubleCost() {
        return bev.dubleCost()+cost();
    }
}
