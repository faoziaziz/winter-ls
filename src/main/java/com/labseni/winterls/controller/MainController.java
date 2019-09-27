package com.labseni.winterls.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path="/")

public class MainController{

    @GetMapping("/")
    public String homePage(@RequestParam(name="name", required=false, defaultValue="Labseni") String name, Model model) {
        model.addAttribute("name", name);
        return "pagedasar";
    }

    @GetMapping("/profile")
    public String profilePage(){
        return "profile";
    }

}