package com.leoyuchuan.leetcode.spiralmatrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public static void main(String[] args) {
		System.out.println(spiralOrder(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }));
	}

	public static List<Integer> spiralOrder(int[][] matrix) {
		ArrayList<Integer> output = new ArrayList<>();
		if(matrix.length == 0) return output;
		int i = 0, j = 0;
		int direction = 1;
		int times = matrix.length * matrix[0].length;
		int rowLimit = matrix.length;
		int colLimit = matrix[0].length;
		int sizeDecrease = 0;
		while (times > 0) {
			output.add(matrix[i][j]);
			if (direction == 1) {
				if (j + 1 >= colLimit - sizeDecrease) {
					direction = 2;
					i++;
				} else {
					j++;
				}
			} else if (direction == 2) {
				if (i + 1 >= rowLimit - sizeDecrease) {
					direction = 3;
					j--;
				} else {
					i++;
				}
			} else if (direction == 3) {
				if (j - 1 < 0 + sizeDecrease) {
					direction = 4;
					sizeDecrease++;
					i--;
				} else {
					j--;
				}
			} else if (direction == 4) {
				if (i - 1 < 0 + sizeDecrease) {
					direction = 1;
					j++;
				} else {
					i--;
				}
			}
			times--;
		}

		return output;
	}
}
