package com.dbmsproject.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
@RequestMapping("/admin")
public class ProjectController {

    // @Autowired
    // private ProjectService projectService;
   

    // @GetMapping("/hello")
    // public String getit(){
    //     return "Hello";
    // }

    // // @GetMapping("/ind")
    // // public String showpage(){
    // //     return "index";
    // // }

    // @PreAuthorize("hasRole('USER')")
    // @GetMapping("/user")
    // public String userEndpoint() {
    //     return "Hello, User";
    // }

    // ///POST AUTHORIZATION IS ALSO THERE
    // @PreAuthorize("hasRole('ADMIN')")
    // @GetMapping("/admin")
    // public String adminEndpoint() {
    //     return "Hello, Admin";
    // }
    

    // @PostMapping("/hello")
    // public Props createEntry(@RequestBody Props props){
    //     projectService.saveEntry(props);
    //     return props;
    // }
    @GetMapping("/clients")
    public String clients(){
        return "client";
    }

    @GetMapping("/tasks")
    public String tasks(){
        return "task";
    }

    @GetMapping("/appointment")
    public String appointment(){
        return "appointment";
    }

    @GetMapping("/Invoice")
    public String invoice(){
        return "invoice";
    }

    @GetMapping("/dashboard")
    public String dashboard(){
        return "dashboard";
    }

    @GetMapping("/client/create")
    public String createclient(){
        return "createclient";
    }

    @GetMapping("/paralegal/create")
    public String createparalegal(){
        return "createparalegal";
    }

    @GetMapping("/lawyer/create")
    public String createlawyer(){
        return "createlawyer";
    }
}


