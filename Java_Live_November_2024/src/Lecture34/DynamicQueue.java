package Lecture34;

import Lecture30.Queue;

public class DynamicQueue extends Queue {
	
	public void enqueue(int item) throws Exception {
		if(isFull()) {
			int newarr[] = new int[2*arr.length];
			for (int i = 0; i <this.size; i++) {
				int idx = (front+i) % arr.length;
				newarr[i] = arr[idx];
			}
			arr= newarr;
		}
		super.enqueue(item);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicQueue dq = new DynamicQueue();
		dq.enqueue(10);
		dq.enqueue(10);
		dq.enqueue(10);
		dq.enqueue(10);
		dq.enqueue(10000);
		dq.enqueue(10);
		dq.enqueue(10);
		dq.enqueue(10);
		dq.enqueue(10);
		dq.enqueue(100);
		
		dq.Display();
	}

}
