package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class Mycontroller {
	@RequestMapping(value="/ModelAttribute",method=RequestMethod.POST)
	 public ModelAndView helloWorld(@ModelAttribute Student s) 
	 {  
		
		 System.out.println("in controller");
		 
		// System.out.println(s.getId());
		System.out.println(s.getName());
//		  	
//		 	List<String> list = new ArrayList();
//		 
//	        list.add(p.getName());
//	        list.add(p.getPassword());
//	        list.add(p.getEmail());
//	        list.add(p.getAddress());

	        
	        return new ModelAndView("success","message",s.getName());  
	 }    
	 

}
