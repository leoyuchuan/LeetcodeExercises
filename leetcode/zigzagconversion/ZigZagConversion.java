package com.leoyuchuan.leetcode.zigzagconversion;

import java.util.ArrayList;

public class ZigZagConversion {
	public static void main(String[] args) {
		System.out.println(convert("A", 1));
	}

	public static String convert(String s, int numRows) {
		if (numRows <= 1) {
			return s;
		}
		ArrayList<StringBuilder> output = new ArrayList<StringBuilder>();
		for (int i = 0; i < numRows; i++) {
			output.add(new StringBuilder());
		}
		int index = 0;
		int direction = 1;
		while (true) {
			for (int j = 0; j < numRows - 1; j++) {
				if (index >= s.length()) {
					break;
				}
				if (direction == 1) {
					output.get(j).append(s.charAt(index++));
				} else {
					output.get(numRows - j - 1).append(s.charAt(index++));
				}
				if (j == numRows - 2)
					direction = 1 - direction;
			}
			if (index >= s.length()) {
				break;
			}
		}
		for (int i = 1; i < numRows; i++) {
			output.get(0).append(output.get(i).toString());
		}
		return output.get(0).toString();
	}
}
