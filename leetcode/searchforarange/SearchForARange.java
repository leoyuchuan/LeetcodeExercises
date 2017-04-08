package com.leoyuchuan.leetcode.searchforarange;

public class SearchForARange {
	public int[] searchRange(int[] nums, int target) {
		return binarySearch(nums, 0, nums.length - 1, target, new int[] { -1, -1 }, -1);
	}

	public int[] binarySearch(int[] nums, int start, int end, int target, int[] range, int searchOption) {
		int count = (end - start) / 2 + 1;
		if (count % 2 == 0) {
			int middleLeft = start + count / 2 - 1;
			int middleRight = start + count / 2;
		} else {
			int middle = start + count / 2;
		}
		return new int[0];
	}
}
