package com.jrg.prime;

/**
 * Write a java program to print all the prime numbers present between 0 and given MAX number.
 *
 * @author "Jigar Gosalia"
 *
 */
public class Prime {

	/** Holds MAX value	*/
	public static final int MAX = 100;
 
	/**
	 * @param args
	 */
	public static void main(final String[] args) {

		for (int i=0; i<MAX; i++) {
			if (checkPrime(i)) {
				System.out.println(i);
			}
		}
	}

	/**
	 * Check if given number is prime.
	 * 
	 * @param number
	 * @return
	 */
	private static boolean checkPrime(final int number) {
		if (number == 0 || number == 1) {
			return false;
		}

		for (int i = 2; i < number / 2; i++) {
			if ((number % i) == 0) {
				return false;
			}
		}
		return true;
	}
}