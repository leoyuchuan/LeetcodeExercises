package com.leoyuchuan.leetcode.firstbadversion;

/* The isBadVersion API is defined in the parent class VersionControl.
boolean isBadVersion(int version); */

public class FirstBadVersion extends VersionControl {
	public int firstBadVersion(int n) {
		return bs(1, n, isBadVersion(1 + (n - 1) / 2));
	}

	public int bs(int left, int right, boolean isBad) {
		int middle = left + (right - left) / 2;
		if (middle == left) {
			if (isBad) {
				return middle;
			} else {
				return middle + 1;
			}
		}
		if (isBad) {
			int quater = left + (middle - left) / 2;
			return bs(left, middle, isBadVersion(quater));
		} else {
			int quater = middle + (right - middle) / 2;
			return bs(middle, right, isBadVersion(quater));
		}
	}
}

class VersionControl {
	boolean isBadVersion(int version) {
		return true;
	}
}