package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
public static void main(String[] args) {
	ApplicationContext act=new ClassPathXmlApplicationContext("com/test/bean.xml");
	//Resource r =new ClassPathResource("bean.xml");
	//BeanFactory bean=new XmlBeanFactory(r);
	Object obj=act.getBean("s");
	//Object obj=bean.getBean("s");
	Student s=(Student)obj;
	//s.setName("hemant");
	System.out.println(s);
}
}
