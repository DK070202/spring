package com.learning.aop.Services.PaymentService;

import org.springframework.stereotype.Service;

import com.learning.aop.Log.Loggable;

@Service
public class PaymentServiceIMPL implements PaymentService {

    @Override
    @Loggable
    public void makePayment() {

        System.out.println("Starting payment");

        // ..

        System.out.println("Payment completed");

    }

}
