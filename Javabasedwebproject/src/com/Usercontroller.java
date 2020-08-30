package com;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Usercontroller
{
	@RequestMapping("/")
	public  String m2(Model m) 
	{
		
		
		return "index";
	}
@RequestMapping("/display")
public  String m1(Model m) 
{
	
	m.addAttribute("msg","Welcome to spring");
	return "Home";
}
}
