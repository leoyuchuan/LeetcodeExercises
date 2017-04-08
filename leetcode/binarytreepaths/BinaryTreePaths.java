package com.leoyuchuan.leetcode.binarytreepaths;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
	public List<String> binaryTreePaths(TreeNode root) {
		ArrayList<String> paths = new ArrayList<>();
		if (root == null) {
			return paths;
		}
		if (root.left == null && root.right == null) {
			paths.add(root.val + "");
			return paths;
		}
		if (root.left == null) {
			paths.addAll(binaryTreePaths(root.right));
			for (int i = 0; i < paths.size(); i++) {
				paths.set(i, root.val + "->" + paths.get(i));
			}
			return paths;
		}
		if (root.right == null) {
			paths.addAll(binaryTreePaths(root.left));
			for (int i = 0; i < paths.size(); i++) {
				paths.set(i, root.val + "->" + paths.get(i));
			}
			return paths;
		}

		paths.addAll(binaryTreePaths(root.left));
		paths.addAll(binaryTreePaths(root.right));
		for (int i = 0; i < paths.size(); i++) {
			paths.set(i, root.val + "->" + paths.get(i));
		}
		return paths;
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