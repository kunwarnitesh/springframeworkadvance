package com.spring.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping(value = "/authenticate")
    ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }

    @RequestMapping(value = "/submitForm", method = RequestMethod.POST)
    @ResponseBody
    String submitForm(String username, String password) {
        return "Username " + username + " Password " + password;
    }
}
