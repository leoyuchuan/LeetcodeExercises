package com.leoyuchuan.leetcode.searcha2dmatrix;

public class SearchA2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
		int rowNum = matrix.length;
		if (rowNum == 0) {
			return false;
		}
		int colNum = matrix[0].length;
		if (colNum == 0) {
			return false;
		}
		for (int i = 0; i < rowNum - 1; i++) {
			if (matrix[i][0] <= target && matrix[i + 1][0] > target) {
				for (int j = 0; j < colNum; j++) {
					if (matrix[i][j] == target) {
						return true;
					} else {
						if (j == colNum - 1) {
							return false;
						}
					}
				}
			}
		}
		for (int j = 0; j < colNum; j++) {
			if (matrix[rowNum - 1][j] == target) {
				return true;
			}
		}
		return false;
	}
}
