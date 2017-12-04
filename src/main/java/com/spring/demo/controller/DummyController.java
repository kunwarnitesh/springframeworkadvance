package com.spring.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DummyController {

    @RequestMapping("/")
    @ResponseBody
    String index(){
        return "Welcome to Spring Advance...";
    }

    @RequestMapping("/login2")
    public ModelAndView login(){
        ModelAndView modelAndView= new ModelAndView("login");
        return modelAndView;
    }

}
