package com.sqa.am.udemy;
/**
 * File Name: Application.java<br>
 * Musick, Annette<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Mar 28, 2016
 */
/**
 * Application //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Musick, Annette
 * @version 1.0.0
 * @since 1.0
 */
public class Application {

	public static void main(String[] args) {
		int myInt = 7;
		String text = "Hello";
		String blank = " ";
		String name = "Bob";
		String greeting = text + blank + name;
		System.out.println(greeting);
		System.out.println("Hello" + " " + "Bob");
		System.out.println("My integer is: " + myInt);
		double myDouble = 7.8;
		int number1 = 9;
		float number2 = 1.234f;
		System.out.print("My number is: " + myDouble + ".");
		System.out.print("My number value is: " + number1 + number2 + ".");
	}
}
