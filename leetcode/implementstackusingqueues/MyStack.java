package com.leoyuchuan.leetcode.implementstackusingqueues;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
	Queue<Integer> queue = new LinkedList<>();

	// Push element x onto stack.
	public void push(int x) {
		queue.add(x);
	}

	// Removes the element on top of the stack.
	public void pop() {
		int length = queue.size();
		for (int i = 0; i < length - 1; i++) {
			queue.add(queue.poll());
		}
		queue.poll();
	}

	// Get the top element.
	public int top() {
		int length = queue.size();
		for (int i = 0; i < length - 1; i++) {
			queue.add(queue.poll());
		}
		int top = queue.poll();
		queue.add(top);
		return top;
	}

	// Return whether the stack is empty.
	public boolean empty() {
		return queue.isEmpty();
	}
}