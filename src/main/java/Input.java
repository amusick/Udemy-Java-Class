import java.util.Scanner;

/**
 * File Name: Input.java<br>
 * Musick, Annette<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Mar 28, 2016
 */
/**
 * Input //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Musick, Annette
 * @version 1.0.0
 * @since 1.0
 */
public class Input {

	public static void main(String[] args) {
		// Create scanner object
		Scanner input = new Scanner(System.in);
		// Output the prompt
		System.out.print("Enter a floating point value: ");
		// Wait for the user to enter something
		double value = input.nextDouble();
		// Tell them what they entered.
		System.out.println("You entered: " + value);
	}
}
