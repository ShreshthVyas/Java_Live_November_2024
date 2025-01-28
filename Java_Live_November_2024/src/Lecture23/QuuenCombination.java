package Lecture23;

public class QuuenCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int q =2;
		boolean board[] = new boolean[n];
		rec(0,2,board,"",0);
	}

	public static void rec(int qpsf, int tq, boolean[] board, String ans,int si) {
		// TODO Auto-generated method stub
		if(qpsf == tq) {
			System.out.println(ans);
			return;
		}
		
		for (int i = si; i < board.length; i++) {
			if(board[i] == false) {
				board[i] = true; 
				rec(qpsf+1,tq,board,ans+"q"+qpsf+"b"+i,i+1);
				board[i] = false; // backtracking
			}
		}
	}

}
