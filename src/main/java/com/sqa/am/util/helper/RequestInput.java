/**
 * File Name: RequestInput.java<br>
 * Nepton, Jean-francois<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 27, 2016
 */
package com.sqa.am.util.helper;

import java.util.Arrays;
import java.util.Scanner;

/**
 * RequestInput //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0
 */
public class RequestInput {

	// Scanner object to get user input
	private static Scanner scanner = new Scanner(System.in);

	// Create a method that takes a String array and increases it value by one
	// element
	public static String[] addStringElement(String[] elements, String addString) {
		// Local variables
		String[] newStringArray;
		// Check if the supplied String array is null and if so, we will be
		// adding one element
		if (elements != null) {
			// Supplied array contains elements so the new size will be
			// increased by 1 and add element
			newStringArray = Arrays.copyOf(elements, elements.length + 1);
			// Set the last element to supplied String addString
			newStringArray[elements.length] = addString;
		} else {
			// Supplied array does not contain any elements yet
			newStringArray = new String[1];
			// Set the first/last and only element to supplied String addString
			newStringArray[0] = addString;
		}
		return newStringArray;
	}

	/**
	 * Static Helper Method which asks user specified question and as long as
	 * they give a input will return a boolean type variable.
	 *
	 * @return Boolean value based on user input
	 */
	public static boolean getBoolean(String question) {
		// Local variable to hold input
		String input;
		// Infinite loop to look out for Yes and No valid options
		while (true) {
			// Ask the user a question to get relative input
			System.out.print(question + " (Yes/Y) or (No/N):");
			// Set the input based on what the user enters on their keyboard
			input = scanner.nextLine();
			// Check if the user has entered Yes
			if (input.equalsIgnoreCase("Yes") || input.equalsIgnoreCase("Y")) {
				// Return that the user has selected Yes so return true
				return true;
				// Check if the user has entered No
			} else if (input.equalsIgnoreCase("No") || input.equalsIgnoreCase("N")) {
				// Return that the user has selected No so return false
				return false;
				// Or else the user has not entered a valid option
			} else {
				// Return an error message to user
				System.out.println("You have not entered a valid option, please choose Yes/Y or No/N.");
				// Continue infinite loop to ask for a valid response
				continue;
			}
		}
	}

	/**
	 * Static Helper Method which asks user specified question and as long as
	 * they give a input will return a boolean type variable.
	 *
	 * @return Boolean value based on user input
	 */
	public static char getChar(String question) {
		// Local variable to hold input
		String input;
		char character = ' ';
		// Infinite loop to look out for valid options
		while (true) {
			try {
				// Ask the user a question to get relative input
				System.out.print(question);
				// Set the input based on what the user enters on their keyboard
				input = scanner.nextLine();
				// Check that the input String is one character long
				if (input.length() < 1) {
					System.out.println("UNDER:" + input.length());
					throw new IllegalArgumentException("too few chars, need at least one.");
				} else if (input.length() > 1) {
					System.out.println("OVER:" + input.length());
					throw new IllegalArgumentException("too many chars - should only have (" + input.charAt(0) + ")");
				}
				character = input.charAt(0);
				// Convert the String into a char value
			} catch (Exception e) {
				// TODO Auto-generated catch block
				// System.out.println("Print e);
				e.getMessage();
			}
			return character;
		}
	}

	/**
	 * Static Helper Method which asks user specified question and as long as
	 * they give a input will return a boolean type variable.
	 *
	 * @return Boolean value based on user input
	 */
	public static char getChar(String question, char... characters) {
		while (true) {
			// Declare Local Variables
			boolean present = false;
			// Get the character using alternative method to get a char
			char letter = RequestInput.getChar(question);
			// Iterate through the supplied chars and see if it is present
			for (int i = 0; i < characters.length; i++) {
				if (Character.compare(characters[i], letter) == 0) {
					present = true;
				}
			}
			// If present variable is set to true and it is a valid option
			if (present == true) {
				// return the character
				return letter;
			} else {
				// Give an error message
				System.out.println("You have not entered a valid character (" + letter + ").");
				// Continue with next iteration
				continue;
			}
		}
	}

	public static double getDouble(String question) {
		// Local variable to hold temporary number
		double num;
		//
		while (true) {
			try {
				// Ask the user a question to get relative input
				System.out.print(question);
				// Set the number based on what the user enters on their
				// keyboard
				num = Double.parseDouble(scanner.nextLine());
				// Break out of the infinite loop
				break;
			} catch (NumberFormatException e) {
				// Output to the user that the number is not valid
				System.out.println("You have not entered a valid number.");
				// Continue the infinite loop to get a valid number conversion
				continue;
			}
		}
		// Return number of pets user has entered
		return num;
	}

	/**
	 * Static Helper Method which asks usera specified question and as long as
	 * they give a valid number will return the number as an int type variable.
	 *
	 * @return Number the user has chosen
	 */
	public static int getInt(String question) {
		// Local variable to hold temporary number
		int num;
		//
		while (true) {
			try {
				// Ask the user a question to get relative input
				System.out.print(question);
				// Set the number based on what the user enters on their
				// keyboard
				num = Integer.parseInt(scanner.nextLine());
				// Break out of the infinite loop
				break;
			} catch (NumberFormatException e) {
				// Output to the user that the number is not valid
				System.out.println("You have not entered a valid number.");
				// Continue the infinite loop to get a valid number conversion
				continue;
			}
		}
		// Return number of pets user has entered
		return num;
	}

	/**
	 * Static Helper Method which asks user specified question and return the
	 * input to user.
	 *
	 * @return Input given from user.
	 */
	public static String getString(String question) {
		// Local variable to hold temporary number
		String input;
		// Ask the user a question to get relative input
		System.out.print(question);
		// Set the number based on what the user enters on their
		// keyboard
		input = scanner.nextLine();
		// Return input user has entered
		return input;
	}

	/**
	 * Static Helper Method which asks user specified question and as long as
	 * they give a input will return a boolean type variable.
	 *
	 * @return Boolean value based on user input
	 */
	public static String getString(String question, String... words) {
		while (true) {
			// Declare Local Variables
			boolean present = false;
			// Get the character using alternative method to get a char
			String input = RequestInput.getString(question);
			// Iterate through the supplied chars and see if it is present
			for (int i = 0; i < words.length; i++) {
				if ((words[i].equals(input))) {
					present = true;
				}
			}
			// If present variable is set to true and it is a valid option
			if (present == true) {
				// return the character
				return input;
			} else {
				// Give an error message
				System.out.println("You have not entered a valid word (" + input + ").");
				// Continue with next iteration
				continue;
			}
		}
	}
}