package com.leoyuchuan.leetcode.lettercombinationsofaphonenumber;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
	public List<String> letterCombinations(String digits) {
		ArrayList<String> output = new ArrayList<String>();
		if (digits.length() == 0)
			return output;

		if (digits.length() == 1) {
			output.addAll(getDigitSet(digits.charAt(0)));
			return output;
		}
		List<String> digitSet = getDigitSet(digits.charAt(0));
		List<String> tmp = letterCombinations(digits.substring(1));
		Iterator<String> iterator = digitSet.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			Iterator<String> iterator2 = tmp.iterator();
			while (iterator2.hasNext()) {
				String next2 = iterator2.next();
				output.add(next.concat(next2));
			}
		}
		return output;
	}

	public static List<String> getDigitSet(char c) {
		ArrayList<String> output = new ArrayList<>();
		if (c == '2') {
			output.add("a");
			output.add("b");
			output.add("c");
		} else if (c == '3') {
			output.add("d");
			output.add("e");
			output.add("f");
		} else if (c == '4') {
			output.add("g");
			output.add("h");
			output.add("i");
		} else if (c == '5') {
			output.add("j");
			output.add("k");
			output.add("l");
		} else if (c == '6') {
			output.add("m");
			output.add("n");
			output.add("o");
		} else if (c == '7') {
			output.add("p");
			output.add("q");
			output.add("r");
			output.add("s");
		} else if (c == '8') {
			output.add("t");
			output.add("u");
			output.add("v");
		} else if (c == '9') {
			output.add("w");
			output.add("x");
			output.add("y");
			output.add("z");
		}
		return output;
	}
}
