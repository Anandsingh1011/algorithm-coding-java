package com;

import java.util.stream.IntStream;

public class PrimeNumber {
	/*
	 * Prime number is a number that is greater than 1 and divided by 1 or itself
	 * only. In other words, prime numbers can't be divided by other numbers than
	 * itself or 1. For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
	 */

	public static void main(String[] args) {

		System.out.println("4 = " + isPrime(4));
		System.out.println("3 = " + isPrime(7));
		System.out.println("7 = " + isPrime(7));
		System.out.println("9 = " + isPrime(9));
		System.out.println("12 = " + isPrime(12));
		System.out.println("17 = " + isPrime(17));

		System.out.println("--Print first 50 prime numbers :");

		IntStream.range(0, 50).forEach(nbr -> {
			if (isPrime(nbr))
				System.out.println(nbr + " is Prime ");
		});
	}

	/*
	 * Using Loop
	 */
	private static boolean isPrime(int n) {

		// Check if number is less than equal to 1
		if (n <= 1)
			return false;

		// Check if number is 2
		else if (n == 2)
			return true;

		// Check if n is a multiple of 2
		else if (n % 2 == 0)
			return false;

		// If not, then just check the odds
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	/*
	 * Using Recursion
	 */

	static int i = 2;

	// Function check whether a number
	// is prime or not
	public static boolean isPrimeR(int n) {

		// Corner cases
		if (n == 0 || n == 1) {
			return false;
		}

		// Checking Prime
		if (n == i)
			return true;

		// Base cases
		if (n % i == 0) {
			return false;
		}
		i++;
		return isPrime(n);
	}

}
