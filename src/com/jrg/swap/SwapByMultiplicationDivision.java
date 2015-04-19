package com.jrg.swap;

/**
 * Using Multiplication Division
 * 
 * @author "Jigar Gosalia"
 *
 */
public class SwapByMultiplicationDivision {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 2, b = 3;
		System.out.println("Before - a:" + a + " " + "b:" + b);
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("After  - a:" + a + " " + "b:" + b);
	}
}
