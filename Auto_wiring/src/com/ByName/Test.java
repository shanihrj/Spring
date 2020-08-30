package com.ByName;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
public static void main(String[] args) {
	Resource rs=new ClassPathResource("Beans.xml");
	BeanFactory bean=new XmlBeanFactory(rs);
	Object o=bean.getBean("s");
	
	Student s=(Student) o;
	System.out.println(s.getName());
	System.out.println(s.getAddress().getlAddress());
	System.out.println(s.getAddress().getpAddress());
}
}
