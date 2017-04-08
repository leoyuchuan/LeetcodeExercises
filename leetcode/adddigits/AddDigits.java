package com.leoyuchuan.leetcode.adddigits;

public class AddDigits {
	public static int addDigits(int num) {
		while (num >= 10) {
			num = addAllDigit(num);
		}
		return num;
	}

	private static int addAllDigit(int num) {
		int sum = 0;
		while (num != 0) {
			int digit = num % 10;
			num = (num - digit) / 10;
			sum += digit;
		}
		return sum;
	}

}
