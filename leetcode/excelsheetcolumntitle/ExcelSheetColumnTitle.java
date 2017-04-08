package com.leoyuchuan.leetcode.excelsheetcolumntitle;

public class ExcelSheetColumnTitle {
	public static String convertToTitle(int n) {
		String output = "";
		int remaining = n - 1;
		while (remaining >= 0) {
			int value = remaining % 26;
			output = ((char) (value + 65)) + output;
			remaining = remaining / 26 - 1;
		}
		return output;
	}

	public static void main(String[] args) {
		System.out.println(convertToTitle(996));
		System.out.println(((char) 90) + "");
	}
}
