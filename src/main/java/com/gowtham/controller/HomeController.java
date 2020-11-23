package com.gowtham.controller;

import com.gowtham.Request.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLOutput;

@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String login () {
        System.out.println("Login Page Requested..");
        return "login";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String user (@Validated User user, Model model) {
        System.out.println("User Page Requested...");
        model.addAttribute("userName", user.getUserName());
        return "user";
    }

    @RequestMapping(value = "/test")
    public String test () {
        return "test";
    }

    @RequestMapping(value = "/welcome")
    public String welcome (Model model) {
        model.addAttribute("message", "Gowtham");
        return "welcome";
    }
}
