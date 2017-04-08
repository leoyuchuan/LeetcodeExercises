package com.leoyuchuan.leetcode.topkfrequentelements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class TopKFrequentElements {
	public static void main(String[] args) {
		System.out.println(topKFrequent(new int[] { 1, 1, 1, 2, 2, 3 }, 2));
	}

	public static List<Integer> topKFrequent(int[] nums, int k) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (hashMap.containsKey(nums[i])) {
				hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
			} else {
				hashMap.put(nums[i], 1);
			}
		}

		FixedSizeList list = new FixedSizeList(k);

		Iterator<Integer> iterator = hashMap.keySet().iterator();
		while (iterator.hasNext()) {
			Integer key = iterator.next();
			Integer value = hashMap.get(key);
			if (list.isFull()) {
				int[] top = list.top();
				int tmpvalue = top[1];
				if (tmpvalue < value) {
					list.insert(key, value);
				}
			} else {
				list.insert(key, value);
			}
		}

		return list.keyValues();
	}

	static class FixedSizeList {
		int[][] list;

		int size = 0;
		int limit = 0;

		public FixedSizeList(int k) {
			list = new int[k][2];
			limit = k;
			for (int i = 0; i < k; i++) {
				list[i] = new int[] { 0, Integer.MAX_VALUE };
			}
		}

		void insert(int key, int value) {
			if (size >= limit) {
				for (int i = 0; i < limit - 1; i++) {
					list[i] = list[i + 1];
				}
				list[limit - 1] = new int[] { 0, Integer.MAX_VALUE };
			} else {
				size++;
			}

			for (int i = 0; i < limit; i++) {
				int[] tmp = list[i];
				int tmpvalue = tmp[1];
				if (value < tmpvalue) {
					for (int j = limit - 1; j > i; j--) {
						list[j] = list[j - 1];
					}
					list[i] = new int[] { key, value };
					break;
				}
			}
		}

		int[] top() {
			return list[0];
		}

		boolean isFull() {
			return size >= limit;
		}

		List<Integer> keyValues() {
			ArrayList<Integer> output = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				output.add(list[i][0]);
			}
			return output;
		}

	}
}
