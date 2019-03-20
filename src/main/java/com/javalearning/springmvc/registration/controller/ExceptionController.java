package com.javalearning.springmvc.registration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@ControllerAdvice
public class ExceptionController {

    @RequestMapping(value = "/exception")
    public String exception() {

        throw new RuntimeException();
    }

    @ExceptionHandler(Exception.class)
    public String exception(Exception e) {

        e.printStackTrace();
        System.out.println(e.getMessage());
        return "handlerException";
    }

    @ExceptionHandler(RuntimeException.class)
    public String runtimeException(RuntimeException e) {

        e.printStackTrace();
        System.out.println(e.getMessage());
        return "handlerException";
    }

    @ExceptionHandler(ServletRequestBindingException.class)
    public String handleException(ServletRequestBindingException e) {

        e.printStackTrace();
        System.out.println(e.getMessage());
        return "redirect:/login";
    }

}
