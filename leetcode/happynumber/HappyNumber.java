package com.leoyuchuan.leetcode.happynumber;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	public static void main(String[] args) {
		System.out.println(isHappy(17));
	}

	public static boolean isHappy(int n) {
		Set<Integer> repeatMonitor = new HashSet<>();
		while (n != 1) {
			if (repeatMonitor.contains(n))
				return false;
			else {
				repeatMonitor.add(n);
			}
			String str = n + "";
			n = 0;
			for (int i = 0; i < str.length(); i++) {
				int value = str.charAt(i) - 48;
				n += value * value;
			}
		}
		return true;
	}
}
