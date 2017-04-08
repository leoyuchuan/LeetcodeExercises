package com.leoyuchuan.leetcode.medianoftwosortedarrays;

public class MedianOfTwoSortedArrays {
	public static void main(String[] args) {
		System.out.println(findMedianSortedArrays(new int[] { 1 }, new int[] { 1 }));
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;
		if (m == 0 && n == 0) {
			return 0;
		}
		if (m == 0 && n != 0) {
			int length = n;
			if (length % 2 == 0) {
				int index1 = length / 2;
				int index2 = index1 - 1;
				int value1 = 0, value2 = 0;
				value1 = nums2[index1];
				value2 = nums2[index2];
				return (value1 + value2) / 2.0;
			} else {
				int index = length / 2;
				return nums2[index];
			}
		}
		if (m != 0 && n == 0) {
			int length = m;
			if (length % 2 == 0) {
				int index1 = length / 2;
				int index2 = index1 - 1;
				int value1 = 0, value2 = 0;
				value1 = nums1[index1];
				value2 = nums1[index2];
				return (value1 + value2) / 2.0;
			} else {
				int index = length / 2;
				return nums1[index];
			}
		}

		if (nums1[0] >= nums2[nums2.length - 1]) {
			int length = m + n;
			if (length % 2 == 0) {
				int index1 = length / 2;
				int index2 = index1 - 1;
				int value1 = 0, value2 = 0;
				if (index1 >= n) {
					value1 = nums1[index1 - n];
				} else {
					value1 = nums2[index1];
				}
				if (index2 >= n) {
					value2 = nums1[index2 - n];
				} else {
					value2 = nums2[index2];
				}
				return (value1 + value2) / 2.0;

			} else {
				int index = length / 2;
				if (index >= n) {
					return nums1[index - n];
				} else {
					return nums2[index];
				}
			}
		} else if (nums2[0] >= nums1[nums1.length - 1]) {
			int length = m + n;
			if (length % 2 == 0) {
				int index1 = length / 2;
				int index2 = index1 - 1;
				int value1 = 0, value2 = 0;
				if (index1 >= m) {
					value1 = nums2[index1 - m];
				} else {
					value1 = nums1[index1];
				}
				if (index2 >= m) {
					value2 = nums2[index2 - m];
				} else {
					value2 = nums1[index2];
				}
				return (value1 + value2) / 2.0;

			} else {
				int index = length / 2;
				if (index >= m) {
					return nums2[index - m];
				} else {
					return nums1[index];
				}
			}
		}

		return 0;
	}

}
