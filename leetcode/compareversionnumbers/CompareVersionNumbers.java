package com.leoyuchuan.leetcode.compareversionnumbers;

public class CompareVersionNumbers {
	public static void main(String[] args) {
		compareVersion("1.0", "1.1");
	}

	public static int compareVersion(String version1, String version2) {
		String[] s1, s2;
		if (version1.contains(".")) {
			s1 = version1.split("\\.");
		} else {
			s1 = new String[] { version1 };
		}
		if (version2.contains(".")) {
			s2 = version2.split("\\.");
		} else {
			s2 = new String[] { version2 };
		}
		int max = Math.max(s1.length, s2.length);
		for (int i = 0; i < max; i++) {
			int v1;
			if (i < s1.length)
				v1 = Integer.parseInt(s1[i]);
			else {
				v1 = 0;
			}
			int v2;
			if (i < s2.length) {
				v2 = Integer.parseInt(s2[i]);
			} else {
				v2 = 0;
			}
			if (v1 > v2) {
				return 1;
			}
			if (v1 < v2) {
				return -1;
			}
		}
		return 0;
	}
}
