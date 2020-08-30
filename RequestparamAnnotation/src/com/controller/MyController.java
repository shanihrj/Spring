package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
 @RequestMapping("/log")
	public ModelAndView login(@RequestParam String Username,@RequestParam String Password)
 {
     System.out.println(Username);
     System.out.println(Password);
	 return new ModelAndView();
	 
 }
}
