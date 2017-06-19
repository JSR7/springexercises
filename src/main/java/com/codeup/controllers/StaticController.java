package com.codeup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Random;

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
    @GetMapping("/roll-dice")
    public String rolldice(@PathVariable String name, Number number){

        Random rand = new Random();

        int  randomdice = rand.nextInt(6) + 1;

        Number.addAttribute(number, number);

        return "roll-dice";
    }





}
