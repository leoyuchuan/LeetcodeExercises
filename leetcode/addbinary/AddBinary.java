package com.leoyuchuan.leetcode.addbinary;

public class AddBinary {
	public static void main(String[] args) {
		System.out.println(addBinary("1", "111"));
	}

	public static String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder();
		int max = Math.max(a.length(), b.length());
		while (a.length() < max) {
			a = "0" + a;
		}
		while (b.length() < max) {
			b = "0" + b;
		}
		boolean addOne = false;
		for (int i = max - 1; i >= 0; i--) {
			int va, vb;
			va = a.charAt(i) - '0';
			vb = b.charAt(i) - '0';

			int sum = va + vb;
			if (addOne)
				sum++;
			if (sum >= 2) {
				addOne = true;
				sum -= 2;
			} else {
				addOne = false;
			}
			sb.append(sum + "");
		}
		if (addOne) {
			sb.append("1");
		}
		return sb.reverse().toString();
	}
}
