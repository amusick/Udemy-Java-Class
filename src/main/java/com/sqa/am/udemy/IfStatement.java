package com.sqa.am.udemy;
/**
 * File Name: IfStatement.java<br>
 * Musick, Annette<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Mar 28, 2016
 */
/**
 * IfStatement //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Musick, Annette
 * @version 1.0.0
 * @since 1.0
 */
public class IfStatement {

	public static void main(String[] args) {
		int myInt = 25;
		if (myInt < 10) {
			System.out.println("Yes, it's true!");
		} else if (myInt < 20) {
			System.out.println("No, it's false!");
		} else {
			System.out.println("None of the above.");
		}
	}
}
