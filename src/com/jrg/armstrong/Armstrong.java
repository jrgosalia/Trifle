package com.jrg.armstrong;

/**
 * Write a java program to print all the Armstrong numbers present between 0 and
 * 999.
 * <br><br>
 * An Armstrong number of three digits is an integer such that the sum of the
 * cubes of its digits is equal to the number itself.
 * <br><br>
 * For example: 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.
 * 
 * @author "Jigar Gosalia"
 * 
 */
public class Armstrong {

	/** Holds MAX value	*/
	public static final int MAX = 999;

	/**
	 * @param args
	 */
	public static void main(final String[] args) {

		for (int i = 99; i < MAX; i++) {
			if (isArmstrongNumber(i)) {
				System.out.print(i + " ");
			}
		}
	}

	/**
	 * Check if given number is Armstrong number.
	 * 
	 * @param original
	 * @return
	 */
	private static boolean isArmstrongNumber(final int original) {

		int number = original;

		int result = 0;

		while (number != 0) {
			int reminder = number % 10;
			result = result + (reminder * reminder * reminder);
			number = number / 10;
		}

		if (result == original) {
			return true;
		}
		return false;
	}
}