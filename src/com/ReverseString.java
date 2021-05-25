package com;

public class ReverseString {

	public static void main(String[] args) {

		String str = "ANAND";

		

		System.out.println(reverseString(str));

	}

	public static String reverseString(String str) {
		char[] reserv = new char[str.length()];

		int j = 0;

		for (int i = str.length() - 1; i >= 0; i--) {

			// System.out.println(str.charAt(i));
			reserv[j] = str.charAt(i);
			j++;
		}
		return new String(reserv);
	}

}
