package com.leoyuchuan.leetcode.sametree;

public class SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null & q == null) {
			return true;
		}
		if (p == null)
			return false;
		if (q == null) {
			return false;
		}
		if (p.val != q.val)
			return false;
		if (!isSameTree(p.left, q.left))
			return false;
		if (!isSameTree(p.right, q.right))
			return false;
		return true;
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
