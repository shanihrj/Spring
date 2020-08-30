package com.controlller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController 
{   

	@RequestMapping("/greeting")
	public ModelAndView greeting()
	{
		
	String message="welcome again";
	return new ModelAndView("Success","msg",message);
	}
}
