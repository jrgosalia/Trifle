package com.jrg.fibonacci;
/**
 * Write a java program to display Fibonacci Sequence.
 *
 * @author "Jigar Gosalia"
 *
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {

		int number = 10;

		System.out.println("Recursively Fibonacci series " + number
				+ "th element : ");
		for (int i = 1; i <= number; i++) {
			System.out.print(fibonacciRecursive(i) + " ");
		}
		System.out.println();

		System.out.println("Non-Recursively Fibonacci series " + number
				+ "th element : ");
		for (int i = 1; i <= number; i++) {
			System.out.print(fibonacciNonRecursive(i) + " ");
		}
		System.out.println();
	}

	/**
	 * @param number
	 * @return
	 */
	public static int fibonacciRecursive(final int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2);
	}

	/**
	 * @param number
	 * @return
	 */
	public static int fibonacciNonRecursive(final int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		int prev = 1, current = 1, next = 1;
		for (int i = 3; i <= number; i++) {
			next = prev + current;
			prev = current;
			current = next;
		}
		return next;
	}
}