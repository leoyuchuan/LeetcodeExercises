package com.leoyuchuan.leetcode.twosum;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i + 1, j + 1 };
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 2, 7, 11, 15 };
		nums = twoSum(nums, 9);
		System.out.println(nums[0] + "|" + nums[1]);
	}

}
