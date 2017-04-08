package com.leoyuchuan.leetcode.searchinsertposition;

public class SearchInsertPosition {
	// O(n)
	// public int searchInsert(int[] nums, int target) {
	// for (int i = 0; i < nums.length; i++) {
	// if (nums[i] >= target) {
	// return i;
	// }
	// }
	// return nums.length;
	// }
	public int searchInsert(int[] A, int target) {
		int low = 0, high = A.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (A[mid] == target)
				return mid;
			else if (A[mid] > target)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return low;
	}
}
