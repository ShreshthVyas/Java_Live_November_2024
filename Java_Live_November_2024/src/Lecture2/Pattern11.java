package Lecture2;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int nst =1;
		int nsp = n-1;
		
		while(row<=n) {
			 // spaces
			int csp = 0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			
			// stars
			int cst =0;
			while(cst<nst) {
				if(cst%2==0) {
					System.out.print("* ");
				}
				else {
					System.out.print("! ");
				}
				cst++;
			}
			
			System.out.println();
			row++;
			nsp--;
			nst+=2;
			
		}
	}

}
