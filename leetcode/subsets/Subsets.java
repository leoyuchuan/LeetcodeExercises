package com.leoyuchuan.leetcode.subsets;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Subsets {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> mySets = new ArrayList<List<Integer>>();
		LinkedList<Integer> initialSet = new LinkedList<Integer>();
		mySets.add(initialSet);
		incrementByOneElement(nums, 0, initialSet, mySets);
		return mySets;

	}

	public void incrementByOneElement(int[] nums, int index, LinkedList<Integer> setArray, List<List<Integer>> allSet) {
		for (int i = index; i < nums.length; i++) {
			@SuppressWarnings("unchecked")
			LinkedList<Integer> clone = ((LinkedList<Integer>) setArray.clone());
			clone.addFirst(nums[i]);
			clone.sort(null);
			allSet.add(clone);
			incrementByOneElement(nums, i + 1, clone, allSet);
		}
	}
}
