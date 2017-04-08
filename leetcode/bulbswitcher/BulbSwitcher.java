package com.leoyuchuan.leetcode.bulbswitcher;

public class BulbSwitcher {
	public static void main(String[] args) {
	}

	// straight forward
	// public static int bulbSwitch(int n) {
	// if (n == 0) {
	// return 0;
	// }
	// if (n == 1) {
	// return 1;
	// }
	// boolean[] bulbs = new boolean[n];
	// for (int i = 0; i < n; i++) {
	// bulbs[i] = true;
	// }
	//
	// for (int i = 1; i < n; i++) {
	// for (int j = i + 1; j <= n; j++) {
	// if (j % (i + 1) == 0)
	// bulbs[j - 1] = !bulbs[j - 1];
	// }
	// }
	// int count = 0;
	// for (int i = 0; i < n; i++) {
	// if (bulbs[i] == true)
	// count++;
	// }
	// return count;
	// }

}
