package com.prototype;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/prototype/bean.xml");
	Employee e=(Employee)ac.getBean("s");
	e.setRollno(1);
	e.setName("Hemant");
	System.out.println(e.getName());
	Employee e1=(Employee)ac.getBean("s");
	System.out.println(e1.getRollno());
	System.out.println(e1.getName());
}
}
