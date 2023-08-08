package com.learning.aop.Custom.Services.PaymentService;

import org.springframework.stereotype.Service;

import com.learning.aop.Custom.Log.Loggable;

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
