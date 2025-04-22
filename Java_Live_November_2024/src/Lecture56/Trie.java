package Lecture56;

import java.util.HashMap;

public class Trie {

	public class Node {
		char ch;
		HashMap<Character, Node> child = new HashMap<>();
		boolean isEnd;
	}

	private Node root;

	public Trie() {
		this.root = new Node();
		root.ch = '*';
	}

	public void insert(String word) {
		Node nn = this.root;

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (nn.child.containsKey(ch)) {// if char present
				nn = nn.child.get(ch);
			} else {
				Node temp = new Node();
				temp.ch = ch;
				nn.child.put(ch, temp);
				nn = temp;
			}
		}
		nn.isEnd = true;

	}

	public boolean search(String word) {
		Node nn = this.root;

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (nn.child.containsKey(ch)) {// if char present
				nn = nn.child.get(ch);
			} else {
				return false;
			}
		}
		
		return nn.isEnd;
	}

	public boolean startsWith(String prefix) {
		Node nn = this.root;

		for (int i = 0; i < prefix.length(); i++) {
			char ch = prefix.charAt(i);
			if (nn.child.containsKey(ch)) {// if char present
				nn = nn.child.get(ch);
			} else {
				return false;
			}
		}
		
		return true;
	}
}
