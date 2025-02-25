package Lecture35;

public class LLClient {
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.Addfirst(10);
		ll.AddLast(20);
		ll.AddLast(30);
		ll.AddLast(40);
		ll.AddLast(50);
		ll.Addfirst(70);
		ll.Display();
//		ll.removefirst();
//		ll.removeLast();
//		ll.addatIdx(100, 3);
//		ll.Display();
//		ll.removeatIdx(2);
//		ll.Display();
		
//		System.out.println(ll.getAtIdx(2));
		System.out.println(ll.linearsearch(10));
		System.out.println(ll.linearsearch(1000));
	}

}
