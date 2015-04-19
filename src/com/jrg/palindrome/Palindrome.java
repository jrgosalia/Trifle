package com.jrg.palindrome;

/**
 * Write a java program to check if given string is Palindrome or not.
 * <br><br>
 * A palindrome is a word, phrase, number, or other sequence of characters which
 * reads the same backward or forward.
 * <br><br>
 * For example: noon, civic, radar, level, kayak, redder, madam, etc.
 * 
 * @author "Jigar Gosalia"
 * 
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		System.out.println("Null         : " + isPalindrome(null));
		System.out.println("Empty String : "
				+ isPalindrome(""));
		System.out.println("a            : " + isPalindrome("a"));
		System.out.println("Hello        : "
				+ isPalindrome("Hello"));
		System.out.println("Hellooolleh  : "
				+ isPalindrome("Helloolleh"));
		System.out.println("HellooolleH  : "
				+ isPalindrome("HelloolleH"));
	}

	/**
	 * Checks if the input string is Palindrome
	 * 
	 * @param inputString
	 * @return
	 */
	public static boolean isPalindrome(final String inputString) {

		// Check if inputSting is not null
		if (inputString == null) {
			return false;
		}

		// Check if inputString is single character or empty string
		if (inputString.length() <= 1) {
			return true;
		}

		// Note usage of toLowerCase as primitive char doesn't have any methods
		// to do that
		for (int i = 0; i <= inputString.length() / 2; i++) {
			if (inputString.toLowerCase().charAt(i) == inputString
					.toLowerCase().charAt(inputString.length() - i - 1)) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}
}