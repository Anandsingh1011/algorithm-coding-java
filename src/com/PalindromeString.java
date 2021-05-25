package com;

public class PalindromeString {

	public static void main(String[] args) {

		System.out.println("NITIN = " + isPalindrome2("NITIN"));

		System.out.println("ANAND = " + isPalindrome2("ANAND"));

	}

	/*
	 * Using string reverse
	 */
	private static boolean isPalindrome2(String str) {

		boolean palindrome = true;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != str.charAt(str.length() - i - 1))
				return false;
		}

		return palindrome;
	}

}
