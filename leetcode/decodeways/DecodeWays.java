package com.leoyuchuan.leetcode.decodeways;

public class DecodeWays {
	public static void main(String[] args) {
		System.out.println(numDecodings("17"));
	}

	public static int numDecodings(String s) {
		if (s.equals(""))
			return 0;
		if (s.charAt(0) == '0')
			return 0;
		int len = s.length();
		int[] output = new int[len];
		for (int i = len - 1; i >= 0; i--) {
			if (i == len - 1) {
				if (s.charAt(i) == '0') {
					output[i] = 0;
				} else {
					output[i] = 1;
				}
				continue;
			}
			if (s.charAt(i) == '0') {
				output[i] = 0;
			} else {
				output[i] = output[i + 1];
			}
			if ((s.charAt(i) == '2' && s.charAt(i + 1) <= '6') || s.charAt(i) == '1') {
				if (i == len - 2) {
					output[i] += 1;
				} else {
					output[i] += output[i + 2];
				}
			}
		}
		return output[0];
	}
}
