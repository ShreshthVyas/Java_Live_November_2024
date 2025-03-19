package Lecture43;

public class HeapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap pq =  new Heap();
		pq.add(-1);
		pq.add(2);
		pq.add(10);
		pq.add(20);
		pq.add(3);
		pq.add(8);
		pq.add(4);
		pq.add(-6);
		
		System.out.println(pq.get());
		
		pq.remove();
		System.out.println(pq.get());
		pq.remove();
		System.out.println(pq.get());
		
		
	}

}
