package com.leoyuchuan.leetcode.jumpgameii;

public class JumpGameII {
	public static int jump(int[] nums) {
		int last = nums.length - 1;
		int steps = subMinJump(nums, last);

		return steps;
	}

	public static int subMinJump(int[] nums, int last) {
		if (last == 0)
			return 0;
		int substep = Integer.MAX_VALUE;
		for (int i = last; i >= 1; i--) {
			if (nums[last - i] >= i) {
				int tmp = subMinJump(nums, last - i) + 1;
				substep = Math.min(substep, tmp);
				return substep;
			}
		}
		return substep;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 5, 6, 4, 4, 6, 9, 4, 4, 7, 4, 4, 8, 2, 6, 8,
				1, 5, 9, 6, 5, 2, 7, 9, 7, 9, 6, 9, 4, 1, 6, 8, 8, 4, 4, 2, 0,
				3, 8, 5 };
		System.out.println(jump(nums) + "");

	}

}
