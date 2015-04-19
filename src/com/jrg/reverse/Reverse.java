package com.jrg.reverse;

/**
 * Write a java program to reverse an array of integers.
 * 
 * @author "Jigar Gosalia"
 * 
 */
public class Reverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		System.out.print("Before: ");
		displayArray(array);
		reverse(array);
		System.out.println();
		System.out.print("After : ");
		displayArray(array);
	}

	/**
	 * Reverse Array
	 * 
	 * @param array
	 */
	private static void reverse(int[] array) {
		for (int i = 0; i <= (array.length/2); i++) {
			int temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
	}

	/**
	 * Display Array
	 * 
	 * @param array
	 */
	private static void displayArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i != (array.length - 1)) {
				System.out.print(",");
			}
		}
	}
}
