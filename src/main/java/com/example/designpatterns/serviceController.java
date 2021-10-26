package com.example.designpatterns;

import com.example.designpatterns.factory.Champion;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class serviceController {

    @RequestMapping("/{hero}")
    public String Qat(@PathVariable("hero") String hero)
    {
        return Champion.createChamp(hero).Qskillshot();

    }
}
