package com.javalearning.springmvc.registration.controller;

import com.javalearning.springmvc.registration.implement.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home(Model model) {

//        List<Product> products = getProducts();

//        model.addAttribute("products", products);
        model.addAttribute("nick", "John");
        return "home";
    }
}
