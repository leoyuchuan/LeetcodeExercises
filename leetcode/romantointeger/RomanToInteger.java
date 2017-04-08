package com.leoyuchuan.leetcode.romantointeger;

public class RomanToInteger {
	public static void main(String[] args) {
		System.out.println("" + romanToInt("MMMID"));
	}

	public static int romanToInt(String s) {
		int length = s.length();
		int sum = 0;
		for (int i = 0; i < length; i++) {
			if (i == length - 1) {
				sum += romanUnitToInt(s.charAt(i));
			} else {
				int current = romanUnitToInt(s.charAt(i));
				int next = romanUnitToInt(s.charAt(i + 1));
				if (current < next) {
					sum += (next - current);
					i += 1;
				} else {
					sum += current;
				}
			}

		}
		return sum;
	}

	public static int romanUnitToInt(char unit) {
		if (unit == 'I')
			return 1;
		else if (unit == 'V')
			return 5;
		else if (unit == 'X')
			return 10;
		else if (unit == 'L')
			return 50;
		else if (unit == 'C')
			return 100;
		else if (unit == 'D')
			return 500;
		else if (unit == 'M')
			return 1000;
		else
			return 0;
	}
}
