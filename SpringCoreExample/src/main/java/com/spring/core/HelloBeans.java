package com.spring.core;

public class HelloBeans {

	private String name="Rajeshwar";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void displayName()
	{
		System.out.println("Hello "+this.name);
	}
}
