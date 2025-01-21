package Lecture21;

public class mazepath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		int m =3;
		maze(1,1,n,m,"");
	}

	public static void maze(int row, int col, int n, int m, String ans) {
		// TODO Auto-generated method stub
		if(row ==n && col==m) {
			System.out.println(ans);
			return;
		}
		if(row>n || col>m) {
			return;
		}
		
		maze(row+1, col, n, m, ans+"V");
		maze(row, col+1, n, m, ans+"H");
		
	}
	

}
