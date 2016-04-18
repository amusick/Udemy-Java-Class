package com.sqa.am.udemy;

public class Setters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Robot sam = new Robot();
		sam.jump(7);
		sam.move("West", 12.2);
		String greeting = "Hello there.";
		sam.speak(greeting);
	}
}

class Robot {

	public void jump(int height) {
		System.out.println("Jumping: " + height);
	}

	public void move(String direction, double distance) {
		System.out.println("Moving " + distance + " Metres in direction " + direction);
	}

	public void speak(String text) {
		System.out.println(text);
	}
}