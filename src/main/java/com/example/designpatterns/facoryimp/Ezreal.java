package com.example.designpatterns.facoryimp;

import com.example.designpatterns.factory.Lolchampion;
import org.springframework.stereotype.Component;

@Component
public class Ezreal implements Lolchampion {

    @Override
    public String Qskillshot() {
        return "mistic shot";
    }

    @Override
    public String getChampname() {
        return "Ezreal";
    }
}
