package Lecture41;

import Lecture41.InsertInBST.TreeNode;

public class DeleteInBST {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public TreeNode deleteNode(TreeNode root, int key) {
		if(root == null) {
			return null;
		}
		if(root.val < key) {
			root.right = deleteNode(root.right, key);
		}
		else if (root.val > key) {
			root.left = deleteNode(root.left, key);
		}
		else { //key found
			if(root.left==null) { // both children null || only left null
				return root.right;
			}
			else if(root.right == null) { // only right null
				return root.left;
			}
			else { // both not null
				int leftmax = max(root.left);
				root.left = deleteNode(root.left, leftmax);
				root.val = leftmax;
			}
		}
		return root;
	}
	
	private int max(TreeNode temp) {
		if(temp == null) {
			return Integer.MIN_VALUE;
		}
		int right = max(temp.right);
		return Math.max(temp.val, right);
	}
}
