package com.leoyuchuan.leetcode.countingbits;

public class CountingBits {
	// public int[] countBits(int num) {
	// int[] output = new int[num + 1];
	// int times = 2;
	// for (int i = 0; i <= num; i++) {
	// if (i == 0) {
	// output[i] = 0;
	// continue;
	// }
	// if (i == 1) {
	// output[i] = 1;
	// continue;
	// }
	// if (i == times) {
	// output[i] = 1;
	// times = times * 2;
	// continue;
	// }
	// if (i % 2 == 1) {
	// output[i] = output[i - 1] + 1;
	// } else {
	// int numOf2 = 0;
	// int tmp = i;
	// while (tmp % 2 == 0) {
	// numOf2++;
	// tmp /= 2;
	// }
	// output[i] = output[i - 1] - (numOf2 - 1);
	// }
	// }
	// return output;
	// }

	public int[] countBits(int num) {
		int[] answer = new int[num + 1];
		if (num >= 0)
			answer[0] = 0;
		for (int i = 1; i <= num; i++) {
			answer[i] = answer[i / 2] + i % 2;
		}
		return answer;
	}
}
