package com.leoyuchuan.leetcode.rotatelist;

public class RotateList {
	public ListNode rotateRight(ListNode head, int k) {
		if (head == null)
			return null;
		DLinkedList dhead = new DLinkedList(null);
		DLinkedList dtail = new DLinkedList(null);
		dhead.post = dtail;
		dtail.pre = dhead;

		int size = 0;
		ListNode cur = head;
		while (cur != null) {
			DLinkedList tmp = new DLinkedList(cur);
			DLinkedList.addBefore(dtail, tmp);
			cur = cur.next;
			size++;
		}

		k = k % size;

		for (int i = 0; i < k; i++) {
			DLinkedList pre = dtail.pre;
			DLinkedList.moveToHead(dhead, pre);
		}

		DLinkedList curNode = dhead.post;
		head = curNode.value;
		cur = head;
		while (curNode != dtail) {
			cur.next = curNode.post.value;
			curNode = curNode.post;
			cur = cur.next;
		}
		return head;
	}
}

class DLinkedList {
	public ListNode value;
	public DLinkedList pre, post;

	public DLinkedList(ListNode node) {
		value = node;
		pre = null;
		post = null;
	}

	static void addAfter(DLinkedList head, DLinkedList node) {
		DLinkedList headpost = head.post;
		head.post = node;
		node.pre = head;
		node.post = headpost;
		headpost.pre = node;
	}

	static void addBefore(DLinkedList tail, DLinkedList node) {
		DLinkedList tailpre = tail.pre;
		tail.pre = node;
		node.pre = tailpre;
		node.post = tail;
		tailpre.post = node;
	}

	static void moveToHead(DLinkedList head, DLinkedList node) {
		DLinkedList pre2 = node.pre;
		DLinkedList post2 = node.post;
		pre2.post = post2;
		post2.pre = pre2;
		addAfter(head, node);
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}