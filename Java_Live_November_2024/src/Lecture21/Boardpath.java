package Lecture21;

public class Boardpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		int m =4;
		board(0,n,"",m);
	}

	public static void board(int st, int end, String ans,int m) {
		// TODO Auto-generated method stub
		if(st == end) {
			System.out.println(ans);
			return;
		}
		if(st>end) {
			return;
		}
		for (int i = 1; i <=m; i++) {
			board(st+i, end, ans+i, m);
		}
		
	}
//	public static void board(int st, int end, String ans) {
//		// TODO Auto-generated method stub
//		if(st == end) {
//			System.out.println(ans);
//			return;
//		}
//		if(st>end) {
//			return;
//		}
//		board(st+1, end, ans+"1");
//		board(st+2, end, ans+"2");
//		board(st+3, end, ans+"3");
//		
//	}

}
