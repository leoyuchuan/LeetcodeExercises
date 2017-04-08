package com.leoyuchuan.leetcode.houserobber;

public class HouseRobber {
	public static int rob(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int[] max = new int[nums.length];
		if (nums.length == 1) {
			return nums[0];
		}
		max[0] = nums[0];
		if (nums.length == 2) {
			return Math.max(max[0], nums[1]);

		}
		max[1] = Math.max(max[0], nums[1]);
		for (int i = 2; i < nums.length; i++) {
			max[i] = Math.max(max[i - 2] + nums[i], max[i - 1]);
		}
		return max[max.length - 1];
	}
}
