package com.example.designpatterns;

import com.example.designpatterns.decorator.Beverage;
import com.example.designpatterns.decorator.BrownCooked;
import com.example.designpatterns.decorator.Coffee;
import com.example.designpatterns.decorator.Milk;
import com.example.designpatterns.factory.Champion;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class serviceController {
//factory Pattern
  //  @RequestMapping("/{hero}")
    //public String Qat(@PathVariable("hero") String hero)
    //{
      //  return Champion.createChamp(hero).Qskillshot();

   // }
//Decorator Patterns
    @RequestMapping("/sa")
    public String DringORder()
    {
        Beverage bev = new Coffee();
        String name = bev.getDescription();
        bev = new Milk(bev);
        bev = new BrownCooked(bev);
        double fiyat = bev.dubleCost();
        String desc = bev.getDescription();
        return bev.getDescription();

    }
}
