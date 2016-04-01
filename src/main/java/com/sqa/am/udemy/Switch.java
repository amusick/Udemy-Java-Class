/**
 * File Name: Switch.java<br>
 * Musick, Annette<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Mar 31, 2016
 */
package com.sqa.am.udemy;

import java.util.Scanner;

/**
 * Switch //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Musick, Annette
 * @version 1.0.0
 * @since 1.0
 */
public class Switch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a command: ");
		String text = input.nextLine();
		switch (text) {
		case "start":
			System.out.println("Machine started!");
			break;
		case "stop":
			System.out.println("Machine Stopped!");
			break;
		default:
			System.out.println("Command not recognized!");
		}
	}
}
