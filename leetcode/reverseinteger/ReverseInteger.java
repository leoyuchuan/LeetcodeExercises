package com.leoyuchuan.leetcode.reverseinteger;

public class ReverseInteger {
	public static void main(String[] args) {
		System.out.println(reverse(123));
	}

	public static int reverse(int x) {
		int sig = Integer.signum(x);
		x = Math.abs(x);
		StringBuilder sb = new StringBuilder(Integer.toString(x));
		try {
			Integer.parseInt(sb.reverse().toString());
		} catch (NumberFormatException e) {
			return 0;
		}
		return sig * Integer.parseInt(sb.toString());
	}
}
