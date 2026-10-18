package com.glands.glandia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMappingcls;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String showHomePage(){
        return "/home/index";
    }
    
}
