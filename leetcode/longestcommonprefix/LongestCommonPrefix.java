package com.leoyuchuan.leetcode.longestcommonprefix;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		String common = "";
		if (strs.length == 0) {
			return common;
		}
		for (int j = 0;; j++) {
			char current = ' ';
			for (int i = 0; i < strs.length; i++) {
				String str = strs[i];
				if (j >= str.length()) {
					return common;
				}

				char c = str.charAt(j);
				if (i == 0 && i == strs.length - 1) {
					return str;
				} else if (i == 0) {
					current = c;
				} else if (i == strs.length - 1) {
					if (current == c) {
						common += c;
					} else {
						return common;
					}
				} else {
					if (current != c) {
						return common;
					}
				}
			}
		}
	}

}
