package com.leoyuchuan.leetcode.topkfrequentelements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElementsAlt {
	public List<Integer> topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		int maxFrequency = 0;

		for (int n : nums) {
			int frequency = frequencyMap.getOrDefault(n, 0) + 1;
			frequencyMap.put(n, frequency);
			maxFrequency = Math.max(maxFrequency, frequency);
		}

		// here i is the frequency and bucket.get(i) is the numbers that having
		// this frequency
		List<List<Integer>> bucket = new ArrayList<>(maxFrequency);
		while (maxFrequency-- >= 0) {
			bucket.add(new ArrayList<>());
		}

		for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
			int frequency = entry.getValue();
			bucket.get(frequency).add(entry.getKey());
		}

		List<Integer> res = new ArrayList<>();
		for (int pos = bucket.size() - 1; pos >= 0 && res.size() < k; pos--) {
			res.addAll(bucket.get(pos));
		}
		return res.subList(0, k);
	}
}
