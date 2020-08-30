package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Student;
import com.serviceInter.ServiceI;

@Controller
public class Bootcontroller {
	@Autowired
 private ServiceI servicei;
 @RequestMapping("/")
 public String welcome() {
System.out.println("In Login...");
	 return "Login";
 }
 
 @RequestMapping("/registerPage")
 public String Register() {
	 
	 System.out.println("In Register...");
	 return "Registeration";
 }
 @RequestMapping(value="/addUser",method=RequestMethod.GET)
 public ModelAndView addStudent(@ModelAttribute Student st,BindingResult br) {
	System.out.println("In Student");
	System.out.println(st.getName());
	System.out.println(st.getAddress());
	System.out.println(st.getUname());
	System.out.println(st.getPassword());
	servicei.saveStudent(st);
	System.out.println("user is Addded");
	
	 return new ModelAndView("Login","msg","Info Added Successfully");
	 
 }
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView loginUser(@ModelAttribute Student st)
	{
		System.out.println("in login.....");
		int id=servicei.logincheck(st);
		if(id>0)
		{
			System.out.println("in if.................");
			List<Student> slist=servicei.displayAll(st);
			System.out.println("DATA====="+slist);
			return new ModelAndView("Successs","sList",slist);
		}
		return new ModelAndView("index","msg","Enter valid username and Password...");
	}
 @RequestMapping(value="/delete")
	public ModelAndView deleteStudent(@ModelAttribute Student st)
	{
		System.out.println("in delete......");
		System.out.println(st.getSid());
	
		int id=servicei.deleteStudent(st);
		List<Student> slist=servicei.displayAll(st);
		if(id>0)
		{
			return new ModelAndView("Successs","sList",slist);
		}
		return new ModelAndView("Successs","sList",slist);
	}
	@RequestMapping("/edit")
	public ModelAndView editStudent(@ModelAttribute Student st)
	{
		System.out.println("in edit .......");
		
		System.out.println(st.getSid());
		Student s=servicei.editStudent(st);
		return new ModelAndView("edit","data",s);
	}
	
	@RequestMapping(value="/update")
	public ModelAndView updateUser(@ModelAttribute Student st)
	{
		int id=servicei.updateStudent(st);
		List<Student> slist=servicei.displayAll(st);
		if(id>0)
		{
			return new ModelAndView("Successs","sList",slist);
		}
		return new ModelAndView("Successs","sList",slist);
	}
}
