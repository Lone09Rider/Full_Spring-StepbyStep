package com.SpringBoot.firstProj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstProjectApplication.class, args);
		
//		Alien obj = new Alien();
		Alien obj = context.getBean(Alien.class);
		obj.code();
	}

}
