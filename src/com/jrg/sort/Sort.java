package com.jrg.sort;

/**
 * Write a java program to (bubble) sort an array of integers.
 * 
 * @author "Jigar Gosalia"
 * 
 */
public class Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		System.out.print("Before: ");
		displayArray(array);
		sort(array);
		System.out.println();
		System.out.print("After : ");
		displayArray(array);
	}

	/**
	 * Bubble Sort Array
	 * 
	 * @param array
	 */
	private static void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < (array.length - i); j++) {
				if (array[j - 1] > array[j]) {
					// swap the elements!
					int temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
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
