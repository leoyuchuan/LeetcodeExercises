package com.leoyuchuan.leetcode.longestpalindromicsubstring;

public class LongestPalindromicSubstring {
	public static String longestPalindrome(String s) {
		int max = 0;
		String longest = "";
		for (int i = 0; i < s.length(); i++) {
			String tmp = findPalindromic(s, i, true);
			if (tmp.length() >= max) {
				max = tmp.length();
				longest = tmp;
			}
			tmp = findPalindromic(s, i, false);
			if (tmp.length() >= max) {
				max = tmp.length();
				longest = tmp;
			}
		}
		return longest;
	}

	public static String findPalindromic(String s, int index, boolean isOdd) {
		if (isOdd) {
			int m = 1;
			while (index - m >= 0 && index + m < s.length()
					&& s.charAt(index - m) == s.charAt(index + m))
				m++;
			return s.substring(index - m + 1, index + m);
		} else {
			int m = 0;
			while (index + 1 + m < s.length() && index - m >= 0
					&& s.charAt(index - m) == s.charAt(index + 1 + m)) {
				m++;
			}
			return s.substring(index - m + 1, index + m + 1);
		}
	}
}
