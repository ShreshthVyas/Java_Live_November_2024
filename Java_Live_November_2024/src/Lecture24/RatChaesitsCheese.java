package Lecture24;

import java.util.Scanner;

public class RatChaesitsCheese {
	static boolean flag = true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int m = sc.nextInt();
		char board[][] = new char[n][m];
		
		for (int i = 0; i < board.length; i++) {
			String s = sc.next();
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = s.charAt(j);
			}
		}
		int ans[][] = new int[n][m];

		rat(board,ans,0,0,n,m);
		
		if(flag == true) {
			System.out.println("NO PATH FOUND");
		}
		
	}

	public static void rat(char[][] board, int[][] ans, int cr, int cc, int n, int m) {
		// TODO Auto-generated method stub
		if(cr == n-1 && cc==m-1 && board[cr][cc] !='X') {// +ve basecase
			flag = false;
			ans[cr][cc] = 1;
			Display(ans);
			ans[cr][cc] = 0;
			return;
		}
		if(cr<0 || cc<0 || cr>=n ||cc>=m|| board[cr][cc] == 'X') {
			return;
		}
		ans[cr][cc] = 1;
		board[cr][cc] = 'X';
		rat(board, ans, cr+1, cc, n, m); // D
		rat(board, ans, cr-1, cc, n, m); // U
		rat(board, ans, cr, cc+1, n, m); // R
		rat(board, ans, cr, cc-1, n, m); // L
		board[cr][cc] = 'O'; // Backtrack
		ans[cr][cc] = 0;
	}

	public static void Display(int[][] ans) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[i].length; j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
