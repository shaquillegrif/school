package com.app.shaquille.lizards.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class Homecontroller {

    @Controller
    public class HomeController {

        @GetMapping("/")
        public String home() {
            return "index";
        }
    }
}
