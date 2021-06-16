package com.bfyamada.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.bfyamada.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(Long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}
}
