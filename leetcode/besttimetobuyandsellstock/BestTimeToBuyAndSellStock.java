package com.leoyuchuan.leetcode.besttimetobuyandsellstock;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		System.out.println(maxProfit(new int[] { 1, 2, 3, 4 }));
	}

	public static int maxProfit(int[] prices) {
		if(prices.length == 0){
			return 0;
		}
		int max = 0;
		int minprice = prices[0];
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > minprice) {
				max = Math.max(max, prices[i] - minprice);
			} else {
				minprice = prices[i];
			}
		}
		return max;
	}
}
