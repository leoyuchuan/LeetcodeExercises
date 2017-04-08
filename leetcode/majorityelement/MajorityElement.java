package com.leoyuchuan.leetcode.majorityelement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MajorityElement {
	public static int majorityElement(int[] nums) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			hm.putIfAbsent(nums[i], 0);
			hm.put(nums[i], hm.get(nums[i]) + 1);
		}
		Set<Integer> keys = hm.keySet();
		int max = 0;
		int major = nums[0];
		Iterator<Integer> iter = keys.iterator();
		while (iter.hasNext()) {
			int key = iter.next();
			int num = hm.get(key);
			if (num > max) {
				max = num;
				major = key;
			}
		}
		return major;
	}

	public static void main(String[] args) {
		System.out
				.println(majorityElement(new int[] { 1, 2, 3, 3, 2, 1, 1, 1 })
						+ "");
	}
}
