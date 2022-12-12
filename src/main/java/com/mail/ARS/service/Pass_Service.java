package com.mail.ARS.service;

import org.springframework.stereotype.Component;

import com.mail.ARS.model.Passenger;

@Component
public interface Pass_Service {

	public Passenger createPassenger(Passenger pass);
}
