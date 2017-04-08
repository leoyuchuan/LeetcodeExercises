package com.leoyuchuan.leetcode.pathsum;

public class PathSum {
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null)
			return false;
		return pathSum(root, sum);
	}

	private boolean pathSum(TreeNode root, int sum) {
		if (root == null) {
			return sum == 0;
		}
		int remain = sum - root.val;
		boolean a1 = false, a2 = false;
		if (root.left == null && root.right == null) {
			return remain == 0;
		}
		if (root.left == null) {
			a2 = pathSum(root.right, remain);
		}
		if (root.right == null) {
			a1 = pathSum(root.left, remain);
		}
		if (root.left != null && root.right != null) {
			a1 = pathSum(root.left, remain);
			a2 = pathSum(root.right, remain);
		}
		if (a1 || a2) {
			return true;
		}
		return false;
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}