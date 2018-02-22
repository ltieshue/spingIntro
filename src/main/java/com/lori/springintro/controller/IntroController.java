package com.lori.springintro.controller;


import com.lori.springintro.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
public class IntroController {
    @RequestMapping("/")
    public String homepage(){
        return "index";
    }

    @RequestMapping("/person")
    public String personPage(ModelMap modelMap){
        User user = new User("Scott", "awesome2000", LocalDate.of(2000, 01, 30));
        modelMap.put ("user", user);
        return "user";
    }


}
