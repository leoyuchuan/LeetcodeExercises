package com.leoyuchuan.leetcode.poweroffour;

public class PowerOfFour {
	public static void main(String[] args) {
	}
	// public boolean isPowerOfFour(int num) {
	// switch (num) {
	// case 1:
	// case 4:
	// case 16:
	// case 64:
	// case 256:
	// case 1024:
	// case 4096:
	// case 16384:
	// case 65536:
	// case 262144:
	// case 1048576:
	// case 4194304:
	// case 16777216:
	// case 67108864:
	// case 268435456:
	// case 1073741824:
	// return true;
	// default:
	// return false;
	// }
	// }

	// public boolean isPowerOfFour(int num) {
	// return (Math.log10(num) / Math.log10(4) + 0.00001) % 1 <= 0.00002;
	// }

	// public boolean isPowerOfFour(int num) {
	// String base4 = Integer.toString(num, 4);
	// return base4.matches("^10*$");
	// }

	public boolean isPowerOfFour(int num) {
		return (num & 0x55555555) != 0 && (num & (num - 1)) == 0;
	}
}
