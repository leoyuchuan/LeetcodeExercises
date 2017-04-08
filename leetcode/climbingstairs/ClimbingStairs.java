package com.leoyuchuan.leetcode.climbingstairs;

public class ClimbingStairs {
	public static void main(String[] args) {
		System.out.println(climbStairs(44) + "");
	}

	public static int climbStairs(int n) {

		int[] ways = new int[n + 1];

		for (int i = 0; i <= n; i++) {
			if (i == 0) {
				ways[i] = 0;
				continue;
			}
			if (i == 1) {
				ways[i] = 1;
				continue;
			}
			if (i == 2) {
				ways[i] = 2;
				continue;
			}
			ways[i] = ways[i - 1];
			ways[i] = ways[i] + ways[i - 2];
		}

		return ways[n];
	}

	public static int remainingWays(int remainingSteps) {
		if (remainingSteps == 0) {
			return 1;
		}

		int ways1 = 0;
		if (remainingSteps - 1 >= 0) {
			ways1 = remainingWays(remainingSteps - 1);
		}

		int ways2 = 0;
		if (remainingSteps - 2 >= 0) {
			ways2 = remainingWays(remainingSteps - 2);
		}

		return ways1 + ways2;
	}

}
