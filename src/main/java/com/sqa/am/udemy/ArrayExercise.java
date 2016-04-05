/**
 * File Name: ArrayExercise.java<br>
 * Musick, Annette<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Mar 31, 2016
 */
package com.sqa.am.udemy;

/**
 * ArrayExercise //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Musick, Annette
 * @version 1.0.0
 * @since 1.0
 */
public class ArrayExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char[] charArray = new char[5];
		charArray[0] = 'A';
		charArray[1] = 'B';
		charArray[2] = 'C';
		charArray[3] = 'D';
		charArray[4] = 'E';
		for (int i = 0; i < charArray.length; i++) {
			System.out.println("Char Array value for item " + i + " is " + charArray[i]);
		}
	}
}
