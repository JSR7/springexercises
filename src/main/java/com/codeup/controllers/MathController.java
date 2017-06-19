package com.codeup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jsr on 6/19/17.
 */
@Controller
public class MathController {


    @RequestMapping(path = "/increment/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String addOne(@PathVariable int number) {
        return number + " plus one is " + (number + 1) + "!";
    }


    @RequestMapping(path = "increment/{number}")

    @ResponseBody
        public String addTwo(@PathVariable int number) {
            return number + " plus two is" + (number + 2) + "!";
        }

    



}
