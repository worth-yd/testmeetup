package com.example.designpatterns.facoryimp;

import com.example.designpatterns.factory.Lolchampion;
import org.springframework.stereotype.Component;

@Component
public class Ahri implements Lolchampion {
    @Override
    public String Qskillshot() {
        return "Huge Ball";
    }

    @Override
    public String getChampname() {
        return "Ahri";
    }
}
