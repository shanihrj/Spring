package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ServiceIn.ServiceInter;
import com.model.Country;

@Controller
public class Bootcontroller {
@Autowired
private ServiceInter service;

public ServiceInter getService() {
	return service;
}

public void setService(ServiceInter service) {
	this.service = service;
}

@RequestMapping("/")
public String Start() {
	
	return "Index";
}
@RequestMapping("/log")
public String savecountry(@ModelAttribute Country country) {
	System.out.println(country.getCname());
	Country c=service.saveCountry(country);
	

	if(c!=null)
	{
		return "Index";
	}
	else
	{
		return "error";
	}

	
	
}
}
