package com.SpringCore.SetterInjection;

public class Alien {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.err.println("Age Assigned :-)");
		this.age = age;
	}

	public void code() {
		System.out.println("Coding ...");
	}

	public Alien() {
		System.err.println("R..U..NNING .... CONSTRUCTOR ....");
	}

}
