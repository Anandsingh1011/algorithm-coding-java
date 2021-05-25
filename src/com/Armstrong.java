package com;

/*
 * Input : 153 
 * Output : Yes 
 * 153 is an Armstrong number. 1*1*1 + 5*5*5 + 3*3*3 = 153
 * 
 * abcd... = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + .... 
 */
public class Armstrong {

	public static void main(String[] args) {

	}

	public static boolean isArmstrong(int x) {
		// Calling order function
		int n = order(x);
		int temp = x, sum = 0;
		while (temp != 0) {
			int r = temp % 10;
			sum = sum + power(r, n);
			temp = temp / 10;
		}

		// If satisfies Armstrong condition
		return (sum == x);

	}

	/*
	 * Function to calculate x raised to the power y
	 */
	public static int power(int x, long y) {
		if (y == 0)
			return 1;
		if (y % 2 == 0)
			return power(x, y / 2) * power(x, y / 2);
		return x * power(x, y / 2) * power(x, y / 2);
	}

	/* Function to calculate order of the number */
	public static int order(int x) {
		int n = 0;
		while (x != 0) {
			n++;
			x = x / 10;
		}
		return n;
	}

}
