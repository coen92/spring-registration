package com.javalearning.springmvc.registration.controller;

import com.javalearning.springmvc.registration.implement.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class UserPageController {

    @GetMapping(value = "/user_page")
    public String userPage(Model model, @SessionAttribute("loggedUser") User user) {

        model.addAttribute("usr", user);
        return "user_page";
    }
}
