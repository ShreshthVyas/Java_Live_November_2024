package Lecture32;
import java.util.*;
public class Form_Minimum_Number_from_DI_sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "IDDDD";
		int ans[] = new int[s.length()+1];
		Stack<Integer>  st = new Stack<>();
		int c =1;
		for (int i = 0; i <=s.length(); i++) {
			if(i == s.length() || s.charAt(i) == 'I') {
				ans[i] = c++;
				while(!st.isEmpty()) { // previous D's
					ans[st.pop()] = c++;
				}
			}
			else {
				st.push(i);
			}
		}
		
		System.out.println(Arrays.toString(ans));
	}

}
