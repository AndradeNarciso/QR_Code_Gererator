package com.andrade.generator_qr_code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class UserInterfaceController {
    
    @GetMapping("/")
    public String home(){
        return "home.html";
    }

}
