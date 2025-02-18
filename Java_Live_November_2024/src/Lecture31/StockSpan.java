package Lecture31;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {80,30,35,40,38,35,50};
		int ans[] = new int[arr.length];
		Stack<Integer>  st =  new Stack<>();
		
		for (int i = 0; i < ans.length; i++) {
			while(!st.isEmpty() && arr[i]>= arr[st.peek()]) { // pop all consecutive smaller elements
				st.pop(); 
			}
			if(st.isEmpty()) { // no bigger peak found
				ans[i] = i+1;
			}
			else { // bigger peak found
				ans[i] = i -  st.peek();
			}
			st.push(i);	
		}
		
		System.out.println(Arrays.toString(ans));
	}

}
