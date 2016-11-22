package com.msr.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.msr.spring.dao.DrawDao;
import com.msr.spring.pojo.Circle;
import com.msr.spring.pojo.Triangle;

@Configuration
@ComponentScan(basePackages = {"com.msr.spring"})
public class AppConfig {

	@Bean(name="circle")
	public DrawDao getCircle(){
		return new Circle();
	}
	
	@Bean(name="triangle")
	public DrawDao getTrianle(){
		return new Triangle();
	}
}
