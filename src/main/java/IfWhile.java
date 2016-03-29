/**
 * File Name: IfWhile.java<br>
 * Musick, Annette<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Mar 28, 2016
 */
/**
 * IfWhile //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Musick, Annette
 * @version 1.0.0
 * @since 1.0
 */
public class IfWhile {

	public static void main(String[] args) {
		int loop = 0;
		while (true) {
			System.out.println("looping: " + loop);
			loop++;
			if (loop == 5) {
				break;
			}
			System.out.println("Running");
		}
	}
}
