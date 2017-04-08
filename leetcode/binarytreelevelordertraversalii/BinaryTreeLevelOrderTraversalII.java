package com.leoyuchuan.leetcode.binarytreelevelordertraversalii;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversalII {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> output = new ArrayList<List<Integer>>();
		int depth = getDepth(root);
		for (int i = 0; i < depth; i++) {
			output.add(new ArrayList<Integer>());
		}
		traverse(root, output, 0);
		return output;
	}

	private void traverse(TreeNode root, List<List<Integer>> output, int i) {
		if (root == null) {
			return;
		}
		int depth = output.size();
		output.get(depth - 1 - i).add(root.val);
		traverse(root.left, output, i + 1);
		traverse(root.right, output, i + 1);
	}

	private int getDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}
		return Math.max(getDepth(root.left), getDepth(root.right)) + 1;
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