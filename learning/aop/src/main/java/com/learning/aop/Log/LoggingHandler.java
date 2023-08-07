package com.learning.aop.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingHandler {

    @Before("@annotation(com.learning.aop.Log.Loggable)")
    public void beforeLogging(JoinPoint joinPoint) {
        System.out.println("Before running loggingAdvice on method=");

    }

    @After("@annotation(com.learning.aop.Log.Loggable)")
    public void afterLogging(JoinPoint joinPoint) {
        System.out.println("After running loggingAdvice on method=");
    }

    @Around("@annotation(com.learning.aop.Log.Loggable)")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around");
        joinPoint.proceed();
    }
}