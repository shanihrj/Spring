package com.cjc.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cjc.model.BikeModel;
import com.cjc.model.State;
import com.cjc.serviceinterface.serviceinterface;
import com.google.gson.Gson;

@Controller
public class HomeController {
	@Autowired
	serviceinterface service;
	@RequestMapping("/")
	public String start() {
		System.out.println("Startedd");
		return "BikePrice";
		
	}
	
	@RequestMapping(value="/bikeModel",produces="application/json")
	public @ResponseBody  String bikeModel(@RequestParam Integer a,HttpServletResponse response) throws IOException {
		System.out.println(a);
		
		List<BikeModel> list=service.findAllBikeModelByCompany(a);
		
		String json=new Gson().toJson(list);
		System.out.println("listtttttttt"+list);
		System.out.println(json);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getOutputStream();
		
		return json;
		
	}
	@RequestMapping(value="/price",produces="application/json")
	public@ResponseBody String price(@RequestParam String c,HttpServletResponse response) throws IOException
	{
		System.out.println("for price issue"+c);
	    //BikeModel bk=service.getSingleBikeInfo(c);
	    //System.out.println(bk.getYear());
	    String json=new Gson().toJson("hii");
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		try {
			response.getOutputStream();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return json;
	}	
	@RequestMapping(value="/state",produces="application/json")
	public @ResponseBody  String state(@RequestParam Integer b,HttpServletResponse response) throws IOException {
		System.out.println(b);
		
		List<State> list=service.findAllStateByCountry(b);
		
		String json=new Gson().toJson(list);
		System.out.println("listtttttttt"+list);
		System.out.println(json);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getOutputStream();
		
		return json;
		
	}
	
	
	}
