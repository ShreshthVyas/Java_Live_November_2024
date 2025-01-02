package Lecture13;

import java.util.Scanner;

public class BookAllocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
			int nob = sc.nextInt();
			int nos = sc.nextInt();
			
			int book[] = new int[nob];
			int sum = 0;
			for (int i = 0; i < book.length; i++) {
				book[i] = sc.nextInt();
				sum+= book[i];
			}
			
			int ans= binarysearch(book,nos,sum);
			System.out.println(ans);
			t--;
		}
	}

	public static int binarysearch(int[] book, int nos, int sum) {
		// TODO Auto-generated method stub
		int lo = 1;
		int hi = sum;
		int ans = 0;
		
		while(lo<=hi) {
			int mid = (lo+hi) /2;
			if(isitpossible(book,nos,mid)) {
				ans = mid;
				hi = mid-1;
			}
			else {
				lo = mid+1;
			}
		}
		return ans;
	}

	public static boolean isitpossible(int[] book, int nos, int mid) {
		// TODO Auto-generated method stub
		int s = 1;
		int no_pages_read = 0;
		
		for (int i = 0; i < book.length;) {
			if(no_pages_read+book[i]<=mid) {
				no_pages_read =no_pages_read+book[i];
				i++; // only go to next book if read 
			}
			else {
				s++;
				no_pages_read = 0;
			}
			if(s>nos) {
				return false;
			}
			
		}
		return true;
	}

}
