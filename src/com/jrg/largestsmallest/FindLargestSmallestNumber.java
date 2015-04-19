package com.jrg.largestsmallest;

/**
 * Write a java program to find Largest and Smallest Number in an Array. 
 * 
 * @author "Jigar Gosalia"
 *
 */
public class FindLargestSmallestNumber {

	public static void main(String[] args) {

		int array[] = new int[] { 29, 33, 64, 12, 73, 99, 0, 59, 84, 45 };

		int smallestNumber = array[0];

		int largestNumber = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > largestNumber)
				largestNumber = array[i];
			else if (array[i] < smallestNumber)
				smallestNumber = array[i];

		}

		System.out.println("Largest  : " + largestNumber);

		System.out.println("Smallest : " + smallestNumber);
	}
}