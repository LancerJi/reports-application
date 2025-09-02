package com.ashokit.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CitizenController {
    @GetMapping("/greet")
    public String greeting(){
        return "Welcome to my site";
    }
}
