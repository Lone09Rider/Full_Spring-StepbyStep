package com.SpringCore.ConstructorInjection;

public class Alien {
	private int age;
	private Laptop laptop;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public Alien(int age) {
		super();
		this.age = age;
	}

//	public Alien() {
//		super();
//		System.out.println("RUNNING CONSTRUCTOR !!!");
//	}

	public void work() {
		System.err.println("Running ...");
		laptop.compile();
	}

}
