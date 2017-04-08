package com.leoyuchuan.leetcode.pascalstriangleii;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
	public static List<Integer> getRow(int rowIndex) {
		int[][] pascal = new int[rowIndex + 1][];
		for (int i = 0; i < rowIndex + 1; i++) {
			pascal[i] = new int[rowIndex / 2 + 1];
		}
		List<Integer> output = new ArrayList<>();
		for (int i = 0; i <= rowIndex / 2; i++) {
			output.add(backTracking(pascal, rowIndex, i));
		}
		for (int i = rowIndex / 2 + 1; i <= rowIndex; i++) {
			output.add(output.get(rowIndex - i));
		}
		return output;
	}

	public static int backTracking(int[][] pascal, int row, int index) {
		if (index == 0 || index == row) {
			pascal[row][index] = 1;
			return 1;
		} else if (pascal[row][index] != 0) {
			return pascal[row][index];
		} else {
			int m = backTracking(pascal, row - 1, index - 1)
					+ backTracking(pascal, row - 1, index);
			pascal[row][index] = m;
			return m;
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			List<Integer> output = getRow(i);
			System.out.println(output.toString());
		}
	}
}
