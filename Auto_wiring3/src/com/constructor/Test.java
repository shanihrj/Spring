package com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {
public static void main(String[] args) 
{
	ApplicationContext act=new ClassPathXmlApplicationContext("Beans.xml");
	Object o=act.getBean(com.constructor.Student.class);
	
	Student s=(Student) o;
	System.out.println(s);
	
}
}
