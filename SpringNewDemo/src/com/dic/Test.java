package com.dic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext act=new ClassPathXmlApplicationContext("com/dic/bean.xml");
		//Resource r =new ClassPathResource("bean.xml");
		//BeanFactory bean=new XmlBeanFactory(r);
		Object obj=act.getBean("e");
		//Object obj=bean.getBean("s");
		Employee e=(Employee)obj;
		//s.setName("hemant");
		e.show();
	

	}

}
