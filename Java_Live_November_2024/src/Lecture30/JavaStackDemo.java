package Lecture30;

import java.util.Stack;

public class JavaStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		
		st.push(10);
		st.push(10);
		st.push(10);
		st.push(10);
		st.push(10);
		st.push(10);
		st.push(10);
		
		st.pop();
		
		st.peek();
		
		st.isEmpty();
		
		System.out.println(st);
		
		System.out.println(st.size());
	}

}
