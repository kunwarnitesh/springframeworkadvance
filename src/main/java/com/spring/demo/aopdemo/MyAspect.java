package com.spring.demo.aopdemo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

    @Before("execution(public void callDriver())")
    void beforecallingDriver() {
        System.out.println("Before calling driver");
    }
}
