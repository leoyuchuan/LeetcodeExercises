package com.leoyuchuan.leetcode.validatebinarysearchtree;

public class ValidateBinarySearchTree {
	public boolean isValidBST(TreeNode root) {
		if (root == null)
			return true;
		boolean rootLessThan = rootLessThan(root.left, root.val);
		boolean rootGreaterThan = rootGreaterThan(root.right, root.val);
		if (rootLessThan && rootGreaterThan) {
			return isValidBST(root.left) && isValidBST(root.right);
		} else {
			return false;
		}
	}

	public boolean rootLessThan(TreeNode root, int value) {
		if (root == null) {
			return true;
		}
		if (root.val < value) {
			boolean compareToRoot = rootLessThan(root.left, value);
			boolean compareToRoot2 = rootLessThan(root.right, value);
			return compareToRoot && compareToRoot2;
		} else {
			return false;
		}
	}

	public boolean rootGreaterThan(TreeNode root, int value) {
		if (root == null) {
			return true;
		}
		if (root.val > value) {
			boolean compareToRoot = rootGreaterThan(root.left, value);
			boolean compareToRoot2 = rootGreaterThan(root.right, value);
			return compareToRoot && compareToRoot2;
		} else {
			return false;
		}
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