package com.mail.ARS.service;

import org.springframework.stereotype.Component;

import com.mail.ARS.model.User;

@Component
public interface User_Service {

	public User createUser(User user);
	public boolean checkEmail(String email);
}
