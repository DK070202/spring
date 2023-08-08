package com.learning.aop.Custom.Timeline;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class TimelineAspect2 {

    @Around("@annotation(com.learning.aop.Custom.Timeline.Timeline2)")
    public Object callStack(ProceedingJoinPoint point) throws Throwable {
        System.out.println("Start of timeline tow");
        Object result = point.proceed();
        System.out.println("End of timeline two");
        return result;
    }
}
