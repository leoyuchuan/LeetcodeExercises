package com.leoyuchuan.leetcode.rotateimage;

public class RotateImage {
	public void rotate(int[][] matrix) {
		int len = matrix.length;
		for (int j = 0; j < len / 2; j++) {
			for (int i = 0 + j; i < len - 1 - j; i++) {
				int tmp = matrix[j][i];
				matrix[j][i] = matrix[len - 1 - i][j];
				matrix[len - 1 - i][j] = matrix[len - 1 - j][len - 1 - i];
				matrix[len - 1 - j][len - 1 - i] = matrix[i][len - 1 - j];
				matrix[i][len - 1 - j] = tmp;
			}
		}
	}
}
