package com.leoyuchuan.leetcode.linkedlistcycle;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
	// public boolean hasCycle(ListNode head) {
	// Set<ListNode> set = new HashSet<>();
	// ListNode current = head;
	// while (current != null) {
	// if (set.contains(current)) {
	// return true;
	// }
	// set.add(current);
	// current = current.next;
	// }
	// return false;
	// }

	public boolean hasCycle(ListNode head) {
		Set<ListNode> set = new HashSet<>();
		ListNode current = head;
		while (current != null) {
			if (set.contains(current)) {
				return true;
			}
			set.add(current);
			current = current.next;
		}
		return false;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}