package com.leoyuchuan.leetcode.mergeksortedlists;

public class MergeKSortedLists {
	public static void main(String[] args) {
		ListNode n11 = new ListNode(1);
		ListNode n12 = new ListNode(2);
		ListNode n13 = new ListNode(2);
		ListNode n21 = new ListNode(1);
		ListNode n22 = new ListNode(1);
		ListNode n23 = new ListNode(2);
		n11.next = n12;
		n12.next = n13;
		n21.next = n22;
		n22.next = n23;

		mergeKLists(new ListNode[] { n11, n21 });

	}

	public static ListNode mergeKLists(ListNode[] lists) {
		if (lists.length == 0) {
			return null;
		}
		if (lists.length == 1) {
			return lists[0];
		}
		for (int j = 0; j < lists.length - 1; j++) {
			ListNode outputHead = null, output = null;
			while (true) {
				int min = Integer.MAX_VALUE;
				int minIndex = -1;
				for (int i = 0 + j; i < 2 + j; i++) {
					ListNode listNode = lists[i];
					if (listNode == null) {
						continue;
					} else {
						if (min > listNode.val) {
							min = listNode.val;
							minIndex = i;
						}
					}
				}
				if (minIndex == -1) {
					break;
				} else {
					if (outputHead == null) {
						outputHead = lists[minIndex];
						output = outputHead;
					} else {
						output.next = lists[minIndex];
						output = output.next;
					}
					lists[minIndex] = lists[minIndex].next;
				}
			}
			lists[j + 1] = outputHead;
		}
		return lists[lists.length - 1];
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