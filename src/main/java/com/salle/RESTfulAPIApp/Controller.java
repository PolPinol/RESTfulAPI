package com.salle.RESTfulAPIApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/hello")
    public String sayHello(){
        return "Bye, World 15.0!";
    }
}

