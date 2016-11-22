package com.msr.spring.pojo;

import com.msr.spring.dao.DrawDaoImpl;

public class Circle extends DrawDaoImpl {

	@Override
	public void draw() {
		System.out.println("Draw From Circle");
		
	}

	
	
}
