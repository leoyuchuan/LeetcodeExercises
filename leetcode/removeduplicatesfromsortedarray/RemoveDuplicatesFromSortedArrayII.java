package com.leoyuchuan.leetcode.removeduplicatesfromsortedarray;

public class RemoveDuplicatesFromSortedArrayII {
	public static void main(String[] args) {
		System.out.println(removeDuplicates(new int[] { 1, 1, 1 }));
	}

	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;
		int cur = nums[0];
		int occurrence = 0;
		int length = 0;
		int eliminate = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i + eliminate == nums.length) {
				break;
			}
			if (cur == nums[i]) {
				occurrence++;
				if (occurrence > 2) {
					for (int j = i; j < nums.length - 1; j++) {
						nums[j] = nums[j + 1];
					}
					occurrence--;
					i--;
					length--;
					eliminate++;
				}
			} else {
				cur = nums[i];
				occurrence = 1;
			}
			length++;
		}
		return length;
	}
}
