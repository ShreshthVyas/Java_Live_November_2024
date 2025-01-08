package Lecture16;

import java.util.Arrays;
import java.util.Scanner;

public class StringIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		
//		String s = sc.next();
		
		String s = "Hello123";
		
		System.out.println(s);
		
		System.out.println(s.length()); // length of string
		
		System.out.println(s.charAt(1));
		
		
//		for (int i = 0; i < s.length(); i++) {
//			System.out.print(s.charAt(i)+" ");
//		}
		
		
//		char charr[] = new char[s.length()];
//		
//		for (int i = 0; i < s.length(); i++) {
//			charr[i] = s.charAt(i);
//		}
//		
//		System.out.println(Arrays.toString(charr));
		
//		char ch[] = s.toCharArray();
//		
//		System.out.println(Arrays.toString(ch));
		
//		for(char ch : s.toCharArray()) {
//			System.out.println(ch);
//		}
		
		System.out.println(s.substring(0, s.length()-1));
		System.out.println(s.substring(1));
		
		
		
		
		
		
	}

}
