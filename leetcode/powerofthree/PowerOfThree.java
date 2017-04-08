package com.leoyuchuan.leetcode.powerofthree;

public class PowerOfThree {
	// public boolean isPowerOfThree(int n) {
	// if (n == 0) {
	// return false;
	// }
	// int initial = (int) Math.floor(Math.sqrt(n));
	// for (int i = initial; i >= 0; i--) {
	// int tmp = i * i * i;
	// if (tmp == n) {
	// return true;
	// }
	// if (tmp < n) {
	// return false;
	// }
	// }
	// return false;
	// }
	public boolean isPowerOfThree(int n) {
		if (n == 0) {
			return false;
		}
		if (n == 1) {
			return true;
		}
		if (n % 3 == 0) {
			return isPowerOfThree(n / 3);
		}
		return false;
	}
}
