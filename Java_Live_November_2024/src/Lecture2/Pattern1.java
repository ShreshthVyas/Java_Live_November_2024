package Lecture2;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n  =5;
		int row = 1;
		int nst = 1;
		
		while(row<=n) {
			int cst =0;
			
			while(cst<nst) {
				System.out.print("* ");
				cst = cst+1;
			}
			
			// prep
			System.out.println();
			row = row+1;
			nst = nst+1;
		}
	}

}
