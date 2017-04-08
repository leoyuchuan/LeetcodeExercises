package com.leoyuchuan.leetcode.hindex;

import java.util.Arrays;

public class HIndex {
	public static int hIndex(int[] citations) {
		int numPapers = citations.length;
		Arrays.sort(citations);
		findHIndex(citations[numPapers / 2], numPapers / 2, citations);
		return 0;
	}

	public static int[] findHIndex(int hIndex, int index, int[] citations) {
		int upperNum = citations.length - index;

		if (hIndex == upperNum) {
			
		}

		return new int[] { 0, 0 };
	}
}
