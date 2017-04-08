package com.leoyuchuan.leetcode.numberof1bits;

public class NumberOf1Bits {
	public static void main(String[] args) {
		System.out.println(hammingWeight(2147483647) + "");
	}

	public static int hammingWeight(int n) {
		long unsignedN = Integer.toUnsignedLong(n);
		int sum = 0;
		while (unsignedN != 0) {
			long residue = unsignedN % 2;
			sum += residue;
			unsignedN = unsignedN / 2;
		}
		return sum;
	}
}
