package com.leoyuchuan.leetcode.generateparentheses;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParentheses {
	static char left = '(';
	static char right = ')';

	public static void main(String[] args) {
		System.out.println(generateParenthesis(10));
	}

	public static List<String> generateParenthesis(int n) {
		ArrayList<String> output = new ArrayList<>();

		Stack<Character> stack = new Stack<>();
		stack.push(left);
		output.addAll(generate(stack, n - 1, n));

		return output;
	}

	private static List<String> generate(Stack<Character> stack, int leftn, int rightn) {
		ArrayList<String> output = new ArrayList<>();
		if (rightn == 0) {
			Character[] out = new Character[0];
			Character[] array = stack.toArray(out);
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < array.length; i++) {
				sb.append(array[i].charValue());
			}
			output.add(sb.toString());
		}

		if (leftn > 0) {
			stack.push(left);
			output.addAll(generate(stack, leftn - 1, rightn));
			stack.pop();
		}
		if (rightn > 0 && leftn < rightn) {
			stack.push(right);
			output.addAll(generate(stack, leftn, rightn - 1));
			stack.pop();
		}
		return output;
	}
}
