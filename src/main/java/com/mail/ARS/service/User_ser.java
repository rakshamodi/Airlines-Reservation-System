package com.mail.ARS.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mail.ARS.model.User;
import com.mail.ARS.repository.User_repo;

@Component
@Service
public class User_ser implements User_Service{

	@Autowired
	private BCryptPasswordEncoder passwordEncode;
	
	@Autowired
	private User_repo userrepo;
	
	@Override
	public User createUser(User user) {
		user.setPassword(passwordEncode.encode(user.getPassword()));
		user.setRole("ROLE_USER");
		user.setUser_mobile(user.getUser_mobile());
		user.setUser_name(user.getUser_name());
		user.setEmail(user.getEmail());
		user.setUser_dob(user.getUser_dob());
		user.setUser_address(user.getUser_address());
		
		return userrepo.save(user);
	}

	@Override
	public boolean checkEmail(String email) {
		return  userrepo.existsByEmail(email);
	}

}
