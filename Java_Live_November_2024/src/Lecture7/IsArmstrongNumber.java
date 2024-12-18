package Lecture7;

import java.util.Scanner;

public class IsArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = noOfDigits(n);

		int m = armNum(n,count);
		
		if(n == m) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		
	}

	public static int armNum(int n, int count) {
		// TODO Auto-generated method stub
		
		int ans = 0;
		
		while(n>0) {
			int rem = n%10;
			ans = ans + (int)Math.pow(rem, count);
			n = n/10;
		}
		
		return ans;
	}

	public static int noOfDigits(int n) {
		// TODO Auto-generated method stub
		
		int count =0;
		while(n>0) {
			n= n/10;
			count++;
		}
		
		return count;
	}

}
