package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.ServiceInterface.ServiceInterface;
import com.app.model.User;

@Controller
public class HomeController {
	@Autowired
	ServiceInterface service;

	@RequestMapping("/")
	public String login() {
		System.out.println("In Login");
		return "Login";

	}
	@RequestMapping("/Register")
	public String Registerpage() {
		System.out.println("In Register");
		return "Register";
	}
	@RequestMapping("/RegisterUser")
	public String login1(@ModelAttribute User user,Model model)
	{
		System.out.println(user.getName());
		int id=service.SaveUser(user);
		System.out.println(id);
		if (id>0) {
		return "Login";
		}
		else {
			return "Register";
		}
	}
	
	@RequestMapping("/login")
	public String login(@ModelAttribute User user,Model model)
	{
		List<User>  list=service.login(user);
		model.addAttribute("data", list);
		return "Success";
	}
	@RequestMapping("/addnewR")
	public String addnew(Model model)
	{
		model.addAttribute("msg1", "Added Successfully");
		return "Register";
	}
	
	@RequestMapping("/deletedR")
	public String delete(@ModelAttribute User user,Model model)
	{
		service.delete(user);List<User>  list=service.login(user);
		model.addAttribute("data", list);
		return "Success";
		

		
	}
}
