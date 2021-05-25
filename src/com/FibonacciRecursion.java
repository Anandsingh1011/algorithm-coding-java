package com;

/**
 * Write a simple Java program which will print Fibonacci series, e.g. 1 1 2 3 5
 * 8 13 ... . up to a given number.
 * 
 * @author anand
 *
 */

public class FibonacciRecursion {

	/*
	 * Fibonacci series is a series of natural numbers where the next number is
	 * equivalent to the sum of the previous two numbers like fn = fn-1 + fn-2. The
	 * first two numbers of the Fibonacci series are always 1, 1
	 * 
	 * Example : Fibonacci series upto 12 numbers : 1 1 2 3 5 8 13 21 34 55 89 144
	 */

	static int n1 = 0;
	static int n2 = 1;

	static int n3;

	public static void main(String[] args) {

		int count = 10;

		System.out.println("\nfibonacci_recursion");
		
		System.out.print(n1 + " " + n2);// printing 0 and 1
		
		fibonacci_recursion(count-2);
	}

	private static void fibonacci_recursion(int count) {

		
		if (count > 0) {
			
			n3 = n1 + n2;
			 
			n1 = n2;
			
			n2 = n3;
			
			System.out.print(" " + n3);
			
			fibonacci_recursion(count-1);
		}

	}

}
