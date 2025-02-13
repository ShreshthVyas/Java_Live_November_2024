package Lecture30;

import java.util.Stack;

public class InsertAtBottom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>  st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
		System.out.println(st);
		
//		iab(60,st);
		
		iaboptimised(60,st);
		
		System.out.println(st);
		
	}

	private static void iaboptimised(int i, Stack<Integer> st) {
		// TODO Auto-generated method stub
		if(st.isEmpty()) {
			st.push(i);
			return;
		}
		
		int temp = st.pop();
		iaboptimised(i, st);
		st.push(temp);
		
	}

	private static void iab(int item, Stack<Integer> st) {
		// TODO Auto-generated method stub
		Stack<Integer>  helper = new Stack<>();
		
		while(!st.isEmpty()) {
			helper.push(st.pop());
		}
		
		st.push(item);
		
		while(!helper.isEmpty()) {
			st.push(helper.pop());
		}
	}

}
