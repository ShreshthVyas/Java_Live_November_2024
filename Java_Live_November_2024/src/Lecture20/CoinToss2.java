package Lecture20;

import java.util.Scanner;

public class CoinToss2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		coin(n,"");
	}

	public static void coin(int n, String ans) {
		// TODO Auto-generated method stub
		if(n==0) {
			// ans 
			System.out.println(ans);
			return;
		}
		
		if(ans.length()==0 || ans.charAt(ans.length()-1)!='H') { // if last char is not h
			coin(n-1, ans+"H");
		}
		
		coin(n-1, ans+"T");
		
	}

}
