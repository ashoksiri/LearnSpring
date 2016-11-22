package com.msr.spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.msr.spring.configuration.AppConfig;
import com.msr.spring.dao.DrawDao;

public class AppMain {

	public static void main(String[] args) {
		 
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		DrawDao dao = (DrawDao)context.getBean("triangle");
		DrawDao dao1 = (DrawDao)context.getBean("circle");
		dao1.draw();
		dao.draw();
		
		context.stop();
		context.close();
	}
}
