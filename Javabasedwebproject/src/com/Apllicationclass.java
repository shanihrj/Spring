package com;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.ApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Apllicationclass implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext sct) throws ServletException {
		AnnotationConfigWebApplicationContext act =new AnnotationConfigWebApplicationContext();
		act.register(Appconfig.class);
		act.setServletContext(sct);
    ServletRegistration.Dynamic servlet=sct.addServlet("dispatcher", new DispatcherServlet(act));
    servlet.addMapping("/");
	}

}
