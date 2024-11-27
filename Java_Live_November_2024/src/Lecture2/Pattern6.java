package Lecture2;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int row = 1;
		int nst = n;
		int nsp =0;
		
		while(row<=n) {
			int csp =0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst =0;
			
			while(cst<nst) {
				System.out.print("* ");
				cst++;
			}
			
			System.out.println();
			row++;
			nst--;
			nsp+=2;
			
		}
	}

}
