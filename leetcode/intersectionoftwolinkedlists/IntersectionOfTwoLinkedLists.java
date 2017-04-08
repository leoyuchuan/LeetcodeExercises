package com.leoyuchuan.leetcode.intersectionoftwolinkedlists;

public class IntersectionOfTwoLinkedLists {
	// public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	// ListNode pointerA = headA;
	// ListNode intersection = null;
	// while (pointerA != null) {
	// ListNode pointerB = headB;
	// if (pointerB == null) {
	// break;
	// }
	// while (pointerB != null) {
	// if (pointerA == pointerB) {
	// intersection = pointerA;
	// break;
	// }
	// pointerB = pointerB.next;
	// }
	// if (intersection != null) {
	// break;
	// }
	// pointerA = pointerA.next;
	// }
	// return intersection;
	// }

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int lengthA = 0, lengthB = 0;
		ListNode current = headA;
		while (current != null) {
			lengthA++;
			current = current.next;
		}
		current = headB;
		while (current != null) {
			lengthB++;
			current = current.next;
		}
		if (lengthA == 0 || lengthB == 0) {
			return null;
		}

		ListNode pointerA = headA;
		ListNode pointerB = headB;

		if (lengthA < lengthB) {
			int len = lengthB - lengthA;
			for (int i = 0; i < len; i++) {
				pointerB = pointerB.next;
			}
		}
		if (lengthA > lengthB) {
			int len = lengthA - lengthB;
			for (int i = 0; i < len; i++) {
				pointerA = pointerA.next;
			}
		}
		while (pointerA != null) {
			if (pointerA == pointerB) {
				return pointerA;
			}
			pointerA = pointerA.next;
			pointerB = pointerB.next;
		}
		return null;
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