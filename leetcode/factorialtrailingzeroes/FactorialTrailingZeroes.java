package com.leoyuchuan.leetcode.factorialtrailingzeroes;

public class FactorialTrailingZeroes {
	public static void main(String[] args) {
		System.out.println(trailingZeroes(1808548329));
		System.out.println(trailingZeroes(2147483647));

	}

	public static int trailingZeroes(int n) {
		int timesOf5 = 1;
		int numOfZeroes = 0;
		while (true) {
			if (timesOf5 >= Integer.MAX_VALUE / 5) {
				break;
			}
			timesOf5 = timesOf5 * 5;
			if (timesOf5 > n) {
				break;
			}
			numOfZeroes += n / timesOf5;
		}
		return numOfZeroes;
	}
}
