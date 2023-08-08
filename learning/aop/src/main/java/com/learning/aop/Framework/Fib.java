package com.learning.aop.Framework;

import org.springframework.stereotype.Component;

@Component
public class Fib {

    public Long fib(Long n) {
        if (n == 1 || n == 2) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);

    }

}
