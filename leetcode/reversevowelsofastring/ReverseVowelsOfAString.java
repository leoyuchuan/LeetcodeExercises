package com.leoyuchuan.leetcode.reversevowelsofastring;

import java.util.Stack;

public class ReverseVowelsOfAString {
	public static String reverseVowels(String s) {
		Stack<Character> vowels = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);
			if (isVowel(cur)) {
				vowels.push(cur);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);
			if (isVowel(cur)) {
				sb.append(vowels.pop());
			} else {
				sb.append(cur);
			}
		}
		return sb.toString();
	}

	public static boolean isVowel(char letter) {
		switch (letter) {
		case 'a':
			return true;
		case 'e':
			return true;
		case 'i':
			return true;
		case 'o':
			return true;
		case 'u':
			return true;
		case 'A':
			return true;
		case 'E':
			return true;
		case 'I':
			return true;
		case 'O':
			return true;
		case 'U':
			return true;
		default:
			return false;
		}
	}
}
