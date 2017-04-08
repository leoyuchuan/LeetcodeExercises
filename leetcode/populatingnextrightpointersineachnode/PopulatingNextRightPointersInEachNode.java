package com.leoyuchuan.leetcode.populatingnextrightpointersineachnode;

public class PopulatingNextRightPointersInEachNode {
	public static void main(String[] args) {
		PopulatingNextRightPointersInEachNode test = new PopulatingNextRightPointersInEachNode();
		TreeLinkNode t1 = new TreeLinkNode(1);
		TreeLinkNode t2 = new TreeLinkNode(2);
		TreeLinkNode t3 = new TreeLinkNode(3);
		TreeLinkNode t4 = new TreeLinkNode(4);
		TreeLinkNode t5 = new TreeLinkNode(5);
		TreeLinkNode t6 = new TreeLinkNode(6);
		TreeLinkNode t7 = new TreeLinkNode(7);
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.left = t6;
		t3.right = t7;
		test.connect(t1);
	}

	public void connect(TreeLinkNode root) {
		if (root == null) {
			return;
		}
		connect(root, null);
	}

	public void connect(TreeLinkNode root, TreeLinkNode right) {
		root.next = right;
		if (root.left == null) {
			return;
		}
		connect(root.left, root.right);
		connect(root.right, right == null ? null : right.left);
	}
}

class TreeLinkNode {
	int val;
	TreeLinkNode left, right, next;

	TreeLinkNode(int x) {
		val = x;
	}

	@Override
	public String toString() {
		return val + "";
	}
}