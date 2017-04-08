package com.leoyuchuan.leetcode.stringtointegeratoi;

public class StringToIntegerATOI {
	public static void main(String[] args) {
		System.out.println(myAtoi("    10522545459"));
	}

	public static int myAtoi(String str) {
		int sign = 1;
		boolean valueCaptured = false;
		boolean signCaptured = false;
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char current = str.charAt(i);
			if (!signCaptured && !valueCaptured && (current > '9' || current < '0')
					&& (current != ' ' && current != '+' && current != '-'))
				return 0;
			if (signCaptured && (current == '+' || current == '-')) {
				return 0;
			}
			if (signCaptured && !valueCaptured && (current > '9' || current < '0')) {
				return 0;
			}
			if (signCaptured && !valueCaptured && (current > '9' || current < '0')) {
				return 0;
			}
			if (current == '-' && signCaptured == false && valueCaptured == false) {
				sign = -1;
				signCaptured = true;
			}
			if (current == '+' && signCaptured == false && valueCaptured == false) {
				sign = 1;
				signCaptured = true;
			}
			if (current <= '9' && current >= '0') {
				valueCaptured = true;
				if (sum > Integer.MAX_VALUE / 10.0 || Integer.MAX_VALUE - (current - '0') < sum * 10) {
					if (sign == 1) {
						return Integer.MAX_VALUE;
					} else {
						return Integer.MIN_VALUE;
					}
				}
				sum = sum * 10 + (current - '0');
			}

			if (valueCaptured && (current > '9' || current < '0')) {
				break;
			}
		}
		return sum * sign;
	}
}
