package Lecture43;

import java.util.Collections;
import java.util.PriorityQueue;

public class PQDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PriorityQueue<Integer> pq = new PriorityQueue<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		pq.add(-1);
		pq.add(2);
		pq.add(10);
		pq.add(20);
		pq.add(3);
		pq.add(8);
		pq.add(4);
		pq.add(-6);
		
		System.out.println(pq.peek());
		
		pq.remove();
		System.out.println(pq.peek());
		pq.remove();
		System.out.println(pq.peek());
		
	}

}
