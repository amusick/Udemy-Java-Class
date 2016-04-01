/**
 * File Name: DoWhile.java<br>
 * Musick, Annette<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Mar 31, 2016
 */
package com.sqa.am.udemy;

import java.util.Scanner;

/**
 * DoWhile //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Musick, Annette
 * @version 1.0.0
 * @since 1.0
 */
public class DoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		 * System.out.println("Enter a number: "); int value =
		 * scanner.nextInt(); while (value != 5) { System.out.println(
		 * "Enter a number: "); value = scanner.nextInt(); }
		 */
		int value = 0;
		do {
			System.out.println("Enter a number: ");
			value = scanner.nextInt();
		} while (value != 5);
		System.out.println("Got 5!");
	}
}
