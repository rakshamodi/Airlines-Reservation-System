package com.mail.ARS.model;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.catalina.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.Data;

@Component
@Data
@Entity
@Table
public class User {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int user_id;
	private String user_mobile;
	private String user_name;
	private String email;
	@JsonFormat(pattern= "dd-mm-yyyy", shape= Shape.STRING)
	private Date user_dob;
	private String user_address;
	private String role;
	private String password;
	
//	@ManyToMany(fetch=FetchType.EAGER)
//	@JoinTable(name="user_roles",
//				joinColumns=@JoinColumn(name="userid", referencedColumnName="user_id"),
//				inverseJoinColumns=@JoinColumn(name="roleid", referencedColumnName="role_id"))
//	private Set<Roles> roles;
//    
//
//
//	@ManyToMany(fetch=FetchType.EAGER, cascade= CascadeType.ALL)
//	@JoinTable(name="user_permission",
//				joinColumns=@JoinColumn(name="userid", referencedColumnName="user_id"),
//				inverseJoinColumns=@JoinColumn(name="permissionid", referencedColumnName="permission_id"))
//	private Set<Permission> per;
//	
//	@Autowired
//	@OneToOne(fetch=FetchType.EAGER, cascade= CascadeType.ALL)
//	private Login lg;
//	
//	@OneToMany(fetch=FetchType.EAGER, cascade= CascadeType.ALL)
//	@JoinTable(name="user_enquiry",
//				joinColumns=@JoinColumn(name="userid", referencedColumnName="user_id"),
//				inverseJoinColumns=@JoinColumn(name="enquiryid", referencedColumnName="enquiry_id"))
//	private Set<Enquiry> enq;
//	
//	@OneToMany(fetch=FetchType.EAGER, cascade= CascadeType.ALL)
//	@JoinTable(name="user_booking",
//				joinColumns=@JoinColumn(name="userid", referencedColumnName="user_id"),
//				inverseJoinColumns=@JoinColumn(name="bookingid", referencedColumnName="booking_id"))
//	private Set<Booking> book;
//	
//	@OneToMany(fetch=FetchType.EAGER, cascade= CascadeType.ALL)
//	@JoinTable(name="user_passener",
//				joinColumns=@JoinColumn(name="userid", referencedColumnName="user_id"),
//				inverseJoinColumns=@JoinColumn(name="passengerid", referencedColumnName="passenger_id"))
//	private Set<Passenger> pass;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_mobile() {
		return user_mobile;
	}

	public void setUser_mobile(String user_mobile) {
		this.user_mobile = user_mobile;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getUser_dob() {
		return user_dob;
	}

	public void setUser_dob(Date user_dob) {
		this.user_dob = user_dob;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	

	
	
}