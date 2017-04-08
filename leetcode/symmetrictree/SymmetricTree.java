package com.leoyuchuan.leetcode.symmetrictree;

public class SymmetricTree {
	public static boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return false;
		}
		return isMirror(root.left, root.right);
	}

	public static boolean isMirror(TreeNode left, TreeNode right) {
		if (left == null && right == null) {
			return true;
		}
		if (left == null && right != null) {
			return false;
		}
		if (left != null && right == null) {
			return false;
		}
		if (left.val != right.val) {
			return false;
		}
		boolean a1 = isMirror(left.left, right.right);
		boolean a2 = isMirror(left.right, right.left);
		return a1 && a2;
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