package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mycontroller {
@RequestMapping("/")
public String hello() {
	System.out.println("in controller");
	return"Welcome to string";
}
}
