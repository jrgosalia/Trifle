package com.jrg.swap;

/**
 * Using Addition Subtraction
 * 
 * @author "Jigar Gosalia"
 *
 */
public class SwapByAdditionSubtraction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 2, b = 3;
		System.out.println("Before - a:" + a + " " + "b:" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After  - a:" + a + " " + "b:" + b);
	}
}
