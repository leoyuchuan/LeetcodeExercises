package com.leoyuchuan.leetcode.removelinkedlistelements;

public class RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {
		ListNode current = head;
		ListNode previous = null;
		while (current != null) {
			if (current == head && current.val == val) {
				head = current.next;
				current = current.next;
				continue;
			}
			if (current.next == null && current.val == val) {
				previous.next = null;
				current = current.next;
				continue;
			}
			if (current.val == val) {
				previous.next = current.next;
				current = current.next;
				continue;
			} else {
				previous = current;
				current = current.next;
				continue;
			}
		}
		return head;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}