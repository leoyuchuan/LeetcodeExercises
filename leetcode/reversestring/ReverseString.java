package com.leoyuchuan.leetcode.reversestring;

public class ReverseString {
	public String reverseString(String s) {
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}
}
