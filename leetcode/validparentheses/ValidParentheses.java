package com.leoyuchuan.leetcode.validparentheses;

import java.util.Stack;

public class ValidParentheses {
	public static boolean isValid(String s) {
		Stack<Character> check = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				check.push(c);
				continue;
			}
			if (check.size() == 0) {
				return false;
			}
			if (c == ')') {
				Character out = check.pop();
				if (out != '(') {
					return false;
				}
			} else if (c == ']') {
				Character out = check.pop();
				if (out != '[') {
					return false;
				}
			} else if (c == '}') {
				Character out = check.pop();
				if (out != '{') {
					return false;
				}
			}
		}
		if (check.isEmpty())
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		System.out.println(isValid("{{"));
	}

}
