package com.leoyuchuan.leetcode.deletenodeinalinkedlist;

public class DeleteNodeInALinkedList {
	public static void deleteNode(ListNode node) {
		node.val = node.next.val;
		if (node.next.next != null) {
			node.next = node.next.next;
		} else
			node.next = null;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
