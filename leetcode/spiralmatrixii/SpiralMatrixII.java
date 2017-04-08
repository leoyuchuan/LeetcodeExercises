package com.leoyuchuan.leetcode.spiralmatrixii;

import java.util.Arrays;

public class SpiralMatrixII {
	public static int[][] generateMatrix(int n) {
		int[][] matrix = new int[n][n];
		int row = 0, col = 0;
		int direction = 0;
		for (int i = 0; i < n * n; i++) {
			matrix[row][col] = i + 1;
			if (direction == 0) {
				if (col + 1 >= n) {
					direction = changeDirection(direction);
				} else if (matrix[row][col + 1] != 0) {
					direction = changeDirection(direction);
				}
			} else if (direction == 1) {
				if (row + 1 >= n) {
					direction = changeDirection(direction);
				} else if (matrix[row + 1][col] != 0) {
					direction = changeDirection(direction);
				}
			} else if (direction == 2) {
				if (col - 1 < 0) {
					direction = changeDirection(direction);
				} else if (matrix[row][col - 1] != 0) {
					direction = changeDirection(direction);
				}
			} else if (direction == 3) {
				if (row - 1 < 0) {
					direction = changeDirection(direction);
				} else if (matrix[row - 1][col] != 0) {
					direction = changeDirection(direction);
				}
			}
			if (direction == 0) {
				col++;
			}
			if (direction == 1) {
				row++;
			}
			if (direction == 2) {
				col--;
			}
			if (direction == 3) {
				row--;
			}

		}
		return matrix;
	}

	/**
	 * 0 = right, 1 = down, 2 = left, 3 = up
	 * 
	 * @param current
	 * @return
	 */
	public static int changeDirection(int current) {
		return (current + 1) % 4;
	}

	public static void main(String[] args) {
		int[][] matrix = generateMatrix(10);
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}
}
