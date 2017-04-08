package com.leoyuchuan.leetcode.minstack;

import java.util.Stack;

public class MinStack {

	Stack<Integer> minStack;
	Stack<Integer> stack;
	int min;

	/** initialize your data structure here. */
	public MinStack() {
		minStack = new Stack<>();
		stack = new Stack<>();
		min = Integer.MAX_VALUE;
	}

	public void push(int x) {
		stack.push(x);
		min = Math.min(x, min);
		minStack.push(min);
	}

	public void pop() {
		stack.pop();
		minStack.pop();
		if (minStack.isEmpty()) {
			min = Integer.MAX_VALUE;
		} else {
			min = minStack.peek();
		}
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return min;
	}
}

/**
 * Your MinStack object will be instantiated and called as such: MinStack obj =
 * new MinStack(); obj.push(x); obj.pop(); int param_3 = obj.top(); int param_4
 * = obj.getMin();
 */