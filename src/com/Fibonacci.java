package com;

/**
 * Write a simple Java program which will print Fibonacci series, e.g. 1 1 2 3 5
 * 8 13 ... . up to a given number.
 * 
 * @author anand
 *
 */

public class Fibonacci {

	/*
	 * Fibonacci series is a series of natural numbers where the next number is
	 * equivalent to the sum of the previous two numbers like fn = fn-1 + fn-2. The
	 * first two numbers of the Fibonacci series are always 1, 1
	 * 
	 * Example : Fibonacci series upto 12 numbers : 1 1 2 3 5 8 13 21 34 55 89 144
	 */

	public static void main(String[] args) {

		int count = 10;

		System.out.println("\nfibonacci_Loop");
		fibonacci_Loop(count);

	}

	private static void fibonacci_Loop(int count) {

		int n1 = 0;
		int n2 = 1;

		int n3;

		System.out.print(n1 + " " + n2);// printing 0 and 1

		for (int i = 2; i < count; ++i)// loop starts from 2 because 0 and 1 are already printed
		{
			n3 = n1 + n2;

			n1 = n2;
			n2 = n3;

			System.out.print(" " + n3);
		}
	}

}
