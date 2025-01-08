package Lecture16;

import java.util.Scanner;

public class GoodSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String s = sc.next();
		
		int ans = goodstring(s);
		System.out.println(ans);
	}

	public static int goodstring(String s) {
		// TODO Auto-generated method stub
		int max =0;
		int count =0;
		
		for (int i = 0; i < s.length(); i++) {
			if(isVowel(s.charAt(i))) {
				count++;
			}
			else {
				max = Math.max(max, count);
				count =0;
			}
		}
		max = Math.max(max, count);
		return max;
	}

	public static boolean isVowel(char ch) {
		// TODO Auto-generated method stub
		if(ch == 'a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
			return true;
		}
		
		return false;
	}

}
