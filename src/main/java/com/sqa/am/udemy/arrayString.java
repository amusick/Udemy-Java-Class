/**
 * File Name: arrayString.java<br>
 * Musick, Annette<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Apr 4, 2016
 */
package com.sqa.am.udemy;

/**
 * arrayString //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Musick, Annette
 * @version 1.0.0
 * @since 1.0
 */
public class arrayString {

	public static void main(String[] args) {
		String[] words = new String[3];
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";
		System.out.println(words[2]);
		String[] fruits = { "apple", "banana", "pear", "kiwi" };
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}
}
