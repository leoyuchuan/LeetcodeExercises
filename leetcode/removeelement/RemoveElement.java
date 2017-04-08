package com.leoyuchuan.leetcode.removeelement;

public class RemoveElement {
	// public int removeElement(int[] nums, int val) {
	// int length = 0;
	// for (int i = 0; i < nums.length; i++) {
	// if (nums[i] == val) {
	// nums[i] = Integer.MAX_VALUE;
	// } else {
	// length++;
	// }
	// }
	// Arrays.sort(nums);
	// return length;
	// }
	public int removeElement(int[] nums, int val) {
		int length = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[length] = nums[i];
				length++;
			}
		}
		return length;
	}
}
