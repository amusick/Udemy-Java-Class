/**
 * File Name: Info.java<br>
 * Musick, Annette<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 10, 2016
 */
package com.sqa.am.util.helper;

/**
 * Info // Create a helper class to add to your framework which gives
 * information on any class you create. The method signatures are below. Try to
 * implement one at a time. Create a test case for each method.
 *
 * @author Musick, Annette
 * @version 1.0.0
 * @since 1.0
 */
public class Info {

	public static void display2DInfo(Object[][] objects) {
		// TODO implement method to get2DInfo
	}

	// Methods which call Object methods getClass().getSimpleName(), toString(),
	// and in a readable form both to display and get String value of Object
	public static void displayInfo(Object obj) {
		System.out.println("This object is named: " + obj.getClass().getName());
		System.out.println("The object is of type: " + obj.getClass().getSimpleName());
		System.out.println("The number of modifiers are: " + obj.getClass().getModifiers());
		System.out.println("The number of modifiers are: " + obj.getClass().getFields());
		System.out.println("The methods are: " + obj.getClass().getDeclaredMethods());
	}

	public static void displayInfo(Object obj1, Object obj2, Object... objN) {
	}

	public static void displayInfo(Object[] obj) {
	}

	public static String get2DInfo(Object[][] objects) {
		return null;
	}

	public static String getInfo(Object obj) {
		return null;
	}
}
