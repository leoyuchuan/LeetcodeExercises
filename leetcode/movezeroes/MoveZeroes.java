package com.leoyuchuan.leetcode.movezeroes;

public class MoveZeroes {
	
	
	public void moveZeroes(int[] nums) {
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				int tmp = nums[i];
				nums[i] = 0;
				nums[index] = tmp;
				index++;
			}
		}
	}
}
