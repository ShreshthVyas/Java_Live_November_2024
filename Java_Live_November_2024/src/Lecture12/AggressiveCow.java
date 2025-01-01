package Lecture12;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nos = sc.nextInt();
		int noc = sc.nextInt();
		int pos[] = new int[nos];
		
		for (int i = 0; i < pos.length; i++) {
			pos[i] = sc.nextInt();
		}
		
		int ans = Binarysearch(noc,pos);
		System.out.println(ans);
	}

	public static int Binarysearch(int noc, int[] pos) {
		// TODO Auto-generated method stub
		Arrays.sort(pos);
		int lo = 1;
		int hi = pos[pos.length-1] - pos[0];
		int ans =-1;
		while(lo<=hi) {
			int mid = (lo + hi) /2;
			if(isitpossible(noc,pos,mid)) {
				ans =mid;
				lo = mid+1;
			}
			else{
				hi = mid -1;
			}
		}
		return ans;
	}

	public static boolean isitpossible(int noc, int[] pos, int mid) {
		// TODO Auto-generated method stub
		int li = 0;
		int cpsf = 1; //cows placed so far
		
		for (int i = 1; i < pos.length; i++) {
			if(pos[i] - pos[li]>= mid) {
				li =i;
				cpsf++;
			}
			if(cpsf == noc) {
				return true;
			}
		}
		
		return false;
	}

}
