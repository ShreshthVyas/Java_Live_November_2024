package Lecture30;

public class Queue {
	// All Major methods in O(1)
	protected int arr[];
	protected int front =0;
	protected int size =0;
	
	public Queue() {
		this.arr = new int[5];
	}
	public Queue(int size) {
		this.arr = new int[size];
	}
	
	public boolean isEmpty() {
		return this.size ==0;
	}
	
	public boolean isFull() {
		return this.size == arr.length;
	}
	
	public void enqueue(int item) throws Exception {
		if(isFull()) {
			throw new Exception("Queue is full");
		}
		int idx  = (this.front+this.size) % this.arr.length;
		arr[idx] = item;
		this.size++;
	}
	
	public int dequeue() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is empty");
		}
		int temp = arr[front];
		arr[front] = 0;
		front = (front+1)% arr.length;
		this.size--;
		
		return temp;
	}
	
	public int peek() throws Exception{
		if(isEmpty()) {
			throw new Exception("Queue is empty");
		}
		
		return arr[front];
	}
	
	public int length() {
		return this.size;
	}
	
	public void Display() {
		for (int i = 0; i <this.size; i++) {
			int idx = (front+i) % arr.length;
			System.out.print(arr[idx] + " ");
		}
		System.out.println();
	}

}
