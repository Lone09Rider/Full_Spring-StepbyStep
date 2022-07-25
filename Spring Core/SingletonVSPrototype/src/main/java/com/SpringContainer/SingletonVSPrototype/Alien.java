package com.SpringContainer.SingletonVSPrototype;

import org.springframework.stereotype.Component;

@Component
public class Alien {

	int age;

	public void work() {
		System.out.println("Coding + Working . . .");
	}

	public Alien() {
		super();
		System.err.println("Inside Constructor");
	}
	
	

}
