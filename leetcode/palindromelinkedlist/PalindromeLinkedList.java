package com.leoyuchuan.leetcode.palindromelinkedlist;

public class PalindromeLinkedList {
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(2);
		ListNode n4 = new ListNode(1);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;

		System.out.println(isPalindrome(n1));
	}

	public static boolean isPalindrome(ListNode head) {
		ListNode current = head;
		int num = 0;
		while (current != null) {
			num++;
			current = current.next;
		}
		if (num <= 1) {
			return true;
		}
		if (num == 2) {
			return head.val == head.next.val;
		}
		if (num % 2 == 0) {
			ListNode part1 = null, part2 = null;
			int index = num / 2 - 1;
			current = head;
			ListNode previous = null;
			for (int i = 0; i <= index; i++) {
				ListNode next = current.next;
				current.next = previous;
				previous = current;
				current = next;
			}
			part1 = previous;
			part2 = current;
			while (part1 != null && part2 != null) {
				if (part1.val != part2.val) {
					return false;
				}
				part1 = part1.next;
				part2 = part2.next;
			}
		} else {
			ListNode part1 = null, part2 = null;
			int index = num / 2 - 1;
			current = head;
			ListNode previous = null;
			for (int i = 0; i <= index; i++) {
				ListNode next = current.next;
				current.next = previous;
				previous = current;
				current = next;
			}
			part1 = previous;
			part2 = current.next;
			while (part1 != null && part2 != null) {
				if (part1.val != part2.val) {
					return false;
				}
				part1 = part1.next;
				part2 = part2.next;
			}
		}

		return true;
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