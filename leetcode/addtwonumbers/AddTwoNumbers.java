package com.leoyuchuan.leetcode.addtwonumbers;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode currentA = l1;
		ListNode currentB = l2;
		ListNode currentOutput = null;
		boolean addDigit = false;
		while (currentA != null || currentB != null || addDigit == true) {
			if (currentOutput == null) {
				currentOutput = head;
			} else {
				currentOutput.next = new ListNode(0);
				currentOutput = currentOutput.next;
			}
			int valueA = 0, valueB = 0;
			if (currentA != null) {
				valueA = currentA.val;
				currentA = currentA.next;
			}
			if (currentB != null) {
				valueB = currentB.val;
				currentB = currentB.next;
			}
			int sum = valueA + valueB;
			if (addDigit) {
				sum += 1;
			}
			if (sum >= 10) {
				sum -= 10;
				addDigit = true;
			} else {
				addDigit = false;
			}
			currentOutput.val = sum;
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