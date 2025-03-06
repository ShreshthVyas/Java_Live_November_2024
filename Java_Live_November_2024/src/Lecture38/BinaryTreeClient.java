package Lecture38;

public class BinaryTreeClient {
	// 10 true 20 true 40 false false true 50 false false true 30 false true 70 false false
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
//		bt.Display();
//		System.out.println(bt.Max());
		
//		System.out.println(bt.Find(70));
		
//		System.out.println(bt.Height());
		bt.PreOrder();
		bt.InOrder();
		bt.PostOrder();
		bt.LevelOrder();
		
	}
}
