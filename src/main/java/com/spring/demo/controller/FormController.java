package com.spring.demo.controller;

import com.spring.demo.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {


    @Autowired
    FormService formService;

    @RequestMapping("/")
    @ResponseBody
    String applicationStarting() {
        return "Hello Form";
    }

    @RequestMapping("/loginForm")
    ModelAndView getLoginForm() {
        ModelAndView modelAndView = new ModelAndView("hello");
        return modelAndView;

    }

    @RequestMapping("/setForm")
    ModelAndView putDataInForm() {
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("name","TTN");
        modelAndView.addObject("address","Noida");
        return modelAndView;

    }
}
