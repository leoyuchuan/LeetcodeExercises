package com.leoyuchuan.leetcode.removeduplicatesfromsortedlist;

public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(1);
		n1.next = n2;
		n1 = deleteDuplicates(n1);
		System.out.println("pause");
	}

	public static ListNode deleteDuplicates(ListNode head) {
		ListNode current = head;
		ListNode previous = null;
		while (current != null) {
			if (previous == null) {
				previous = current;
				current = current.next;
				continue;
			}
			if (previous.val == current.val) {
				previous.next = current.next;
			} else {
				previous = current;
			}
			current = current.next;
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

	@Override
	public String toString() {
		return val + "";
	}
}