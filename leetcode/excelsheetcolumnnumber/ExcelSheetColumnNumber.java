package com.leoyuchuan.leetcode.excelsheetcolumnnumber;

public class ExcelSheetColumnNumber {
	public static void main(String[] args) {
		System.out.println(titleToNumber("BB") + "");
	}

	public static int titleToNumber(String s) {
		int sum = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			int num = (int) s.charAt(s.length() - 1 - i) - 64;
			sum += num * Math.pow(26, i);
		}

		return sum;
	}
}
