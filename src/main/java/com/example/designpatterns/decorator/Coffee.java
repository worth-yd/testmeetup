package com.example.designpatterns.decorator;

public class Coffee extends Beverage {
    public Coffee()
    {
        description ="kahve";
    }
    @Override
    public String getDescription()
    {
        return description;
    }

    @Override
    public double dubleCost() {
        return 20;
    }

    @Override
    public double cost() {
        return 0;
    }

    public String getCost()
    {
        return "10";
    }

}
