package com.leoyuchuan.leetcode.removeduplicatesfromsortedarray;

public class RemoveDuplicatesFromSortedArray {
	// public int removeDuplicates(int[] nums) {
	// if (nums.length == 0)
	// return 0;
	// int length = 1;
	// for (int i = 1; i < nums.length; i++) {
	// if (nums[i - 1] == nums[i]) {
	// nums[i - 1] = Integer.MAX_VALUE;
	// } else {
	// length++;
	// }
	// }
	// Arrays.sort(nums);
	// return length;
	// }
	public int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;
		int index = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[index] != nums[i]) {
				index++;
				nums[index] = nums[i];
			}
		}
		return index + 1;
	}
}
