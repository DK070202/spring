package com.learning.aop.Framework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.learning.aop.Custom.Timeline.Timeline;
import com.learning.aop.Custom.Timeline.Timeline2;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class FibController {

    @Autowired
    private final Fib fib;

    @Timeline
    @Timeline2
    @GetMapping("/api/fib/{number}")
    Long fib(@PathVariable Long number) {
        System.out.println("Called fib controller");
        return fib.fib(number);
    }

}
