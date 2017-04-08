package com.leoyuchuan.leetcode.LRUCache;

// Bad Approach
// public class LRUCache {
// int[][] map;
// int[] frequency;
// int size = 0;
//
// public LRUCache(int capacity) {
// map = new int[capacity][2];
// frequency = new int[capacity];
// }
//
// public int get(int key) {
// for (int i = 0; i < size; i++) {
// if (map[i][0] == key) {
// int tmpkey = key;
// int tmpvalue = map[i][1];
// int tmpfreq = frequency[i] + 1;
// for (int j = i - 1; j >= 0; j--) {
// if (frequency[j] < tmpfreq) {
// map[j + 1] = map[j];
// frequency[j + 1] = frequency[j];
// } else {
// map[j + 1][0] = tmpkey;
// map[j + 1][1] = tmpvalue;
// frequency[j + 1] = tmpfreq;
// break;
// }
// }
// return tmpvalue;
// }
// }
// return -1;
// }
//
// public void set(int key, int value) {
// if (size < map.length) {
// for (int i = 0; i < size; i++) {
// if (map[i][0] == key) {
// map[i][1] = value;
// return;
// }
// }
// map[size][0] = key;
// map[size][1] = value;
// frequency[size] = 0;
// size++;
// } else {
// // int min = Integer.MAX_VALUE;
// // int index = -1;
// // for (int i = 0; i < size; i++) {
// // if (min > frequency[i]) {
// // index = i;
// // min = frequency[i];
// // }
// // }
//
// map[size - 1][0] = key;
// map[size - 1][1] = value;
// frequency[size - 1] = 0;
// }
// }
// }
