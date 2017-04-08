package com.leoyuchuan.leetcode.lengthoflastword;

public class LengthOfLastWord {
	public int lengthOfLastWord(String s) {
		int length = 0;
		for (int i = 0; i < s.length(); i++) {
			char current = s.charAt(s.length() - 1 - i);
			if (current == ' ' && length == 0) {
				continue;
			}
			if (current == ' ' && length != 0) {
				return length;
			}
			if (current != ' ') {
				length++;
			}
		}
		return length;
	}

	// public int lengthOfLastWord(String s) {
	// int bufferedLength = 0;
	// int length = 0;
	// for (int i = 0; i < s.length(); i++) {
	// char current = s.charAt(i);
	// if (current == ' ') {
	// if (length != 0) {
	// bufferedLength = length;
	// }
	// length = 0;
	// }
	// if (current != ' ') {
	// length++;
	// }
	// }
	//
	// if (length == 0 && bufferedLength != 0)
	// return bufferedLength;
	// else
	// return length;
	// }
}
