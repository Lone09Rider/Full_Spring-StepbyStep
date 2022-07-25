package com.SpringCore.RefAttribute;

import org.springframework.stereotype.Component;

@Component
public class Alien {
	private int age;
	private Laptop laptop;

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		System.err.println("Age Assigned");
	}

	public Alien(int age) {
		super();
		this.age = age;
	}

	public Alien() {
		super();
		System.err.println("Running Constructor");
	}

	public void work() {
		System.out.println("Coding ...");
		laptop.compile();
	}

}
