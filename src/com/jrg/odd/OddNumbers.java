package com.jrg.odd;

/**
 * Write a java program to print all the odd numbers present between 0 and given
 * MAX number.
 * 
 * @author "Jigar Gosalia"
 * 
 */
public class OddNumbers {

	/** Holds MAX value	*/
	public static final int MAX = 100;

	/**
	 * @param args
	 */
	public static void main(final String[] args) {

		for (int i = 0; i <= MAX; i++) {
			if (i % 2 != 0) {
				System.out.println(i + " is an ODD number");
			}
		}
	}
}