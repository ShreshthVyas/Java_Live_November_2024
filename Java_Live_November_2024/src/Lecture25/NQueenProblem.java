package Lecture25;

public class NQueenProblem {
	
	public static void main(String[] args) {
		int n = 5;
		boolean board[][] = new boolean[n][n];
		rec(board,n,0);
		
	}

	public static void rec(boolean[][] board, int q, int row) {
		// TODO Auto-generated method stub
		if(q==0) {
			Display(board);
			return;
		}
		
		for (int col = 0; col < board.length; col++) {
			if(isValid(board , row,col)) {
				board[row][col] = true; // queen placed
				rec(board, q-1, row+1);
				board[row][col] = false; //backtracking
			}
		}
	}

	

	public static boolean isValid(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub
		for(int i = row;i>=0;i--) { // vertically up
			if(board[i][col]) {
				return false;
			}
		}
		
		int r = row;int c = col;
		while(r>=0 && c>=0) { //upper left diagonal
			if(board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
		
		r =row;c =col;
		while(r>=0 && c<board.length) { //upper right diagonal
			if(board[r][c]) {
				return false;
			}
			r--;
			c++;
		}
		
		return true;
	}

	public static void Display(boolean[][] board) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[i][j]) {
					System.out.print("q");
				}
				else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}
