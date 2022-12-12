package com.mail.ARS.email;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

public class Email_Client {
	
	@Autowired
	private Email_Sender senderService;
	public static void main(String[] args) {
		SpringApplication.run(Email_Client.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException {
		senderService.sendSimpleEmail("toEmail",
				"This is email subject",
				"This is email body");

	}

}
