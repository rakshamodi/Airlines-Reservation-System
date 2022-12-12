package com.mail.ARS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mail.ARS.model.Payment;
import com.mail.ARS.repository.payment_repo;

@Component
@Service
public class Payment_ser implements Payment_Service{

	@Autowired
	private payment_repo payrepo;

	@Override
	public Payment createPayment(Payment pay)
	{
		pay.setCard_type(pay.getCard_type());
		pay.setCard_no(pay.getCard_no());
		pay.setExpiry(pay.getExpiry());
		pay.setCard_hname(pay.getCard_hname());
		return payrepo.save(pay);
		
	}
}
