package com.mail.ARS.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@Entity
@Table
public class Passenger {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int pass_id;
	private String pass_name;
	private int pass_age;
	private String pass_email;
	private String phone;
	private String pass_gender;
	private int seat;
	private String seat_class;
	public int getPass_id() {
		return pass_id;
	}
	public void setPass_id(int pass_id) {
		this.pass_id = pass_id;
	}
	public String getPass_name() {
		return pass_name;
	}
	public void setPass_name(String pass_name) {
		this.pass_name = pass_name;
	}
	public int getPass_age() {
		return pass_age;
	}
	public void setPass_age(int pass_age) {
		this.pass_age = pass_age;
	}
	public String getPass_email() {
		return pass_email;
	}
	public void setPass_email(String pass_email) {
		this.pass_email = pass_email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPass_gender() {
		return pass_gender;
	}
	public void setPass_gender(String pass_gender) {
		this.pass_gender = pass_gender;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public String getSeat_class() {
		return seat_class;
	}
	public void setSeat_class(String seat_class) {
		this.seat_class = seat_class;
	}
	

}
