package Lecture38;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
	
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
	
	public BinaryTree() {
		this.root =  createTree();
	}
	
	private Node createTree() {
		int n = sc.nextInt();
		Node nn = new Node(n);
//		System.out.println("Has Left Child ?");
		boolean hlc = sc.nextBoolean();
		
		if(hlc) { // create left subtree
			nn.left = createTree();
		}
//		System.out.println("Has Right Child ?");
		boolean hrc = sc.nextBoolean();
		
		if(hrc) { // create right subtree
			nn.right = createTree();
		}
		
		return nn;
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
	
	public int Max() {
		return max(root);
	}

	private int max(Node temp) {
		// TODO Auto-generated method stub
		if(temp == null) {
			return Integer.MIN_VALUE;
		}
		int lmax = max(temp.left);
		int rmax = max(temp.right);
		
		return Math.max(temp.val, Math.max(lmax, rmax));
	}
	
	public int Min() {
		return min(root);
	}

	private int min(Node temp) {
		// TODO Auto-generated method stub
		if(temp == null) {
			return Integer.MAX_VALUE;
		}
		int lmax = min(temp.left);
		int rmax = min(temp.right);
		
		return Math.min(temp.val, Math.min(lmax, rmax));
	}
	
	public boolean Find(int item) {
		return find(root, item);
	}

	private boolean find(Node temp, int item) {
		// TODO Auto-generated method stub
		if(temp == null) {
			return false;
		}
		if(temp.val == item) {
			return true;
		}
		boolean left = find(temp.left, item);
		boolean right  = find(temp.right,item);
		
		return left || right;
	}
	
	public int Height() {
		return height(root);
	}

	private int height(Node temp) {
		// TODO Auto-generated method stub
		if(temp == null) {
			return -1;
		}
		int lh = height(temp.left);
		int rh = height(temp.right);
		
		return Math.max(lh, rh) +1;
	}
	
	public void PreOrder() {
		preorder(root);
		System.out.println();
	}

	private void preorder(Node temp) { // NLR
		// TODO Auto-generated method stub
		if(temp == null) {
			return;
		}
		System.out.print(temp.val + " "); // N
		preorder(temp.left); // L
		preorder(temp.right); // R	
	}
	public void InOrder() {
		inorder(root);
		System.out.println();
	}
	
	private void inorder(Node temp) { // LNR
		// TODO Auto-generated method stub
		if(temp == null) {
			return;
		}
		inorder(temp.left); // L
		System.out.print(temp.val + " "); // N
		inorder(temp.right); // R	
	}
	
	public void PostOrder() {
		postorder(root);
		System.out.println();
	}

	private void postorder(Node temp) { // LRN
		// TODO Auto-generated method stub
		if(temp == null) {
			return;
		}
		postorder(temp.left); // L
		postorder(temp.right); // R	
		System.out.print(temp.val + " "); // N
	}
	
	public void LevelOrder() {
//		LinkedList<Integer>  list = new LinkedList<>();
		Queue<Node> q = new LinkedList<>();
		q.offer(root); // Enqueue or Add
		
		while(!q.isEmpty()) {
			Node temp = q.poll(); // Dequeue or remove
			System.out.println(temp.val + " ");
			if(temp.left!=null) {
				q.offer(temp.left);
			}
			if(temp.right!=null) {
				q.offer(temp.right);
			}
		}	
	}
	
	
	
	
	
	
	
}
