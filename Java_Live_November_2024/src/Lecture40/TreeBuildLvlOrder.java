package Lecture40;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Lecture38.BinaryTree.Node;

public class TreeBuildLvlOrder {
	public class Node{
		int val;
		Node left;
		Node right;
		public Node() {
			
		}
		public Node(int val) {
			this.val = val;
		}
	}
	private Node root;
	Scanner sc = new Scanner(System.in);
	public TreeBuildLvlOrder() {
		createTree();
	}
	private void createTree() {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		Node nn =  new Node();
		nn.val = n;
		this.root = nn;
		
		Queue<Node> q = new LinkedList<>();
		q.offer(nn);
		
		while(!q.isEmpty()) {
			Node temp = q.poll();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			
			if(c1!=-1) {
				Node left = new Node();
				left.val = c1;
				temp.left = left;
				q.offer(left);
			}
			if(c2!=-1) {
				Node right = new Node();
				right.val = c2;
				temp.right = right;
				q.offer(right);
			}
		}
	}
	public void Display() {
		display(root);
	}
	
	private void display(Node n) {
		if(n == null) {
			return;
		}
		String s = ""  + n.val;
		if(n.left!=null) {
			s = n.left.val + " <==" + s;
		}
		else {
			s =  ". <==" + s;
		}
		if(n.right!=null) {
			s = s+ "==> " + n.right.val;
		}
		else {
			s = s+ "==> .";
		}
		System.out.println(s);
		display(n.left);
		display(n.right);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeBuildLvlOrder bt =  new TreeBuildLvlOrder();
		bt.Display();
	}

}
