package com.leoyuchuan.leetcode.swapnodesinpairs;

public class SwapNodesInPairs {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		// ListNode node5 = new ListNode(5);

		head.next = node2;
		node2.next = node3;
		node3.next = node4;
		// node4.next = node5;

		swapPairs(head);
		System.out.printf("pause");
	}

	public static ListNode swapPairs(ListNode head) {
		ListNode current = head;
		ListNode nodeBeforeSwapCandidate1 = head;
		while (current != null) {
			ListNode swapCandidate1 = current;
			ListNode swapCandidate2 = current.next;
			if (swapCandidate2 == null) {
				break;
			}

			if (swapCandidate1 == head) {
				head = swapCandidate2;
			} else {
				nodeBeforeSwapCandidate1.next = swapCandidate2;
			}

			ListNode nextCurrent = swapCandidate2.next;

			swapCandidate2.next = swapCandidate1;
			swapCandidate1.next = nextCurrent;
			nodeBeforeSwapCandidate1 = swapCandidate1;
			current = nextCurrent;

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
		return "Current: " + val;
	}
}