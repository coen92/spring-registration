package com.javalearning.springmvc.registration.dao;

import com.javalearning.springmvc.registration.implement.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductManager {

    private List<Product> products;

    public ProductManager() {
        this.products = getProducts();
    }

    private List<Product> getProducts() {

        products = new ArrayList<>();
        products.add(new Product("shirts", "Shirt_01"));
        products.add(new Product("shirts", "Shirt_02"));
        products.add(new Product("shirts", "Shirt_03"));
        products.add(new Product("trousers", "Trousers_01"));
        products.add(new Product("trousers", "Trousers_02"));
        products.add(new Product("trousers", "Trousers_03"));
        products.add(new Product("skirts", "Skirt_01"));
        products.add(new Product("skirts", "Skirt_02"));
        products.add(new Product("skirts", "Skirt_03"));
        products.add(new Product("shoes", "Shoes_01"));
        products.add(new Product("shoes", "Shoes_02"));
        products.add(new Product("shoes", "Shoes_03"));

        return products;
    }

    public List<Product> findAll() {
        return products;
    }

    public List<Product> findByCategory(String category) {

        return products.stream()
                .filter(product -> categoryMatch(category, product))
                .collect(Collectors.toList());
    }

    private boolean categoryMatch(String category, Product product) {

        String productCategory = product.getCategory();
        return category.equals(productCategory);
    }

    public List<String> getCategories() throws NullPointerException {
        List<String> categories = new ArrayList<>();

        categories.add("shirts");
        categories.add("trousers");
        categories.add("skirts");
        categories.add("shoes");

        return categories;
    }
}
