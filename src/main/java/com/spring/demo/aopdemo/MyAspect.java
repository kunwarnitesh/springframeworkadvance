package com.spring.demo.aopdemo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

    @Before("execution(public void callDriver())")
    void beforecallingDriver() {
        System.out.println("Before calling driver");
    }

    @After("execution(public void callDriver())")
    void aftercallingDriver() {
        System.out.println("After calling driver");
    }


    @Around("execution(public void callDriver())")
    void aroundCallingDriver(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Around aroundCallingDriver");
        proceedingJoinPoint.proceed();
        System.out.println("After aroundCallingDriver");
    }
}
