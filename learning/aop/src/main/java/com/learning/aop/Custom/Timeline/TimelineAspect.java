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
public class TimelineAspect {

    @Around("@annotation(com.learning.aop.Custom.Timeline.Timeline)")
    public Object logExecutionTime(ProceedingJoinPoint point) throws Throwable {
        System.out.println("Start of timeline one");
        Long entryTime = System.nanoTime();
        Object result = point.proceed();
        Long executionTime = System.nanoTime() - entryTime;
        System.out.println(point.getTarget() + "Took" + executionTime + "ms to execute");
        System.out.println("End of timeline one");
        return result;
    }

}
