package com.leoyuchuan.leetcode.longestsubstringwithoutrepeatingcharacters;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("dvdf"));
	}

	// public static int lengthOfLongestSubstring(String s) {
	// Set<Character> set = new HashSet<>();
	// int maxLength = 0, tmpLength = 0;
	// for (int i = 0; i < s.length(); i++) {
	// char charAt = s.charAt(i);
	// if (set.contains(charAt)) {
	// maxLength = Math.max(maxLength, tmpLength);
	// set.clear();
	// i -= tmpLength;
	// tmpLength = 0;
	// } else {
	// tmpLength++;
	// set.add(charAt);
	// }
	// }
	// maxLength = Math.max(maxLength, tmpLength);
	// return maxLength;
	// }
	
	public static int lengthOfLongestSubstring(String s) {
	    int i = 0, j = 0, max = 0;
	    Set<Character> set = new HashSet<>();

	    while (j < s.length()) {
	        if (!set.contains(s.charAt(j))) {
	            set.add(s.charAt(j++));
	            max = Math.max(max, set.size());
	        } else {
	            set.remove(s.charAt(i++));
	        }
	    }

	    return max;
	}
}
