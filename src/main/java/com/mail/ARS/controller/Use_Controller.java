package com.mail.ARS.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mail.ARS.model.User;
import com.mail.ARS.repository.User_repo;

@Controller

public class Use_Controller {

	@Autowired
	private User_repo userRepo;

	@ModelAttribute
	private void userDetails(Model m, Principal p) {
		String email = p.getName();
		User user = userRepo.findByEmail(email);

		m.addAttribute("user", user);
		m.addAttribute("fullname", user.getUser_name());
	}

	@GetMapping("/user/home")
	public String home() {
		return "user/Home.html";
	}
	
}
