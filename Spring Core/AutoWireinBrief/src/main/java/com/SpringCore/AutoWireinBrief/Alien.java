package com.SpringCore.AutoWireinBrief;

public class Alien {

	private int age;
	private Computer comp;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

//	public Alien(int age) {
//		super();
//		System.out.println("Running Constructor");
//		this.age = age;
//	}

	public Computer getComp() {
		return comp;
	}

	public void setComp(Computer comp) {
		this.comp = comp;
	}

	public Alien() {
		super();
	}

	public void work() {
		System.err.println("Executing .........");
		comp.compile();
	}

}
