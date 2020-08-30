package com.counstructordi.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/counstructordi/primitive/Bean.xml");
		Object obj = context.getBean("t");
        Traingle t=(Traingle) obj;
        t.show();
	}

}
