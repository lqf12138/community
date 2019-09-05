package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by lqf on 2019/9/2.
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String Index(){
        return "index";
    }
}
