package com.leoyuchuan.leetcode.textjustification;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
	public static List<String> fullJustify(String[] words, int maxWidth) {
		List<String> output = new ArrayList<String>();
		int sum = 0;
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			List<String> tmp = new ArrayList<String>();
			sum += words[i].length() + (sum == 0 ? 0 : 1);
			count++;
			if (i == words.length - 1) {
				if (sum <= maxWidth) {
					for (int m = 0; m < count; m++) {
						tmp.add(words[i - count + m + 1]);
					}
					output.add(padding(tmp.toArray(new String[0]), maxWidth,
							true));
				} else {
					for (int m = 0; m < count - 1; m++) {
						tmp.add(words[i - count + m + 1]);
					}
					output.add(padding(tmp.toArray(new String[0]), maxWidth,
							false));
					output.add(padding(new String[] { words[i] }, maxWidth,
							true));
				}
				break;
			}
			if (sum > maxWidth) {
				for (int m = 0; m < count - 1; m++) {
					tmp.add(words[i - count + m + 1]);
				}
				output.add(padding(tmp.toArray(new String[0]), maxWidth, false));
				sum = words[i].length();
				count = 1;
			} else if (sum == maxWidth) {
				for (int m = 0; m < count; m++) {
					tmp.add(words[i - count + m + 1]);
				}
				output.add(padding(tmp.toArray(new String[0]), maxWidth, false));
				sum = 0;
				count = 0;
			}
		}
		return output;
	}

	public static String padding(String[] words, int maxWidth, boolean isLast) {
		String output = words[0];
		if (words.length == 1) {
			int length = maxWidth - output.length();
			output += getSpaces(length);
			return output;
		}
		if (isLast) {
			output = "";
			for (int i = 0; i < words.length; i++) {
				output += words[i];
				if (i == words.length - 1) {
					output += getSpaces(maxWidth - output.length());
					break;
				}
				output += getSpaces(1);

			}
			return output;
		}
		int betweens = words.length - 1;
		int whiteSpaces = (maxWidth - getLength(words));
		int baseSpace = whiteSpaces / betweens;
		int remainder = whiteSpaces % betweens;
		output = "";
		for (int i = 0; i < words.length; i++) {
			output += words[i];
			if (i == words.length - 1) {
				break;
			}
			output += getSpaces(baseSpace + (remainder > 0 ? 1 : 0));
			remainder--;
		}
		return output;
	}

	public static String getSpaces(int length) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			sb.append(" ");
		}
		return sb.toString();
	}

	public static int getLength(String[] words) {
		int sum = 0;
		for (int i = 0; i < words.length; i++) {
			sum += words[i].length();
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(fullJustify(
				new String[] { "What", "must", "be", "shall", "be." }, 5)
				.toString());
	}
}
