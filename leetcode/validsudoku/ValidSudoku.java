package com.leoyuchuan.leetcode.validsudoku;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		for (int row = 0; row < 9; row++) {
			Set<Character> duplicateRow = new HashSet<>();
			Set<Character> duplicateCol = new HashSet<>();
			for (int col = 0; col < 9; col++) {
				if (board[row][col] < '1' && board[row][col] > '9') {
					return false;
				}
				if (board[row][col] != '.' && duplicateRow.contains(board[row][col])) {
					return false;
				}
				duplicateRow.add(board[row][col]);
				if (board[col][row] != '.' && duplicateCol.contains(board[col][row])) {
					return false;
				}
				duplicateCol.add(board[col][row]);
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int[] rangeV = new int[] { 0 + i * 3, 1 + i * 3, 2 + i * 3 };
				int[] rangeH = new int[] { 0 + j * 3, 1 + j * 3, 2 + j * 3 };
				Set<Character> duplicateSquare = new HashSet<>();
				for (int p : rangeV) {
					for (int q : rangeH) {
						if (board[p][q] != '.' && duplicateSquare.contains(board[p][q])) {
							return false;
						}
						duplicateSquare.add(board[p][q]);
					}
				}
			}
		}
		return true;
	}
}
