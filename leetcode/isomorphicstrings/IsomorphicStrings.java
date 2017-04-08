package com.leoyuchuan.leetcode.isomorphicstrings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class IsomorphicStrings {
	public static void main(String[] args) {
		System.out.println(isIsomorphic("ab", "aa"));
	}

	public static boolean isIsomorphic(String s, String t) {
		HashMap<Character, Character> map = new HashMap<>();
		Set<Character> duplicate = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			char source = s.charAt(i);
			char target = t.charAt(i);
			if (map.containsKey(source)) {
				Character replaced = map.get(source);
				if (replaced == target) {
					continue;
				} else {
					return false;
				}
			} else {
				if (duplicate.contains(target)) {
					return false;
				}
				map.put(source, target);
				duplicate.add(target);
			}
		}
		return true;
	}
}
