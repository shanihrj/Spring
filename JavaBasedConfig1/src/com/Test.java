package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext act=new AnnotationConfigApplicationContext(Configclass.class);
		Object obj=act.getBean("e");
		Employee e=(Employee) obj;
		System.out.println(e.getName());
		System.out.println(e.getAddress());
	}

}
