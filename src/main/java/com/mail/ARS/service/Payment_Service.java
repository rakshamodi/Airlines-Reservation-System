package com.mail.ARS.service;

import org.springframework.stereotype.Component;

import com.mail.ARS.model.Payment;

@Component
public interface Payment_Service {

	public Payment createPayment(Payment pay);
}
