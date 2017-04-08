package com.leoyuchuan.leetcode.pascalstriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> output = new ArrayList<List<Integer>>();
		for (int i = 0; i < numRows; i++) {
			output.add(new ArrayList<Integer>());
			for (int j = 0; j <= i; j++) {
				if (i == 0) {
					output.get(i).add(1);
					continue;
				}
				if (j == 0 || j == i) {
					output.get(i).add(1);
					continue;
				}
				output.get(i).add(output.get(i - 1).get(j - 1) + output.get(i - 1).get(j));
			}
		}
		return output;
	}
}
