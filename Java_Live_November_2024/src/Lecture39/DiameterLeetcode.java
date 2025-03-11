package Lecture39;

import Lecture38.BinaryTree.Node;

public class DiameterLeetcode {

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

	public int diameterOfBinaryTree(TreeNode root) {
		if(root == null) {
			return 0;
		}
		int ld = diameterOfBinaryTree(root.left);
		int rd = diameterOfBinaryTree(root.right);
		int sd = height(root.left) + height(root.right) +2;
		
		return Math.max(Math.max(ld, rd), sd);
		
	}
	
	private int height(TreeNode temp) {
		// TODO Auto-generated method stub
		if(temp == null) {
			return -1;
		}
		int lh = height(temp.left);
		int rh = height(temp.right);
		
		return Math.max(lh, rh) +1;
	}

}
