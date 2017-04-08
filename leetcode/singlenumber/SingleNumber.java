package com.leoyuchuan.leetcode.singlenumber;

public class SingleNumber {

	// public int singleNumber(int[] nums) {
	// Arrays.sort(nums);
	// for (int i = 0; i < nums.length; i++) {
	// if (i + 1 >= nums.length) {
	// return nums[i];
	// }
	// if (nums[i] == nums[i + 1]) {
	// i++;
	// } else {
	// return nums[i];
	// }
	// }
	// return 0;
	// }
	// public int singleNumber(int[] nums) {
	// HashMap<Integer, Integer> map = new HashMap<>();
	// for (int i = 0; i < nums.length; i++) {
	// if (!map.containsKey(nums[i])) {
	// map.put(nums[i], 1);
	// } else {
	// map.put(nums[i], 2);
	// }
	// }
	// Iterator<Integer> iterator = map.keySet().iterator();
	// while (iterator.hasNext()) {
	// Integer key = iterator.next();
	// if (map.get(key) == 1) {
	// return key;
	// }
	// }
	// return 0;
	// }
	public int singleNumber(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result ^= nums[i];
		}
		return result;
	}
}
