package com.leoyuchuan.leetcode.countprimes;

public class CountPrimes {
	public static void main(String[] args) {
		System.out.println(countPrimes(499979));
	}

	// public static int countPrimes(int n) {
	// int count = 0;
	// for (int i = 2; i <= n; i++) {
	// if (i == 2) {
	// count++;
	// continue;
	// }
	// boolean isPrime = true;
	// for (int j = 2; j < i; j++) {
	// if (i % j == 0) {
	// isPrime = false;
	// break;
	// }
	// if (j == i - 1) {
	// count++;
	// }
	// }
	// if (isPrime == false) {
	// continue;
	// }
	// }
	// return count;
	// }

	public static int countPrimes(int n) {
		if (n <= 1) {
			return 0;
		}
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = 1;
		}
		array[0] = 0;
		array[1] = 0;
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (array[i] == 0) {
				continue;
			}
			count++;
			for (int j = 2; i * j < n; j++) {
				array[i * j] = 0;
			}
		}
		return count;
	}
}
