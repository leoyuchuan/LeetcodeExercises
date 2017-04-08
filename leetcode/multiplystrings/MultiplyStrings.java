package com.leoyuchuan.leetcode.multiplystrings;

public class MultiplyStrings {
	public static void main(String[] args) {
		System.out.println(combineTwoNumber("9999", "1234"));
		System.out.println(multiplyByUnit("9999", 8));
		System.out.println(multiply("123", "123"));
	}

	public static String multiply(String num1, String num2) {
		if (num1.equals("0") || num2.equals("0")) {
			return "0";
		}
		String output = "";
		for (int i = num1.length() - 1; i >= 0; i--) {
			int va = num1.charAt(i) - '0';
			String product = multiplyByUnit(num2, va);
			for (int j = i + 1; j < num1.length(); j++) {
				product = product + "0";
			}
			output = combineTwoNumber(output, product);
		}
		return output;
	}

	static String multiplyByUnit(String a, int unit) {
		String output = "";
		int promt = 0;
		for (int i = a.length() - 1; i >= 0; i--) {
			int va = a.charAt(i) - '0';
			int sum = va * unit + promt;
			promt = sum / 10;
			sum -= promt * 10;
			output = sum + output;
		}
		if (promt > 0) {
			output = promt + output;
		}
		return output;
	}

	static String combineTwoNumber(String a, String b) {
		int i = a.length() - 1;
		int j = b.length() - 1;
		String output = "";
		boolean addOne = false;
		while (i >= 0 || j >= 0) {
			int sum = 0;
			if (i >= 0 && j >= 0) {
				int va = a.charAt(i) - '0';
				int vb = b.charAt(j) - '0';
				sum = va + vb;
			} else if (i >= 0 && j < 0) {
				int va = a.charAt(i) - '0';
				sum = va;
			} else if (i < 0 && j >= 0) {
				int vb = b.charAt(j) - '0';
				sum = vb;
			}

			if (addOne) {
				sum++;
				addOne = false;
			}
			if (sum >= 10) {
				addOne = true;
				sum -= 10;
			}
			output = sum + output;

			i--;
			j--;
		}
		if (addOne) {
			output = "1" + output;
		}
		return output;
	}
}
