package com.spring.demo.controller;

import com.spring.demo.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

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
        modelAndView.addObject("name", "TTN");
        modelAndView.addObject("address", "Noida");
        return modelAndView;

    }


    @RequestMapping("/displayCompany/{companyName}/{employeeName}")
    ModelAndView displayCompany(@PathVariable("companyName") String companyName,@PathVariable("employeeName") String employeeName) {
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("name", companyName);
        modelAndView.addObject("address", employeeName);
        return modelAndView;

    }

    @RequestMapping("/displayCompanyHashMap/{companyName}/{employeeName}")
    ModelAndView displayCompanyHashMap(@PathVariable Map<String, String> requestMap) {
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("name", requestMap.get("companyName"));
        modelAndView.addObject("address", requestMap.get("employeeName"));
        return modelAndView;

    }




}
