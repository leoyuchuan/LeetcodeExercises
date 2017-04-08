package com.leoyuchuan.leetcode.bullsandcows;

import java.util.HashMap;

public class BullsAndCows {
	public String getHint(String secret, String guess) {
		int bulls = 0, cows = 0;
		HashMap<Character, Integer> smap = new HashMap<>();
		HashMap<Character, Integer> gmap = new HashMap<>();

		for (int i = 0; i < secret.length(); i++) {
			char s = secret.charAt(i);
			char g = guess.charAt(i);
			if (s == g) {
				bulls++;
			} else {
				if (smap.containsKey(s)) {
					smap.put(s, smap.get(s) + 1);
				} else {
					smap.put(s, 1);
				}
				if (gmap.containsKey(g)) {
					gmap.put(g, gmap.get(g) + 1);
				} else {
					gmap.put(g, 1);
				}
			}
		}

		for (char key : smap.keySet()) {
			int value = smap.get(key);
			if (gmap.containsKey(key)) {
				value = Math.min(value, gmap.get(key));
			} else {
				value = 0;
			}
			cows += value;
		}
		return String.format("%dA%dB", bulls, cows);
	}
}
