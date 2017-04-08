package com.leoyuchuan.leetcode.simplifypath;

public class SimplifyPath {

	public static String simplifyPath(String path) {
		PathNode root = new PathNode("root");
		PathNode current = root;
		String[] nodes = path.split("/");
		for (int i = 0; i < nodes.length; i++) {
			String tmp = nodes[i].trim();
			if (tmp.equals(".")) {
				continue;
			} else if (tmp.equals("..") && current.previous != null) {
				current = current.previous;
			} else if (!tmp.equals("") && !tmp.equals("..")) {
				current.next = new PathNode(tmp);
				current.next.previous = current;
				current = current.next;
			}
		}
		String output = "";
		while (current != root) {
			output = current.getLabel() + "/" + output;
			current = current.previous;
		}
		return "/"
				+ ((output.length() > 0) ? output.substring(0,
						output.length() - 1) : "");
	}

	static class PathNode {
		private PathNode previous, next;
		private String label;

		public PathNode(String label) {
			this.label = label;
		}

		public PathNode getPrevious() {
			return previous;
		}

		public void setPrevious(PathNode previous) {
			this.previous = previous;
		}

		public PathNode getNext() {
			return next;
		}

		public void setNext(PathNode next) {
			this.next = next;
		}

		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
		}
	}

	public static void main(String[] args) {
		String path = "/abc/...";
		System.out.println(simplifyPath(path));
	}
}
