package Lecture14;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[][] = {{1,2},{4,5,6},{7}};
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][];
		
		for (int i = 0; i < arr.length; i++) {
			int m = sc.nextInt();
			int temp[] =new int[m];
			arr[i] = temp;
		}
		
		
		
	}

}
