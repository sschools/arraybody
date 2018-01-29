package com.example.arraybody.controller;

import com.example.arraybody.model.Information;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ArrayController {

    @RequestMapping(path = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        String[][] initial = Information.setUp();
        String[][] res = new String[3][3];
        model.addAttribute("initial", initial);
        model.addAttribute("res", res);
        return "index";
    }

    @RequestMapping(path = "/index", method = RequestMethod.POST)
    public String afterset(@RequestParam(value = "res") String[][] formArray, Model model) {
        System.out.println(formArray[0][0]);
        return "results";
    }
}
