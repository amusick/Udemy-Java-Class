package com.sqa.am.udemy;

public class Static {

	public static void main(String[] args) {
		Thing.description = "I am a thing";
		// System.out.println(Thing.description);
		Thing.showInfo();
		System.out.println("Before creating objects, count is: " + Thing.count);
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		thing1.name = "Bob";
		thing2.name = "Sue";
		System.out.println("Before creating objects, count is: " + Thing.count);
		// System.out.println(thing1.name);
		// System.out.println(thing2.name);
		thing1.showName();
		thing2.showName();
		System.out.println(Math.PI);
		System.out.println(Thing.LUCKY_NUMBER);
	}
}

class Thing {

	public final static int LUCKY_NUMBER = 7;

	public static String description;

	public static int count = 0;

	public static void showInfo() {
		System.out.println(description);
	}

	public int id;

	public String name;

	public Thing() {
		this.id = count;
		count++;
	}

	public void showName() {
		System.out.println("Object id: " + this.id + ", " + description + ": " + this.name);
	}
}
