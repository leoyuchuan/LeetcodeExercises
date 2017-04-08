package com.leoyuchuan.leetcode.dividetwointegers;

public class DivideTwoIntegers {
	// public static int divide(int dividend, int divisor) {
	// if (divisor == 0)
	// return Integer.MAX_VALUE;
	// if (divisor == dividend)
	// return 1;
	// boolean isNegative = false;
	// boolean addOne = false;
	// if (divisor < 0) {
	// isNegative = true;
	// divisor = -divisor;
	// }
	// if (dividend < 0) {
	// isNegative = !isNegative;
	// if (dividend == Integer.MIN_VALUE) {
	// // if (divisor == 1 && isNegative)
	// // return Integer.MIN_VALUE;
	// dividend = Integer.MAX_VALUE;
	// addOne = true;
	// } else
	// dividend = -dividend;
	// }
	// if (divisor == Integer.MIN_VALUE)
	// return 0;
	// if (divisor > dividend)
	// return 0;
	// if (divisor == 1) {
	// return isNegative ? -dividend + ((addOne) ? -1 : 0) : dividend;
	// }
	//
	// int m = 0;
	// int count = 0;
	// int remainder = dividend;
	// for (int i = 0; i < 32; i++) {
	// divisor = divisor << 1;
	// count++;
	// if (divisor <= 0 || divisor > dividend) {
	// divisor = divisor >>> 1;
	// count--;
	// break;
	// }
	// }
	// while (remainder > 0) {
	// int tmp = remainder - divisor;
	// if (addOne) {
	// tmp += 1;
	// }
	// if (tmp >= 0) {
	// m += 1 << count;
	// remainder -= divisor;
	// if (addOne) {
	// remainder += 1;
	// addOne = false;
	// }
	// } else {
	// divisor = divisor >> 1;
	// count--;
	// if (count < 0)
	// break;
	// }
	// }
	// if (isNegative) {
	// return -m;
	// } else {
	// return m;
	// }
	// }

	public static int divide(int dividend, int divisor) {
		boolean addOneDividend = false;
		boolean addOneDivisor = false;
		boolean isNegative = false;
		if (divisor < 0) {
			isNegative = true;
			if (divisor == Integer.MIN_VALUE) {
				addOneDivisor = true;
				divisor = Integer.MAX_VALUE;
			} else {
				divisor = -divisor;
			}
		}

		if (dividend < 0) {
			isNegative = !isNegative;
			if (dividend == Integer.MIN_VALUE) {
				addOneDividend = true;
				dividend = Integer.MAX_VALUE;
			} else {
				dividend = -dividend;
			}
		}

		if (divisor == 1) {
			return isNegative ? -dividend + (addOneDividend ? -1 : 0)
					: dividend;
		}
		int a = divisor - dividend + (addOneDividend ? -1 : 0)
				+ (addOneDivisor ? 1 : 0);
		if (a > 0) {
			return 0;
		}
		if (a == 0) {
			return isNegative ? -1 : 1;
		}
		// return 0;
		int m = 0;
		int count = 0;
		int remainder = dividend;
		for (int i = 0; i < 32; i++) {
			divisor = divisor << 1;
			count++;
			if (divisor <= 0 || divisor > dividend) {
				divisor = divisor >>> 1;
				count--;
				break;
			}
		}
		while (remainder > 0) {
			int tmp = remainder - divisor;
			if (addOneDividend) {
				tmp += 1;
			}
			if (tmp >= 0) {
				m += 1 << count;
				remainder -= divisor;
				if (addOneDividend) {
					if (remainder + 1 > 0)
						remainder += 1;
					addOneDividend = false;
				}
			} else {
				divisor = divisor >> 1;
				count--;
				if (count < 0)
					break;
			}
		}
		if (isNegative) {
			return -m;
		} else {
			return m;
		}
	}

	public static void main(String[] args) {
		double time = System.nanoTime();
		System.out.println("Output: "
				+ divide(Integer.MIN_VALUE, Integer.MIN_VALUE + 1));
		System.out.println((System.nanoTime() - time) / 1000000 + " ms");

		time = System.nanoTime();
		System.out.println("Output:" + Integer.MIN_VALUE
				/ (Integer.MIN_VALUE + 1));

		System.out.println((System.nanoTime() - time) / 1000000 + " ms");
	}
}
