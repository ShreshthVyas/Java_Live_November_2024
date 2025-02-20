package Lecture29;

public class Stack {
	// All major function T.C - O(1)
	protected int arr[];
	protected int top = -1;
	
	public Stack() {
		this.arr = new int[5]; //default size 5
	}
	public Stack(int size) {
		this.arr = new int[size];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	public boolean isFull() {
		return top == arr.length-1;
	}
	
	public void push(int item) throws Exception {
		if(isFull()) {
			throw new Exception("Stack is Full");
		}
		top++;
		arr[top] = item;
	}
	
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		int temp = arr[top];
		arr[top] =0;
		top--;
		
		return temp;
	}
	
	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		
		return arr[top];
	}
	
	public void Display() {
		for (int i = top; i>= 0; i--) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public int length() {
		return top+1;
	}
}
