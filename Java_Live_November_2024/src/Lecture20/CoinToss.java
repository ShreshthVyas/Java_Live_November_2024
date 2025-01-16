package Lecture20;

import java.util.Scanner;

public class CoinToss {

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
		
		coin(n-1,ans+"T");
		coin(n-1, ans+"H");
	}

}
