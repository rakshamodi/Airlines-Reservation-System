package com.mail.ARS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mail.ARS.model.Passenger;
import com.mail.ARS.model.User;
import com.mail.ARS.repository.User_repo;
import com.mail.ARS.repository.passenger_repo;

@Component
@Service
public class Pass_ser implements Pass_Service{

	@Autowired
	private passenger_repo passrepo;

	@Override
	public Passenger createPassenger(Passenger pass) {
		pass.setPass_name(pass.getPass_name());
		pass.setPass_age(pass.getPass_age());
		pass.setPass_gender(pass.getPass_gender());
		pass.setPass_email(pass.getPass_email());
		pass.setPhone(pass.getPhone());
		pass.setSeat(1);
		pass.setSeat_class(pass.getSeat_class());
		return passrepo.save(pass);
	}
}
