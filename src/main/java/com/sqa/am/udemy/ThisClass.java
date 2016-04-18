package com.sqa.am.udemy;

public class ThisClass {

	public static void main(String[] args) {
		Frog frog1 = new Frog();
		// frog1.setName("Bertie");
		// frog1.setAge(1);
		frog1.setAge(1);
		frog1.setName("Bertie");
		System.out.println(frog1.getName());
		System.out.println(frog1.getAge());
	}
}

class Frog {

	private String name;

	private int age;

	public int getAge() {
		return this.age;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setInfo(String name, int age) {
		setName(name);
		setAge(age);
	}

	public void setName(String name) {
		this.name = name;
	}
}
