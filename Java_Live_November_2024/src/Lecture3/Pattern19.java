package Lecture3;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row =1;
		int nst1 = (n+1)/2;
		int nsp =-1;
		int nst2 = (n+1)/2;
		
		while(row<=n) {
			
			int cst1 = 0;
			if(row==1 || row==n) {
				cst1++;
			}
			while(cst1<nst1) {
				System.out.print("* ");
				cst1++;
			}
			
			int csp = 0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			
			int cst2 = 0;
//			if(row ==1 || row ==n) {
//				cst2++;
//			}
			while(cst2<nst2) {
				System.out.print("* ");
				cst2++;
			}
			System.out.println();
			if(row< (n+1)/2) {
				nst1--;
				nst2--;
				nsp+=2;
			}
			else {
				nst1++;
				nst2++;
				nsp-=2;
			}
			row++;
		}
	}

}
