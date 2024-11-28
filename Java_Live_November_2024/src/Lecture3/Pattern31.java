package Lecture3;

public class Pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int row =1;
		int nst = n;
		
		while(row<=n) {
			int cst =0;
			int val =n;
			while(cst<nst) {
				if(val == row) {
					System.out.print("* ");
				}
				else {
					System.out.print(val + " ");
				}
				
				val--;
				cst = cst +1;
			}
			
			System.out.println();
			
			row = row+1;
		}
	}

}
