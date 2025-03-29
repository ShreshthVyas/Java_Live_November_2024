package Lecture47;
import java.util.*;

import Lecture39.DiameterLeetcode.TreeNode;
public class VerticalOrderTraversal {
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map;
	public List<List<Integer>> verticalTraversal(TreeNode root) {
		map = new TreeMap<>();
		rec(root,0,0);
		List<List<Integer>> ans = new ArrayList<>();
		
		for (int i  : map.keySet()) { // vidx
			List<Integer> list = new ArrayList<>();
			for (int j : map.get(i).keySet()) { //hidx
				PriorityQueue<Integer> pq = map.get(i).get(j);
				while(!pq.isEmpty()) {
					list.add(pq.remove());
				}
			}
			ans.add(list);
		}
		
		return ans;
		
		
		
	}
	
	private void rec(TreeNode root, int vidx, int hidx) {
		// TODO Auto-generated method stub
		if(root == null) {
			return;
		}
		// map add
		map.putIfAbsent(vidx,new TreeMap<Integer,PriorityQueue<Integer>>());
		map.get(vidx).putIfAbsent(hidx, new PriorityQueue<Integer>());
		map.get(vidx).get(hidx).add(root.val);
		
		rec(root.left, vidx-1, hidx+1);
		rec(root.right, vidx+1, hidx+1);
		
	}

}
