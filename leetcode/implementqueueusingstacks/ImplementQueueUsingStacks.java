package com.leoyuchuan.leetcode.implementqueueusingstacks;

import java.util.Stack;

public class ImplementQueueUsingStacks {

}

class MyQueue {
	Stack<Integer> stackMain = new Stack<>();

	// Push element x to the back of queue.
	public void push(int x) {
		Stack<Integer> stackSpare = new Stack<>();
		while (!stackMain.isEmpty()) {
			stackSpare.push(stackMain.pop());
		}
		stackMain.push(x);
		while (!stackSpare.isEmpty()) {
			stackMain.push(stackSpare.pop());
		}
	}

	// Removes the element from in front of queue.
	public void pop() {
		stackMain.pop();
	}

	// Get the front element.
	public int peek() {
		return stackMain.peek();
	}

	// Return whether the queue is empty.
	public boolean empty() {
		return stackMain.isEmpty();
	}
}
