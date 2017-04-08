package com.leoyuchuan.leetcode.poweroftwo;

public class PowerOfTwo {
	public static void main(String[] args) {
		System.out.println("" + isPowerOfTwo(32));
	}

	public static boolean isPowerOfTwo(int n) {
		long tmp = 2147483647 + 1;
		return n > 0 && tmp % n == 0;
	}
}
