package com.dbmsproject.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.core.model.Model;


@Controller
public class remcontroller {
    @GetMapping("/index")
    public String getind(Model model) {
        return "index";
    }
    
}
