package com.SpringBoot.firstProjAutoWire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	@Autowired
	Laptop lappy;
	
	public void code() {
		lappy.compile();
	}
}
