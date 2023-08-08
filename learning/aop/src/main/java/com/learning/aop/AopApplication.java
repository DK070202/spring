package com.learning.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.learning.aop.Custom.Services.PaymentService.PaymentService;

@SpringBootApplication
public class AopApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AopApplication.class, args);
		// Remove below this when testing controller specific logic.
		PaymentService paymentService = context.getBean(PaymentService.class);
		paymentService.makePayment();
		context.close();
	}

}
