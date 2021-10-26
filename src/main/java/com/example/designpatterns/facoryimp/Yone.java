package com.example.designpatterns.facoryimp;

import com.example.designpatterns.factory.Lolchampion;
import org.springframework.stereotype.Component;

@Component
public class Yone implements Lolchampion {

    @Override
    public String Qskillshot() {
        return "same as yasuo";
    }

    @Override
    public String getChampname() {
        return "Yone";
    }
}
