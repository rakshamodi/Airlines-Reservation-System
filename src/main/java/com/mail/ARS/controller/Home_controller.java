package com.mail.ARS.controller;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mail.ARS.model.Passenger;
import com.mail.ARS.model.Payment;
import com.mail.ARS.model.User;
import com.mail.ARS.service.Pass_ser;
import com.mail.ARS.service.Payment_ser;
import com.mail.ARS.service.User_Service;
import com.mail.ARS.service.User_ser;

@Controller
public class Home_controller {
	
	@Autowired(required=true)
	private User_ser userService;
	
	@Autowired(required=true)
	private Pass_ser passService;
	
	@Autowired(required=true)
	private Payment_ser payService;

	@RequestMapping("/index")
	public String index(){
		return "Index.html";
	}
	@RequestMapping("/success")
	public String success(){
		return "Success.html";
	}
	@RequestMapping("/payment")
	public String payment(){
		return "Payment.html";
	}
	@RequestMapping("/pass_d")
	public String pass_d(){
		return "Pass_Details.html";
	}
	@RequestMapping("/display_flights")
	public String display_flights(){
		return "Display_Flights.html";
	}
	@RequestMapping("/isplay_flights")
	public String isplay_flights(){
		return "isplay_Flights.html";
	}
	
	@RequestMapping("/user_home")
	public String home() {
		return "Home.html";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "Login.html";
	}

	@RequestMapping("/register")
	public String register() {
		return "Register.html";
	}
	
	@PostMapping("/createUser")
	public String create_user(@ModelAttribute User user, HttpSession session) {

		boolean f = userService.checkEmail(user.getEmail());

		if (f==true) {
			session.setAttribute("msg", "Email ID already exists!");
		}

		else {
			User user1 = userService.createUser(user);
			if (user1 != null) {
				session.setAttribute("msg", "Registered Successfully!");
			} else {
				session.setAttribute("msg", "Something wrong on server!");
			}
		}

		return "redirect:/register";
	}
	@PostMapping("/home")
	public String index0(){
		return "Index.html";
	}

	@PostMapping("/createPassenger")
	public String create_pass(@ModelAttribute Passenger pass, HttpSession session) {

			Passenger pass1 = passService.createPassenger(pass);
			if (pass1 != null) {
				session.setAttribute("msg", "Success!");
			} else {
				session.setAttribute("msg", "Something wrong on server!");
			}
		return "/payment";
	}
	
	@PostMapping("/pay")
	public String create_pay(@ModelAttribute Payment pay, HttpSession session) {
		Payment pay1= payService.createPayment(pay);
		if (pay1 != null) {
			session.setAttribute("msg", "Success!");
		} else {
			session.setAttribute("msg", "Something wrong on server!");
		}
		return "/success";
	}

}


