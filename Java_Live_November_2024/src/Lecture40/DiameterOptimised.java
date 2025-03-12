package Lecture40;

import Lecture39.DiameterLeetcode.TreeNode;

public class DiameterOptimised {

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
		return diameter(root).d;
	}
	
	public Diapair diameter(TreeNode root) {
		if(root == null) {
			return new Diapair();
		}
		Diapair ldp = diameter(root.left);
		Diapair rdp = diameter(root.right);
		
		Diapair sdp = new Diapair();
		int sd = ldp.h + rdp.h +2;
		sdp.d = Math.max(sd, Math.max(ldp.d, rdp.d));
		sdp.h = Math.max(ldp.h, rdp.h) + 1;
		
		return sdp;
	}
	
	public class Diapair{
		int h = -1;
		int d = 0;
		
	}

}
