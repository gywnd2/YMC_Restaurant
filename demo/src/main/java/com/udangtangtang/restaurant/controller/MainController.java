package com.udangtangtang.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/menu")
    public String menu() {
        return "menu";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }

    @GetMapping("/reservation")
    public String reservation(){
        return "reservation";
    }

    @GetMapping("/blog")
    public String blog(){
        return "blog";
    }

    @GetMapping("/blog-single")
    public String blogSingle(){
        return "blog-single";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/signin")
    public String signIn(){
        return "signin";
    }
}
