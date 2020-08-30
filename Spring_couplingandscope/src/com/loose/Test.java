package com.loose;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/loose/bean.xml");
		Connection con = (Connection) ac.getBean("e");
		con.getconnection();
	}
}
