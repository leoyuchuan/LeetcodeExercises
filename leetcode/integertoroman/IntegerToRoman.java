package com.leoyuchuan.leetcode.integertoroman;

public class IntegerToRoman {
	public static void main(String[] args) {
		System.out.println(intToRoman(3399));
	}

	public static String intToRoman(int num) {
		int[] units = new int[] { 1000, 500, 100, 50, 10, 5, 1 };
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < units.length; i++) {
			if (num == 0) {
				break;
			}
			if (num - units[i] >= 0) {
				num -= units[i];
				sb.append(intUnitToRoman(units[i]));
				i--;
			} else {
				if (units[i + 1] == 1000 || units[i + 1] == 100 || units[i + 1] == 10 || units[i + 1] == 1) {
					if (num / units[i + 1] == 4) {
						num -= 4 * units[i + 1];
						sb.append(intUnitToRoman(units[i + 1]));
						sb.append(intUnitToRoman(units[i]));
					}
				} else {
					if (num / units[i + 2] == 9) {
						num -= 9 * units[i + 2];
						sb.append(intUnitToRoman(units[i + 2]));
						sb.append(intUnitToRoman(units[i]));
					}
				}
			}
		}
		return sb.toString();
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

	static char intUnitToRoman(int unit) {
		if (unit == 1)
			return 'I';
		else if (unit == 5)
			return 'V';
		else if (unit == 10)
			return 'X';
		else if (unit == 50)
			return 'L';
		else if (unit == 100)
			return 'C';
		else if (unit == 500)
			return 'D';
		else if (unit == 1000)
			return 'M';
		else
			return ' ';
	}
}
