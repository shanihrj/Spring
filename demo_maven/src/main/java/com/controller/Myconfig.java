package com.controller;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.controller"})
public class Myconfig {
	
	public static void main(String[] args) {
		
		System.out.println("config11");
		
		SpringApplication.run(Myconfig.class, args);
		
		System.out.println("config22");
	}

}
