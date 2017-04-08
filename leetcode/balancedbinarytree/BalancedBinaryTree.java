package com.leoyuchuan.leetcode.balancedbinarytree;

public class BalancedBinaryTree {
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		TreeNode t6 = new TreeNode(6);
		TreeNode t7 = new TreeNode(7);
		TreeNode t8 = new TreeNode(8);

		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t4.left = t7;
		t3.right = t6;
		t6.right = t8;

		System.out.println(isBalanced(t1));
	}

	public static boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;
		}
		boolean balancedLeft = isBalanced(root.left);
		boolean balancedRight = isBalanced(root.right);
		if (balancedLeft == false || balancedRight == false) {
			return false;
		}
		int depthLeft = depth(root.left);
		int depthRight = depth(root.right);
		if (Math.abs(depthLeft - depthRight) <= 1) {
			return true;
		} else {
			return false;
		}
	}

	private static int depth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}
		return Math.max(depth(root.left), depth(root.right)) + 1;
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