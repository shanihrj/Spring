package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Configclass {
@Bean("e")
@Scope("prototype")
public Employee employee() {
	Employee e=new Employee();
	e.setName("Hemant");
	e.setAddress("Pune");
	
	return e;
	
}
}
