package com.SpringContainer.SCDemo;

import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	int age;

	public Alien() {
		super();
		System.err.println("Inside Cunstructor");
	}
	
	public void work() {
		System.out.println("Coding...");
	}
	
}
