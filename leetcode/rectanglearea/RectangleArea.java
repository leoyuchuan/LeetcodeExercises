package com.leoyuchuan.leetcode.rectanglearea;

public class RectangleArea {
	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		// calculate area of two rectangle
		int areaA = Math.abs(C - A) * Math.abs(D - B);
		int areaB = Math.abs(G - E) * Math.abs(H - F);
		int common = 0;
		int left = Math.max(A, E);
		int right = Math.min(G, C);
		int bottom = Math.max(F, B);
		int top = Math.min(D, H);
		if (right > left && top > bottom)
			common = (right - left) * (top - bottom);

		return areaA + areaB - common;
	}
}
