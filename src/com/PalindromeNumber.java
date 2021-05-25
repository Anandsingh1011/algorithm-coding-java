package com;

public class PalindromeNumber {

	public static void main(String[] args) {

		System.out.println("404 = " + isPalindrome(404));

		System.out.println("1441 = " + isPalindrome(1441));

		System.out.println("1404 = " + isPalindrome(1404));

		System.out.println("304 = " + isPalindrome(304));
	}

	/*
	 * Using number reverse
	 */
	private static boolean isPalindrome(int num) {

		boolean palindrome = false;
		int numTmp = num;

		int res = 0;
		while (num > 0) {
			res = (res * 10) + (num % 10);
			num = num / 10;
		}

		if (res == numTmp)
			palindrome = true;

		return palindrome;
	}

	/*
	 * Using string reverse
	 */
	private static boolean isPalindrome2(int num) {

		boolean palindrome = true;

		String str = num + "";

		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) != str.charAt(str.length() - i - 1))
				return false;
		}

		return palindrome;
	}

}
