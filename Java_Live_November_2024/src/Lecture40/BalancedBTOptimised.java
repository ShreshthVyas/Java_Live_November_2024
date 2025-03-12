package Lecture40;

import Lecture40.BalancedBinaryTree.TreeNode;

public class BalancedBTOptimised {
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
		return balanced(root).b;
	}
	public balpair balanced(TreeNode root) {
		if(root == null) {
			return new balpair();
		}
		balpair lbp = balanced(root.left);
		balpair rbp = balanced(root.right);
		
		balpair sbp = new balpair();
		boolean sb = Math.abs(lbp.h - rbp.h) <=1;
		sbp.b = lbp.b && rbp.b && sb;
		sbp.h = Math.max(lbp.h, rbp.h) +1;
		
		return sbp;
		
	}
	
	public class balpair{
		boolean b = true;
		int h = -1;
	}
}
