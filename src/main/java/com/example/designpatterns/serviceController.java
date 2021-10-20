package com.example.designpatterns;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class serviceController {

    @RequestMapping("/")
    public String hello() {
        return  "selamlaraaa";
    }
}
