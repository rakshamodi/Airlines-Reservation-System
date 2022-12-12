package com.mail.ARS.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.Data;

@Component
@Data
@Entity
@Table
public class Flight {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int flight_id;
	private String flight_name;
	private String arl_time;
	private String dep_time;
	@JsonFormat(pattern= "dd-mm-yyyy", shape= Shape.STRING)
	private Date day;
	private String dep_city;
	private String arl_city;
	private String fare;
	public int getFlight_id() {
		return flight_id;
	}
	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}
	public String getFlight_name() {
		return flight_name;
	}
	public void setFlight_name(String flight_name) {
		this.flight_name = flight_name;
	}
	public String getArl_time() {
		return arl_time;
	}
	public void setArl_time(String arl_time) {
		this.arl_time = arl_time;
	}
	public String getDep_time() {
		return dep_time;
	}
	public void setDep_time(String dep_time) {
		this.dep_time = dep_time;
	}
	public String getDep_city() {
		return dep_city;
	}
	public void setDep_city(String dep_city) {
		this.dep_city = dep_city;
	}
	public String getArl_city() {
		return arl_city;
	}
	public void setArl_city(String arl_city) {
		this.arl_city = arl_city;
	}
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
	public String getFare() {
		return fare;
	}
	public void setFare(String fare) {
		this.fare = fare;
	}

	
	
}
