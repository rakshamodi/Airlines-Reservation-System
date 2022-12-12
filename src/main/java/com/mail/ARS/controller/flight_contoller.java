package com.mail.ARS.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.mail.ARS.model.Flight;
import com.mail.ARS.repository.flight_repo;

@Controller
public class flight_contoller {
	
	@Autowired
	private flight_repo f_r;
	
	@RequestMapping("/findflight")
	public String findflight(@RequestParam("from") String from, @RequestParam("to") String to, @RequestParam("weekday") @DateTimeFormat(pattern="dd-mm-yyyy") Date weekday, ModelMap modelmap)
	{
		List<Flight> flight= f_r.findflight(from, to, weekday);
		modelmap.addAttribute("flight",flight);
		return "Display_Flights.html";
		
	}
	@RequestMapping("/indflight")
	public String indflight(@RequestParam("from") String from, @RequestParam("to") String to, @RequestParam("weekday") @DateTimeFormat(pattern="dd-mm-yyyy") Date weekday, ModelMap modelmap)
	{
		List<Flight> flight= f_r.findflight(from, to, weekday);
		modelmap.addAttribute("flight",flight);
		return "isplay_Flights.html";
		
	}
	
}
