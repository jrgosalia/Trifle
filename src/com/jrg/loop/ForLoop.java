package com.jrg.loop;

/**
 * Using for loop.
 * 
 * @author "Jigar Gosalia"
 * 
 */
public class ForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int intArray[] = {0,1,2,3,4,5,6,7,8,9};
		char charArray[] = {'a','b','c','d','e','f','g','h','i','j'};
		float floatArray[] = {0.0f,1.1f,2.2f,3.3f,4.4f,5.5f,6.6f,7.7f,8.8f,9.9f};
		double doubleArray[] = {0.0d,1.1d,2.2d,3.3d,4.4d,5.5d,6.6d,7.7d,8.8d,9.9d};
		boolean booleanArray[] = {true, false};

		for (int i=0; i<intArray.length; i++) {
			System.out.print(intArray[i]);
			if (i != (intArray.length - 1)) {
				System.out.print(", ");
			}
		}

		System.out.println();
		for (int i=0; i<charArray.length; i++) {
			System.out.print(charArray[i]);
			if (i != (charArray.length - 1)) {
				System.out.print(", ");
			}
		}

		System.out.println();
		for (int i=0; i<floatArray.length; i++) {
			System.out.print(floatArray[i]);
			if (i != (floatArray.length - 1)) {
				System.out.print(", ");
			}
		}

		System.out.println();
		for (int i=0; i<doubleArray.length; i++) {
			System.out.print(doubleArray[i]);
			if (i != (doubleArray.length - 1)) {
				System.out.print(", ");
			}
		}

		System.out.println();
		for (int i=0; i<booleanArray.length; i++) {
			System.out.print(booleanArray[i]);
			if (i != (booleanArray.length - 1)) {
				System.out.print(", ");
			}
		}
	}
}

