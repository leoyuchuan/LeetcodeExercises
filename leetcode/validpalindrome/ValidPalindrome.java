package com.leoyuchuan.leetcode.validpalindrome;

public class ValidPalindrome {
	public static boolean isPalindrome(String s) {
		int i = 0, j = s.length() - 1;
		while (i < j) {
			char f = s.substring(i, i + 1).toLowerCase().charAt(0);
			char e = s.substring(j, j + 1).toLowerCase().charAt(0);

			if (!((f >= '0' && f <= '9') || (f >= 'a' && f <= 'z'))) {
				i++;
				continue;
			}
			if (!((e >= '0' && e <= '9') || (e >= 'a' && e <= 'z'))) {
				j--;
				continue;
			}
			if (f != e)
				return false;
			else {
				i++;
				j--;
			}
		}
		return true;
	}
}
