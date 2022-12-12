package com.mail.ARS.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@Entity
@Table
public class Login {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int login_id;
	private int login_role_id;
	private String login_username;
	private String password;
	
}
