package com.jrg.loop;

/**
 * Using do...while loop.
 * 
 * @author "Jigar Gosalia"
 * 
 */
public class DoWhileLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int intArray[] = {0,1,2,3,4,5,6,7,8,9};
		char charArray[] = {'a','b','c','d','e','f','g','h','i','j'};
		float floatArray[] = {0.0f,1.1f,2.2f,3.3f,4.4f,5.5f,6.6f,7.7f,8.8f,9.9f};
		double doubleArray[] = {0.0d,1.1d,2.2d,3.3d,4.4d,5.5d,6.6d,7.7d,8.8d,9.9d};
		boolean booleanArray[] = {true, false};

		int counter = 0;
		do {
			System.out.print(intArray[counter]);
			if (counter != (intArray.length - 1)) {
				System.out.print(", ");
			}
			counter++;
		} while(counter < 10);

		counter = 0;
		System.out.println();
		do {
			System.out.print(charArray[counter]);
			if (counter != (charArray.length - 1)) {
				System.out.print(", ");
			}
			counter++;
		} while(counter < 10);

		counter = 0;
		System.out.println();
		do {
			System.out.print(floatArray[counter]);
			if (counter != (floatArray.length - 1)) {
				System.out.print(", ");
			}
			counter++;
		} while(counter < 10);

		counter = 0;
		System.out.println();
		do {
			System.out.print(doubleArray[counter]);
			if (counter != (doubleArray.length - 1)) {
				System.out.print(", ");
			}
			counter++;
		} while(counter < 10);

		counter = 0;
		System.out.println();
		do {
			System.out.print(booleanArray[counter]);
			if (counter != (booleanArray.length - 1)) {
				System.out.print(", ");
			}
			counter++;
		} while(counter < 2);
	}
}
