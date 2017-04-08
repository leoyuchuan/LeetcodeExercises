package com.leoyuchuan.leetcode.rangesumquery2dimmutable;

public class RangeSumQuery2DImmutable {
	public static void main(String[] args) {
		NumMatrix numMatrix = new NumMatrix(new int[][] { { 1 }, { -7 } });
		System.out.println(numMatrix.sumRegion(0, 0, 0, 0));
		System.out.println(numMatrix.sumRegion(1, 0, 1, 0));
		System.out.println(numMatrix.sumRegion(0, 0, 1, 0));
	}
}

class NumMatrix {

	double[][] sumMatrix;

	public NumMatrix(int[][] matrix) {
		if (matrix.length == 0) {
			sumMatrix = new double[0][0];
			return;
		}
		sumMatrix = new double[matrix.length][matrix[0].length];
		for (int row = 0; row < sumMatrix.length; row++) {
			for (int col = 0; col < sumMatrix[0].length; col++) {
				if (col == 0 && row == 0) {
					sumMatrix[row][col] = matrix[row][col];
				} else if (col == 0) {
					sumMatrix[row][col] = matrix[row][col] + sumMatrix[row - 1][col];
				} else if (row == 0) {
					sumMatrix[row][col] = matrix[row][col] + sumMatrix[row][col - 1];
				} else {
					sumMatrix[row][col] = matrix[row][col] + sumMatrix[row - 1][col] + sumMatrix[row][col - 1]
							- sumMatrix[row - 1][col - 1];
				}
			}
		}
	}

	public int sumRegion(int row1, int col1, int row2, int col2) {
		if (sumMatrix.length == 0)
			return 0;
		if (row1 == 0 && col1 == 0) {
			return (int) sumMatrix[row2][col2];
		}
		if (row1 == 0) {
			return (int) (sumMatrix[row2][col2] - sumMatrix[row2][col1 - 1]);
		}
		if (col1 == 0) {
			return (int) (sumMatrix[row2][col2] - sumMatrix[row1 - 1][col2]);
		}
		return (int) (sumMatrix[row2][col2] - sumMatrix[row2][col1 - 1] - sumMatrix[row1 - 1][col2]
				+ sumMatrix[row1 - 1][col1 - 1]);

	}
}