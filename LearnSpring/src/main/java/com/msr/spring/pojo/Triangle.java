package com.msr.spring.pojo;

import com.msr.spring.dao.DrawDaoImpl;

public class Triangle extends DrawDaoImpl{

	@Override
	public void draw() {
		
		System.out.println("Draw from Triangle");
		
	}

	
}
