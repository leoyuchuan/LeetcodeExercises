package com.leoyuchuan.leetcode.validanagram;

import java.util.Map;
import java.util.TreeMap;

public class ValidAnagram {
	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		Map<Character, Integer> sMap = new TreeMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);
			if (sMap.containsKey(current)) {
				sMap.put(current, sMap.get(current) + 1);
			} else {
				sMap.put(current, 1);
			}
		}

		for (int i = 0; i < t.length(); i++) {
			char current = t.charAt(i);
			if (!sMap.containsKey(current)) {
				return false;
			} else {
				Integer left = sMap.get(current) - 1;
				if (left < 0) {
					return false;
				}
				sMap.put(current, left);
			}
		}
		return true;
	}
}
