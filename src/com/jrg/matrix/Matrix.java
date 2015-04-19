package com.jrg.matrix;

/**
 * Write a java program to display all rows and columns of a 2D matrix.
 *
 * @author "Jigar Gosalia"
 *
 */
public class Matrix {

	/** Holds ROW value	*/
	public static final int ROW = 3;

	/** Holds COLUMN value	*/
	public static final int COLUMN = 3;

	/**
	 * @param args
	 */
	public static void main(final String[] args) {

		int[][] multi = new int[][] { { 1, 1, 2, 3 }, { 2, 2, 1, 4 },
				{ 8, 7, 6, 1 }, { 9, 6, 3, 8 } };

		displayMatrix(multi);
	}

	/**
	 * @param array
	 */
	public static void displayMatrix(final int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%5d", array[i][j]);
			}
			System.out.println();
		}
	}
}