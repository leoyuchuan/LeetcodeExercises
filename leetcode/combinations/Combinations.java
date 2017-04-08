package com.leoyuchuan.leetcode.combinations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Combinations {
	public static void main(String[] args) {
		List<List<Integer>> combine = combine(10, 7);
		for (int i = 0; i < combine.size(); i++) {
			System.out.println(combine.get(i));
		}
	}

	public static List<List<Integer>> combine(int n, int k) {
		return levelByLevel(n, k, new ArrayList<>());
	}

	@SuppressWarnings("unchecked")
	static ArrayList<List<Integer>> levelByLevel(int n, int k, ArrayList<List<Integer>> output) {
		if (k == 0) {
			return output;
		}

		ArrayList<List<Integer>> res = new ArrayList<>();

		Iterator<List<Integer>> iterator = output.iterator();

		if (output.size() == 0) {
			for (int i = 1; i <= n; i++) {
				ArrayList<Integer> clone = new ArrayList<>();
				clone.add(i);
				res.add(clone);

			}
		} else {
			while (iterator.hasNext()) {
				ArrayList<Integer> next = (ArrayList<Integer>) iterator.next();

				for (int i = 1; i <= n; i++) {
					if (next.contains(i)) {
						continue;
					}
					ArrayList<Integer> clone = (ArrayList<Integer>) next.clone();
					clone.add(i);
					res.add(clone);

				}
			}
		}

		return levelByLevel(n, k - 1, res);
	}
}
