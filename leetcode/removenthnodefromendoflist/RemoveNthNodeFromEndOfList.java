package com.leoyuchuan.leetcode.removenthnodefromendoflist;

import java.util.LinkedList;
import java.util.Queue;

public class RemoveNthNodeFromEndOfList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null)
			return null;
		if (head.next == null && n >= 1)
			return null;
		Queue<ListNode> queue = new LinkedList<>();
		ListNode current = head;
		ListNode previous = null;
		while (current != null) {
			if (queue.size() >= n) {
				previous = queue.poll();
			}
			queue.add(current);
			current = current.next;
		}
		queue.poll();
		if (previous == null) {
			return queue.poll();
		} else {
			previous.next = queue.poll();
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