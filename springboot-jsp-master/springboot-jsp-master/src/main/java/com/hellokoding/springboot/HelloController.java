package com.hellokoding.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @RequestMapping("/Home")
    public String hello() {
        return "Home";
    }
    @RequestMapping("/Home2")
    public String hello2() {
        return "Home2";
    }
}
