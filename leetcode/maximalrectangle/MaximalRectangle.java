package com.leoyuchuan.leetcode.maximalrectangle;

public class MaximalRectangle {
	public static void main(String[] args) {
		char[][] a = new char[][] { { '1', '0', '1', '0', }, { '1', '0', '1', '1' }, { '1', '0', '1', '1' },
				{ '1', '1', '1', '1', } };
		System.out.println(maximalRectangle(a) + "");
	}

	public static int maximalRectangle(char[][] matrix) {
		if (matrix.length == 0) {
			return 0;
		}
		int maxArea = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				if (matrix[row][col] == '1') {
					int tmpArea = clacMaxArea(row, col, matrix);
					if (tmpArea > maxArea) {
						maxArea = tmpArea;
					}
				}
			}
		}
		return maxArea;
	}

	private static int clacMaxArea(int row, int col, char[][] matrix) {
		int height = 0;
		int maxArea = 0;
		for (int i = row; i < matrix.length; i++) {
			if (matrix[i][col] == '1') {
				height++;
			} else {
				break;
			}
		}
		maxArea = height;
		for (int k = height; k > 0; k--) {
			for (int i = col + 1; i < matrix[0].length; i++) {
				boolean notOnlyOnes = false;
				for (int j = row; j < row + k; j++) {
					if (matrix[j][i] != '1') {
						int tmpArea = (i - col) * k;
						if (tmpArea > maxArea) {
							maxArea = tmpArea;
						}
						notOnlyOnes = true;
						break;
					}
					if (j == matrix.length - 1) {
						int tmpArea = (i - col + 1) * k;
						if (tmpArea > maxArea) {
							maxArea = tmpArea;
						}
					}
				}
				if (notOnlyOnes) {
					break;
				}
				if (i == matrix[0].length - 1) {
					int tmpArea = (i - col + 1) * k;
					if (tmpArea > maxArea) {
						maxArea = tmpArea;
					}
				}

			}
		}
		return maxArea;
	}
}
