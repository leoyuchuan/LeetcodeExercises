package com.leoyuchuan.leetcode.triangle;

import java.util.List;

public class Triangle {
	public static int minimumTotal(List<List<Integer>> triangle) {
		return backTracking(triangle, 0)[0];
	}

	public static Integer[] backTracking(List<List<Integer>> triangle, int row) {
		if (row == triangle.size() - 1)
			return triangle.get(row).toArray(new Integer[0]);

		Integer[] subMin = backTracking(triangle, row + 1);
		Integer[] currentMin = triangle.get(row).toArray(new Integer[0]);
		for (int i = 0; i < currentMin.length; i++) {
			currentMin[i] = currentMin[i] + Math.min(subMin[i], subMin[i + 1]);
		}
		return currentMin;
	}
}
