package com.leoyuchuan.leetcode.invertbinarytree;

public class InvertBinaryTree {
	public static TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null;
		}

		if (root.left == null && root.right == null) {
			return root;
		}

		if (root.left == null) {
			root.left = root.right;
			root.right = null;
			invertTree(root.left);
			return root;
		}

		if (root.right == null) {
			root.right = root.left;
			root.left = null;
			invertTree(root.right);
			return root;
		}

		TreeNode tmp = root.left;
		root.left = root.right;
		root.right = tmp;

		invertTree(root.left);
		invertTree(root.right);

		return root;
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
