package com.mvcspringer.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xirconias on 27/04/15.
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String welcome(Model model) {
        model.addAttribute("greeting", "Welcome	to	Web	Store!");
        model.addAttribute("tagline", "The	one	and	only	amazing	webstore");

        return "welcome";
    }
}
