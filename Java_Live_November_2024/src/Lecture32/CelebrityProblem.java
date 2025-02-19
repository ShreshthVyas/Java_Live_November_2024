package Lecture32;

import java.util.Scanner;
import java.util.Stack;

public class CelebrityProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int ans = celeb(arr);
		System.out.println(ans);
	}

	private static int celeb(int[][] arr) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < arr.length; i++) { // Add every candidate to stack
			st.push(i);
		}
		while (st.size() > 1) {
			int a = st.pop();
			int b = st.pop();
			if (arr[a][b] == 1) {
				st.push(b);
			} else {
				st.push(a);
			}
		}
		int c = st.pop();
		for (int i = 0; i < arr.length; i++) {
			if (i == c) {
				continue;
			}
			if (arr[c][i] == 1) {// row c fixed
				return -1;
			}
			if (arr[i][c] == 0) {
				return -1;
			}
		}

		return c;
	}

}
