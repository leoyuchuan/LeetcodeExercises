package com.leoyuchuan.leetcode.plusone;

import java.util.Arrays;

public class PlusOne {
	public static int[] plusOne(int[] digits) {
		int length = digits.length;
		digits[length - 1] += 1;
		for (int i = length - 1; i >= 1; i--) {
			if (digits[i] >= 10) {
				digits[i] -= 10;
				digits[i - 1] += 1;
			}
		}
		if (digits[0] >= 10) {
			digits[0] -= 10;
			int[] tmp = new int[digits.length + 1];
			tmp[0] = 1;
			for (int i = 0; i < digits.length; i++) {
				tmp[i + 1] = digits[i];
			}
			digits = tmp;
		}

		return digits;
	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(plusOne(new int[] { 9, 9, 9, 9 })));
	}
}
