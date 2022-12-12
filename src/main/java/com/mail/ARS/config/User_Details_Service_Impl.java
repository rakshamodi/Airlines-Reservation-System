package com.mail.ARS.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mail.ARS.model.User;
import com.mail.ARS.repository.User_repo;

@Service
public class User_Details_Service_Impl implements  UserDetailsService {

	@Autowired
	private User_repo userRepo;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		User user = userRepo.findByEmail(email);

		if (user != null) {
			return new Custom_User_Details(user);
		}

		throw new UsernameNotFoundException("User not available!");
	}

}
