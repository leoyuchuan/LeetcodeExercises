package com.leoyuchuan.leetcode.addandsearchworddatastructuredesign;

public class WordDictionary {
	TreeNode root = new TreeNode(' ');

	// Adds a word into the data structure.
	public void addWord(String word) {
		TreeNode cur = root;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			int index = c - 'a';
			if (cur.nextChar[index] != null) {
				cur = cur.nextChar[index];
			} else {
				cur.nextChar[index] = new TreeNode(c);
				cur = cur.nextChar[index];
			}
		}
		cur.hasWord = true;
	}

	// Returns if the word is in the data structure. A word could
	// contain the dot character '.' to represent any one letter.
	public boolean search(String word) {
		return search(word, root);
	}

	public boolean search(String word, TreeNode root) {
		if (word.length() == 0) {
			return root.hasWord;
		}
		char c = word.charAt(0);
		int index = c - 'a';
		if (c != '.') {
			if (root.nextChar[index] == null) {
				return false;
			} else {
				return search(word.substring(1), root.nextChar[index]);
			}

		} else {
			boolean hasWord = false;
			for (int i = 0; i < 26; i++) {
				TreeNode next = root.nextChar[i];
				if (next == null) {
					continue;
				} else {
					hasWord = hasWord || search(word.substring(1), next);
					if (hasWord == true) {
						return true;
					}
				}
			}
			return false;
		}
	}
}

class TreeNode {
	char value;
	TreeNode[] nextChar;
	boolean hasWord = false;

	public TreeNode(char value) {
		this.value = value;
		nextChar = new TreeNode[26];
	}
}

// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");