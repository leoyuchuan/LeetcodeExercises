package com.leoyuchuan.leetcode.containsduplicateii;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {
	public static void main(String[] args) {
		System.out.println(containsNearbyDuplicate(new int[] { 1, 2, 1 }, 0));
	}

	// public static boolean containsNearbyDuplicate(int[] nums, int k) {
	// Map<Integer, Integer> duplicate = new HashMap<Integer, Integer>();
	// for (int i = 0; i < Math.min(k + 1, nums.length); i++) {
	// if (duplicate.containsKey(nums[i])) {
	// duplicate.put(nums[i], duplicate.get(nums[i]) + 1);
	// } else {
	// duplicate.put(nums[i], 1);
	// }
	// }
	// for (int i = 0; i < nums.length; i++) {
	// duplicate.put(nums[i], Math.max(0, duplicate.get(nums[i]) - 1));
	// if (duplicate.get(nums[i]) > 0) {
	// return true;
	// }
	// duplicate.put(nums[i], duplicate.get(nums[i]) + 1);
	// if (i - k >= 0) {
	// duplicate.put(nums[i - k], Math.max(0, duplicate.get(nums[i - k]) - 1));
	// }
	// if (i + k + 1 < nums.length) {
	// if (!duplicate.containsKey(nums[i + k + 1])) {
	// duplicate.put(nums[i + k + 1], 1);
	// } else {
	// duplicate.put(nums[i + k + 1], duplicate.get(nums[i + k + 1]) + 1);
	// }
	// }
	// }
	// return false;
	// }

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		if (k == 0) {
			return false;
		}
		Set<Integer> duplicates = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (duplicates.contains(nums[i]))
				return true;
			if (i >= k) {
				duplicates.remove(nums[i - k]);
			}
			duplicates.add(nums[i]);
		}
		return false;
	}
}
