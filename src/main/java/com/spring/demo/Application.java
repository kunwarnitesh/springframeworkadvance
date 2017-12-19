package com.spring.demo;

import com.spring.demo.aopdemo.Driver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("config.xml");
        Driver driver=applicationContext.getBean(Driver.class);
        driver.callDriver();
    }
}
