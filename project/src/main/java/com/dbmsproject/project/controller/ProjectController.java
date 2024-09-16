package com.dbmsproject.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbmsproject.project.entity.Props;
import com.dbmsproject.project.service.ProjectService;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/hello")
public class ProjectController {

    @Autowired
    private ProjectService projectService;
   

    @GetMapping
    public String getit(){
        return "Hello";
    }

    // @GetMapping("/ind")
    // public String showpage(){
    //     return "index";
    // }

    @PostMapping
    public Props createEntry(@RequestBody Props props){
        projectService.saveEntry(props);
        return props;
    }
}


