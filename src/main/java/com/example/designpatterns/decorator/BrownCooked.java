package com.example.designpatterns.decorator;

public class BrownCooked extends CondimentDecorator {
    Beverage bev;
    public  BrownCooked(Beverage beverage)
    {
        this.bev = beverage;
    }
    @Override
    public double dubleCost() {
        return this.bev.dubleCost();
    }

    @Override
    public String getDescription() {
        return this.bev.description + " Kavrulmuş";
    }

    @Override
    public double cost() {
       return this.bev.cost() ;
    }
}
