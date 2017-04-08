package com.leoyuchuan.leetcode.uglynumber;

import java.util.LinkedList;
import java.util.Queue;

public class UglyNumber {
	public static void main(String[] args) {
		System.out.println(isUgly(-1));
	}

	// public static boolean isUgly(int num) {
	// if (num == 0) {
	// return false;
	// }
	// if (num == 1 || num == 2 || num == 3 || num == 5) {
	// return true;
	// }
	// if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0) {
	// return false;
	// }
	// boolean a1 = true;
	// boolean a2 = true;
	// boolean a3 = true;
	// if (num % 2 == 0) {
	// a1 = isUgly(num / 2);
	// }
	// if (num % 3 == 0) {
	// a2 = isUgly(num / 3);
	// }
	// if (num % 5 == 0) {
	// a3 = isUgly(num / 5);
	// }
	//
	// return a1 && a2 && a3;
	// }
	public static boolean isUgly(int num) {
		if (num == 0)
			return false;
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(num);
		while (!queue.isEmpty()) {
			Integer poll = queue.poll();
			if (poll == 1) {
				continue;
			}
			if (poll % 2 == 0) {
				queue.add(poll / 2);
			} else if (poll % 3 == 0) {
				queue.add(poll / 3);
			} else if (poll % 5 == 0) {
				queue.add(poll / 5);
			} else {
				return false;
			}
		}
		return true;
	}
}
