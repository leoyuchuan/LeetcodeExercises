package com.leoyuchuan.leetcode.palindromenumber;

public class PalindromeNumber {
	// public static void main(String[] args) {
	// System.out.println(isPalindrome(11));
	// }
	//
	// public static boolean isPalindrome(int x) {
	// if (x < 0)
	// return false;
	// int length = getLength(x);
	// int i = 0, j = length - 1;
	// while (true) {
	// int d1 = getDigitAt(i, x, length);
	// int d2 = getDigitAt(j, x, length);
	// if (d1 != d2) {
	// return false;
	// }
	// i++;
	// j--;
	// if (i >= j) {
	// return true;
	// }
	// }
	// }
	//
	// private static int getLength(int x) {
	// x = Math.abs(x);
	// for (int i = 1;; i++) {
	// x /= 10;
	// if (x == 0) {
	// return i;
	// }
	// }
	// }
	//
	// private static int getDigitAt(int index, int value, int length) {
	// int times = (int) Math.pow(10, index);
	// return (value - value / times / 10 * times * 10) / times;
	// }

    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        if(x/10 == 0) return true;
        if(x%10 == 0) return false;
        if(x==1) return true;
		int num = 0;
		while (x > num) {
			num = num * 10 + x % 10;
			x /= 10;
		}
		return (x == num || x == num / 10);
	}
}
