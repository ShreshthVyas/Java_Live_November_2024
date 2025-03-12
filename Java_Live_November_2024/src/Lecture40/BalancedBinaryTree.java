package Lecture40;

import Lecture40.DiameterOptimised.TreeNode;

public class BalancedBinaryTree {

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

	public boolean isBalanced(TreeNode root) {
		if(root == null) {
			return true;
		}
		boolean left = isBalanced(root.left);
		boolean right = isBalanced(root.right);
		int lh = height(root.left);
		int rh = height(root.right);
		boolean self = Math.abs(lh-rh) <=1;
		
		return left && right && self;
	}

	private int height(TreeNode temp) {
		// TODO Auto-generated method stub
		if (temp == null) {
			return -1;
		}
		int lh = height(temp.left);
		int rh = height(temp.right);

		return Math.max(lh, rh) + 1;
	}
}
