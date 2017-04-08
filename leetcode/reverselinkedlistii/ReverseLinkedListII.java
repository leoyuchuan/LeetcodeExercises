package com.leoyuchuan.leetcode.reverselinkedlistii;

public class ReverseLinkedListII {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		l1.next = l2;
		l2.next = l3;
		reverseBetween(l1, 1, 3);
	}

	public static ListNode reverseBetween(ListNode head, int m, int n) {
		if (m == n)
			return head;
		ListNode fakeHead = new ListNode(0);
		fakeHead.next = head;

		ListNode cur = head;
		ListNode pre = fakeHead;
		ListNode preNext = fakeHead.next;
		for (int i = 1; i < m; i++) {
			pre = pre.next;
			preNext = pre.next;
			cur = cur.next;
		}

		for (int i = 0; i < n - m; i++) {
			removeAndInsertAfter(pre, preNext, cur, cur.next);
			preNext = pre.next;
		}

		return fakeHead.next;
	}

	static ListNode removeAndInsertAfter(ListNode a1Pre, ListNode a1, ListNode a2Pre, ListNode a2) {
		a2Pre.next = a2.next;
		a1Pre.next = a2;
		a2.next = a1;
		return a1;
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