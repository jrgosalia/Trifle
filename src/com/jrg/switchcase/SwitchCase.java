package com.jrg.switchcase;

/**
 * Write a java program to display day of the week using 1-7.
 * 
 * @author "Jigar Gosalia"
 * 
 */
public class SwitchCase {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {

		int dayOfTheWeek = 1;

		switch (dayOfTheWeek) {
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
			default:
				break;
		}
	}
}