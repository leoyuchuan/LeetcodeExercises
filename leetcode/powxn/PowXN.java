package com.leoyuchuan.leetcode.powxn;

public class PowXN {
	public static void main(String[] args) {
		System.out.println(myPow(34.00515, -3));
	}

	public static double myPow(double x, int n) {
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return x;
		}

		if (n > 0) {
			if (n % 2 == 0) {
				return myPow(x * x, n / 2);
			} else {
				return myPow(x * x, (n - 1) / 2) * x;
			}
		} else {
			if ((-n) % 2 == 0) {
				return 1 / myPow(x * x, (-n) / 2);
			} else {
				return 1 / (myPow(x * x, (-n - 1) / 2) * x);
			}
		}
	}
}
