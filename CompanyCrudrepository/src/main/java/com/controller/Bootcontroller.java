package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Admin;
import com.model.Manager;

@Controller
public class Bootcontroller {
@Autowired
private Service servicei;

public Service getServicei() {
	return servicei;
}

public void setServicei(Service servicei) {
	this.servicei = servicei;
}


@RequestMapping("/")
public String start()
{
	return "Login";
}
@RequestMapping("/RegisterPage")
public String start1()
{
	return "Registeration";
}


@RequestMapping("/register")
public String saveAdmin(@ModelAttribute Admin admin,@ModelAttribute Manager manager  )
{
	
	admin.setManager(manager);

	String a=admin.getRole();
	servicei.
	if(a.equals(admin.getRole())) {
	
	}
	if(role==2) {
		return "manager";
	}
	if(role==3) {
		return "admin";
	}
	
		{
		return "login";
	}
	else
	{
		return "register";
	}
}
}