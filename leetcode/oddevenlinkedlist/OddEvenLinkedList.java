package com.leoyuchuan.leetcode.oddevenlinkedlist;

public class OddEvenLinkedList {
	public ListNode oddEvenList(ListNode head) {
		ListNode odd = head;
		if (odd == null || head.next == null) {
			return head;
		}
		ListNode even = head.next;

		ListNode cur = even.next;
		ListNode curOdd = odd;
		ListNode curEven = even;
		int index = 0;
		while (cur != null) {
			if (index == 0) {
				curOdd.next = cur;
				curOdd = curOdd.next;
			} else {
				curEven.next = cur;
				curEven = curEven.next;
			}
			cur = cur.next;
			index = (index + 1) % 2;
		}
		curOdd.next = even;
		curEven.next = null;
		return odd;

	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}