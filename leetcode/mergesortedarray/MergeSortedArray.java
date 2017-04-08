package com.leoyuchuan.leetcode.mergesortedarray;

public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		if (m == 0) {
			for (int i = 0; i < n; i++) {
				nums1[i] = nums2[i];
			}
			return;
		}
		if (n == 0) {
			return;
		}
		int pointer = m + n - 1;
		int a1Pointer = m - 1;
		int a2Pointer = n - 1;
		while (pointer != -1) {
			if (nums1[a1Pointer] >= nums2[a2Pointer]) {
				nums1[pointer] = nums1[a1Pointer];
				if (pointer != a1Pointer) {
					nums1[a1Pointer] = Integer.MIN_VALUE;
				}
				a1Pointer--;
				if (a1Pointer < 0) {
					a1Pointer = 0;
				}
			} else {
				nums1[pointer] = nums2[a2Pointer];
				nums2[a2Pointer] = Integer.MIN_VALUE;
				a2Pointer--;
				if (a2Pointer < 0) {
					a2Pointer = 0;
				}
			}

			pointer = pointer - 1;
		}
	}
}
