package com.leoyuchuan.leetcode.binarytreelevelordertraversal;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
		ArrayList<List<Integer>> output = new ArrayList<>();
		traverse(root, output, 0);
		return output;
	}

	private void traverse(TreeNode root, ArrayList<List<Integer>> output, int level) {
		if (root == null) {
			return;
		}
		if (output.size() <= level) {
			output.add(new ArrayList<Integer>());
		}
		output.get(level).add(root.val);
		traverse(root.left, output, level + 1);
		traverse(root.right, output, level + 1);
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
