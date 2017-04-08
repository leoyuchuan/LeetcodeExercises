package com.leoyuchuan.leetcode.minimumpathsum;

public class MinimumPathSum {
	public int minPathSum(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		int[][] array = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 && j == 0) {
					array[i][j] = grid[0][0];
				} else if (i == 0 && j > 0) {
					array[i][j] = array[i][j - 1] + grid[i][j];
				} else if (i > 0 && j == 0) {
					array[i][j] = array[i - 1][j] + grid[i][j];
				} else {
					array[i][j] = Math.min(array[i - 1][j], array[i][j - 1]) + grid[i][j];
				}
			}
		}
		return array[m - 1][n - 1];
	}
}
