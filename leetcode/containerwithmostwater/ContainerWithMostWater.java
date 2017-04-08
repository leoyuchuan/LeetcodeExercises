package com.leoyuchuan.leetcode.containerwithmostwater;

public class ContainerWithMostWater {
	// public int maxArea(int[] height) {
	// int maxArea = 0;
	// for (int i = 0; i < height.length; i++) {
	// for (int j = i + 1; j < height.length; j++) {
	// int tmpArea = (j - i) * Math.min(height[i], height[j]);
	// if (maxArea < tmpArea) {
	// maxArea = tmpArea;
	// }
	// }
	// }
	// return maxArea;
	// }
	public int maxArea(int[] height) {
		int left = 0, right = height.length - 1, maxArea = 0;
		while (left < right) {
			maxArea = Math.max(Math.min(height[left], height[right]) * (right - left), maxArea);
			if (height[left] <= height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return maxArea;
	}

}
