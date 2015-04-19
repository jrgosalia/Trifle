package com.jrg.multiplication;

/**
 * Write a java program to print the multiplication tables for given row and column of numbers.
 * 
 * @author "Jigar Gosalia"
 *
 */
public class MultiplicationTables {

	/** Holds ROW value	*/
	public static final int ROW = 12;

	/** Holds COLUMN value	*/
	public static final int COLUMN = 12;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for(int i=1; i<=ROW; i++) {
			System.out.printf("%5d",i);
			for (int j=1;j<=COLUMN;j++) {
				if (j == 1) {
					System.out.printf("|");
				}
				System.out.printf("%5d",i*j);
			}
			System.out.println();
		}
	}
}
