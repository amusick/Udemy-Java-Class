/**
 * File Name: MultiDimArray.java<br>
 * Musick, Annette<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Apr 4, 2016
 */
package com.sqa.am.udemy;

/**
 * MultiDimArray //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Musick, Annette
 * @version 1.0.0
 * @since 1.0
 */
public class MultiDimArray {

	public static void main(String[] args) {
		int[] values = { 3, 5, 2343 };
		System.out.println(values[2]);
		int[][] grid = { { 3, 5, 2343 }, { 2, 4 }, { 1, 2, 3, 4 } };
		System.out.println(grid[1][1]);
		System.out.println(grid[0][2]);
		String[][] texts = new String[2][3];
		System.out.println(texts[0][1]);
		texts[0][1] = "Hello There!";
		System.out.println(texts[0][1]);
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				System.out.print(grid[row][col] + "\t");
			}
		}
		System.out.println();
	}
}
