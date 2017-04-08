package com.leoyuchuan.leetcode.countandsay;

public class CountAndSay {
	public static void main(String[] args) {
		System.out.println(countAndSay(5));
	}

	public static String countAndSay(int n) {
		if (n == 1) {
			return "1";
		}
		return cas(1 + "", 1, n - 1);
	}

	public static String cas(String n, int level, int target) {
		StringBuilder sb = new StringBuilder();
		char current = n.charAt(0);
		int length = 1;
		for (int i = 1; i < n.length(); i++) {
			char c = n.charAt(i);
			if (c == current) {
				length++;
			} else {
				sb.append(length + "" + current);
				current = c;
				length = 1;
			}
		}
		sb.append(length + "" + current);
		if (level == target)
			return sb.toString();
		else
			return cas(sb.toString(), level + 1, target);
	}
}
