package Lecture55;

import java.util.Arrays;

public class WineProblem {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,6,2,5};
//		Integer dp[][] = new Integer[arr.length+1][arr.length+1];
//		int ans = rec(arr,0,arr.length-1,1,dp);
		
		BU(arr);
//		System.out.println(ans);
		
	}

	private static int rec(int[] arr, int i, int j, int year,Integer dp[][]) {
		// TODO Auto-generated method stub
		if(i>j) {
			return 0;
		}
		if(dp[i][j]!=null) {
			return dp[i][j];
		}
		int left = arr[i]* year  + rec(arr, i+1, j, year+1,dp);
		int right = arr[j]* year  + rec(arr, i, j-1, year+1,dp);
		
		return dp[i][j] = Math.max(left, right);
	}
	
	
	private static int BU(int arr[]) {
		int dp[][] = new int[arr.length][arr.length];
		int year = arr.length;
		for (int i = 0; i < dp.length; i++) { // fill the diagonal for last year
			dp[i][i] = arr[i] * year;
		}
		year --;
		
		for (int d = 1; d < dp.length; d++) {
			for (int j = d; j < dp.length; j++) {
				int i = j-d;
				int left = arr[i]* year  + dp[i+1][j];
				int right = arr[j]* year  + dp[i][j-1];
				dp[i][j] = Math.max(left, right);
			}
			year--;
		}
		
		
		for (int[] is : dp) {
			System.out.println(Arrays.toString(is));
		}
		
		return dp[0][dp[0].length-1];
		
	}
	
	

}
