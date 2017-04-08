package com.leoyuchuan.leetcode.lowestcommonancestorofabinarysearchtree;

public class LowestCommonAncestorOfABinarySearchTree {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null) {
			return null;
		}
		if (p == null && q == null) {
			return root;
		}
		if (p == null) {
			return q;
		}
		if (q == null) {
			return p;
		}

		int pBelonging = checkBranch(root, p);
		int qBelonging = checkBranch(root, q);

		if (pBelonging == 0 || qBelonging == 0) {
			return root;
		}
		if (pBelonging != qBelonging) {
			return root;
		}
		if (pBelonging == 1) {
			return lowestCommonAncestor(root.left, p, q);
		}
		if (pBelonging == 2) {
			return lowestCommonAncestor(root.right, p, q);
		}

		return root;
	}

	private int checkBranch(TreeNode root, TreeNode q) {
		if (root == null) {
			return -1;
		}
		if (root == q) {
			return 0;
		}

		int isInLeft = checkBranch(root.left, q);
		if (isInLeft >= 0) {
			return 1;
		}

		int isInRight = checkBranch(root.right, q);
		if (isInRight >= 0) {
			return 2;
		}

		return -1;
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