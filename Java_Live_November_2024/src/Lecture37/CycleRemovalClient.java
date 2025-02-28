package Lecture37;

public class CycleRemovalClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CycleRemovalLL ll = new CycleRemovalLL();
		ll.Addfirst(10);
		ll.AddLast(20);
		ll.AddLast(30);
		ll.AddLast(40);
		ll.AddLast(50);
		ll.AddLast(60);
		ll.AddLast(70);
		ll.CreateCycle(2);
//		ll.RemoveCycle();
//		ll.CycleRemovalOptimised();
		ll.FloydAlgo();
		ll.Display();
		
	
	}

}
