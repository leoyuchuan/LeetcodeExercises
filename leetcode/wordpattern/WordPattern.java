package com.leoyuchuan.leetcode.wordpattern;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
	public static boolean wordPattern(String pattern, String str) {
		char[] pat = pattern.toCharArray();
		String[] target = str.split(" ");
		if (pat.length != target.length) {
			return false;
		}
		if (pat.length == 0)
			return false;
		Map<Character, String> bijection = new HashMap<>();
		for (int i = 0; i < pat.length; i++) {
			char k = pat[i];
			if (bijection.containsKey(k)) {
				String c = bijection.get(k).trim();
				if (c.equals(target[i].trim())) {
					continue;
				} else {
					return false;
				}
			} else {
				if (bijection.containsValue(target[i].trim()))
					return false;
				bijection.put(k, target[i].trim());
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(wordPattern("abba", "dog cat cat dog"));
	}

}
