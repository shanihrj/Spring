package com.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Student;
import com.serviceInter.ServiceI;


@Controller
public class Bootcontroller {

	@Autowired
	private ServiceI iservice;
	@RequestMapping("/")
	public String welcome()
	{
		System.out.println("index page...");
		return "Login";
	}
	@RequestMapping("/registerPage")
	public String register()
	{
		System.out.println("in registration page...");
		return "Registeration";
	}
	
	@RequestMapping(value="/addUser",method=RequestMethod.GET)
	public ModelAndView addUser(@ModelAttribute Student st,BindingResult br){
		System.out.println("in add user...");
		System.out.println(st.getName());
		System.out.println(st.getAddress());
		System.out.println(st.getSid());
		System.out.println(st.getUname());
		iservice.saveStudent(st);
		System.out.println("Student is added....");
		
		return new ModelAndView("Login","msg","Login Successfull...");
		
	}
	
	
	
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView loginUser(@ModelAttribute Student st)
	{
		System.out.println("in login.....");
		int id=iservice.logincheck(st);
		if(id>0)
		{
			System.out.println("in if.................");
			List<Student> listUser=iservice.displayAll(st);
			System.out.println("DATA====="+listUser);
			return new ModelAndView("Successs","userList",listUser);
		}
		return new ModelAndView("Login","msg","Enter valid username and Password...");
	}
	
	@RequestMapping(value="/delete")
	public ModelAndView deleteUser(@ModelAttribute Student st)
	{
		System.out.println("in delete......");
		System.out.println(st.getSid());
	
		int id=iservice.deleteStudent(st);
		List<Student> listUser=iservice.displayAll(st);
		if(id>0)
		{
			return new ModelAndView("Successs","userList",listUser);
		}
		return new ModelAndView("Successs","userList",listUser);
	}
	@RequestMapping("/edit")
	public ModelAndView editUser(@ModelAttribute Student st)
	{
		System.out.println("in edit .......");
		
		System.out.println(st.getSid());
		Student s=iservice.editStudent(st);
		return new ModelAndView("Edit","data",s);
	}
	
	@RequestMapping(value="/update")
	public ModelAndView updateUser(@ModelAttribute Student st)
	{
		int id=iservice.updateStudent(st);
		List<Student> listUser=iservice.displayAll(st);
		if(id>0)
		{
			return new ModelAndView("Successs","userList",listUser);
		}
		return new ModelAndView("Successs","userList",listUser);
	}
}
