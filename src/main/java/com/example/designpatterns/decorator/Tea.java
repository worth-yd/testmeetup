package com.example.designpatterns.decorator;

import java.security.PublicKey;

public class Tea extends Beverage{
    public Tea()
    {
        description = "tea";
    }

    @Override
    public double dubleCost() {
        return 6;
    }

    @Override
    public double cost() {
        return 0;
    }
}
