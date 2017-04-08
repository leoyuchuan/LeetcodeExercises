package com.leoyuchuan.leetcode.reversebits;

public class ReverseBits {
	public static void main(String[] args) {
		System.out.println(reverseBits(1));
	}

	public static int reverseBits(int n) {
		long a = Integer.toUnsignedLong(n);
		int b = 0;
		b += a & 1;
		for (int i = 0; i < 31; i++) {
			a >>= 1;
			b <<= 1;
			b += a & 1;
		}
		return b;
		// String unsignedString = Integer.toUnsignedString(n, 2);
		// StringBuilder sb = new StringBuilder(unsignedString);
		// int length = 32 - sb.length();
		// for (int i = 0; i < length; i++) {
		// sb.insert(0, "0");
		// }
		// return Integer.parseUnsignedInt(sb.reverse().toString(), 2);
	}
}
