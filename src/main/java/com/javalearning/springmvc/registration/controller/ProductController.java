package com.javalearning.springmvc.registration.controller;

import com.javalearning.springmvc.registration.dao.ProductManager;
import com.javalearning.springmvc.registration.implement.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Controller
public class ProductController {

    private ProductManager productManager;

    @Autowired
    public ProductController(ProductManager productManager) {
        this.productManager = productManager;
    }

    /*@GetMapping(value = "/products")
    public String products(Model model) {
        List<Product> products = productManager.findAll();
        List<String> categories = productManager.getCategories();

        model.addAttribute("categories", categories);
        model.addAttribute("products", products);

        return "products";
    }*/

    @GetMapping(value = "/products/{category}")
    public String products(Model model, @PathVariable("category") String category,
                           @RequestParam(value = "count", required = false, defaultValue = "3") String count) {

        List<Product> products;
        if(category.equals("all")) {
            products = productManager.findAll();
        } else {
            products = productManager.findByCategory(category);
        }
        products = getByCount(count, products);
        List<String> categories = productManager.getCategories();

        model.addAttribute("categories", categories);
        model.addAttribute("products", products);

        return "products";
    }

    private List<Product> getByCount(String count, List<Product> products) {

        List<Product> result = new ArrayList<>();
        Integer countAsInt = Integer.valueOf(count);
        IntStream.range(0, countAsInt).forEach(index -> result.add(products.get(index)));

        return result;
    }
}
