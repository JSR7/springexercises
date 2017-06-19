package com.codeup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by jsr on 6/19/17.
 */

@Controller
public class StaticController {

    @GetMapping("/resume")
    public String resume(){
        return "resume";
    }

    @GetMapping("/portfolio")
    public String portfolio(){
        return "portfolio";
    }

    



}
