package com.leoyuchuan.leetcode.maximumsubarray;

public class MaximumSubarray {
	public static void main(String[] args) {
		System.out.println(maxSubArray(new int[] { 1, 2 }));
		System.out.println(maxSubArray(new int[] { -2, 1 }));
	}

	// public static int maxSubArray(int[] nums) {
	// int max = nums[0], min = 0;
	// int maxSum = max;
	// for (int i = 0; i < nums.length; i++) {
	// if (i != 0) {
	// nums[i] = nums[i] + nums[i - 1];
	// }
	// max = nums[i];
	// if (max - min > maxSum) {
	// maxSum = max - min;
	// }
	// min = Math.min(min, nums[i]);
	// }
	// return maxSum;
	// }

	public static int maxSubArray(int[] A) {
		int maxSoFar = A[0], maxEndingHere = A[0];
		for (int i = 1; i < A.length; ++i) {
			maxEndingHere = Math.max(maxEndingHere + A[i], A[i]);
			maxSoFar = Math.max(maxSoFar, maxEndingHere);
		}
		return maxSoFar;
	}

}
