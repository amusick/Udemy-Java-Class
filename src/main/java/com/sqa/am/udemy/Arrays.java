/**
 * File Name: Arrays.java<br>
 * Musick, Annette<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Mar 31, 2016
 */
package com.sqa.am.udemy;

/**
 * Arrays //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Musick, Annette
 * @version 1.0.0
 * @since 1.0
 */
public class Arrays {

	public static void main(String[] args) {
		int value = 7;
		int[] values;
		values = new int[3];
		System.out.println(values[0]);
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		int[] numbers = { 5, 6, 7 };
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
