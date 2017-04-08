package com.leoyuchuan.leetcode.reverselinkedlist;

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		ListNode current = head;
		ListNode previous = null;
		while (current != null) {
			ListNode next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}

	// public ListNode reverseList(ListNode head) {
	// Stack<ListNode> stack = new Stack<>();
	// ListNode current = head;
	// while (current != null) {
	// stack.push(current);
	// current = current.next;
	// }
	//
	// boolean isFirst = true;
	// ListNode previous = null;
	// while (!stack.isEmpty()) {
	// ListNode pop = stack.pop();
	// if (isFirst) {
	// head = pop;
	// isFirst = false;
	// previous = head;
	// continue;
	// }
	// previous.next = pop;
	// previous = pop;
	// }
	// return head;
	// }
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}