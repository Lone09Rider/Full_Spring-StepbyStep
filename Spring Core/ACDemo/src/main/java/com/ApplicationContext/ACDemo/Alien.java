package com.ApplicationContext.ACDemo;

import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	
	
	public Alien() {
		super();
		System.out.println("Inside the Constructor");
	}

	public void work() {
		System.out.println("I am coding");
	}

}
