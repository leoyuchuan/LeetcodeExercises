package com.leoyuchuan.leetcode.jumpgame;

public class JumpGame {
	public static void main(String[] args) {
		System.out.println(canJump(new int[] { 4, 3, 2, 1, 0, 1 }));
	}

	// O(n^2)
	// public boolean canJump(int[] nums) {
	// if (nums.length == 0)
	// return true;
	// int[] reach = new int[nums.length];
	// reach[0] = 1;
	// for (int i = 0; i < nums.length - 1; i++) {
	// if (reach[i] == 0)
	// return false;
	// for (int j = i + 1; j <= i + nums[i] && j < nums.length; j++) {
	// reach[j] = 1;
	// }
	// }
	// return reach[reach.length - 1] == 1;
	// }

	// O(n);
	public static boolean canJump(int[] nums) {
		int jumpLength = 0;
		for (int i = nums.length - 2; i >= 0; i--) {
			jumpLength++;
			if (nums[i] >= jumpLength) {
				jumpLength = 0;
			}
		}
		return jumpLength == 0;
	}
}
