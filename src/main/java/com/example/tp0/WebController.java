package com.example.tp0;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class WebController {
    //@ Annotation pris en compte par le compilateur
    @RequestMapping("/")
    public String home(Model model) { //Partie back
        return "index"; //Partie front
    }

    @RequestMapping("/about")
    public String about(Model model) {
        return "about";
    }

    @RequestMapping("/form")
    public String see_form(Model model) {
        return "form";
    }

    @PostMapping("/submit")
    public String result(@RequestParam("name") String name, @RequestParam("email") String mail, Model model)//model est obligatoire pour afficher du contenue variable
        {
        model.addAttribute("name", name);
        model.addAttribute("email", mail);

        return "result";
    
    }
    
    
    
}
