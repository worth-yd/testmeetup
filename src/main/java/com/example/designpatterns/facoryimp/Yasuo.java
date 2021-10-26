package com.example.designpatterns.facoryimp;

import com.example.designpatterns.factory.Lolchampion;
import org.springframework.stereotype.Component;

@Component
public class Yasuo implements Lolchampion {

    @Override
    public String Qskillshot() {
        return "tornado";
    }

    @Override
    public String getChampname() {
        return "Yasuo";
    }
}
