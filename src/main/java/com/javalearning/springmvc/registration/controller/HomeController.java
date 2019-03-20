package com.javalearning.springmvc.registration.controller;

import com.javalearning.springmvc.registration.implement.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home(Model model) {

        List<Product> products = getProducts();

        model.addAttribute("products", products);
        model.addAttribute("nick", "John");
        return "home";
    }

    private List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("shirts", "Shirt_01"));
        products.add(new Product("shirts", "Shirt_02"));
        products.add(new Product("shirts", "Shirt_03"));
        products.add(new Product("trousers", "Trousers_01"));
        products.add(new Product("trousers", "Trousers_02"));
        products.add(new Product("trousers", "Trousers_03"));

        return products;
    }
}
