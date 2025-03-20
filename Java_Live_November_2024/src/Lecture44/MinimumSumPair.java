package Lecture44;

import java.util.PriorityQueue;

public class MinimumSumPair {

	public static void main(String[] args) {
		int arr[] = {5,6,1,2,3,4};
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i : arr) {
			pq.add(i);
		}
		int sum = 0;
		while(pq.size()>1) {
			int a = pq.remove();
			int b = pq.remove();
			sum+= a+b;
			
			pq.add(a+b);
		}
		
		System.out.println(sum);
	}
}
