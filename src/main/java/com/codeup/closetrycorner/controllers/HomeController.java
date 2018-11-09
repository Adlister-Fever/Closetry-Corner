package com.codeup.closetrycorner.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//get mapping for /
@Controller
public class HomeController {
    @GetMapping("/")
    public String landing(){
        return "index";
    }

    @GetMapping("/closet")
    public String closet(){ return "closet";}
}
