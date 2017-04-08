package com.leoyuchuan.leetcode.maximumproductofwordlengths;

import java.util.Set;
import java.util.TreeSet;

public class MaximumProductOfWordLengths {
	// public static int maxProduct(String[] words) {
	// int maxProduct = 0;
	// for (int i = 0; i < words.length; i++) {
	// String current = words[i];
	// Set<Character> existing = new TreeSet<>();
	// for (int j = 0; j < current.length(); j++) {
	// existing.add(current.charAt(j));
	// }
	// for (int j = i + 1; j < words.length; j++) {
	// String toCompare = words[j];
	// boolean conflict = false;
	// for (int k = 0; k < toCompare.length(); k++) {
	// if (existing.contains(toCompare.charAt(k))) {
	// conflict = true;
	// break;
	// }
	// }
	// if (conflict) {
	// continue;
	// }
	// maxProduct = current.length() * toCompare.length();
	// }
	// }
	// return maxProduct;
	// }

	public static int maxProduct(String[] words) {
		int maxProduct = 0;
		for (int i = 0; i < words.length; i++) {
			String current = words[i];
			Set<Character> existing = new TreeSet<>();
			for (int j = 0; j < current.length(); j++) {
				existing.add(current.charAt(j));
			}
			for (int j = i + 1; j < words.length; j++) {
				String toCompare = words[j];
				boolean conflict = false;
				for (int k = 0; k < toCompare.length(); k++) {
					if (existing.contains(toCompare.charAt(k))) {
						conflict = true;
						break;
					}
				}
				if (conflict) {
					continue;
				}
				maxProduct = current.length() * toCompare.length();
			}
		}
		return maxProduct;
	}
}
