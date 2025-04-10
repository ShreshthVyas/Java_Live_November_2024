package Lecture53;

import java.util.Arrays;

public class CoinChanges2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int change1(int amount, int[] coins) {
		int dp[][] = new int[amount + 1][coins.length + 1];
		for (int[] is : dp) {
			Arrays.fill(is, -1);
		}
		return rec(amount, coins, 0, dp);
	}

	private int rec(int amount, int[] arr, int i, int dp[][]) {
		// TODO Auto-generated method stub
		if (amount == 0) {// 1 way found or +ve base case
			return 1;
		}
		if (i == arr.length) {// NO way found or -ve base case
			return 0;
		}
		if (dp[amount][i] != -1) {
			return dp[amount][i];
		}
		int inc = 0;
		int exc = 0;
		if (amount >= arr[i]) {
			inc = rec(amount - arr[i], arr, i, dp);
		}
		exc = rec(amount, arr, i + 1, dp);
		return dp[amount][i] = inc + exc;
	}

	public int change(int amount, int[] coins) {
		int dp[][] = new int[amount + 1][coins.length + 1];

		for (int i = 0; i < dp[0].length; i++) { // fill )th row with 1
			dp[0][i] = 1;
		}
		
		for (int amnt = 1; amnt < dp.length; amnt++) { // row
			for (int i = 1; i < dp[0].length; i++) {
				int inc = 0; int exc = 0;
				if (amnt >= coins[i-1]) {//inc
					inc = dp[amnt - coins[i-1]][i];
				}
				exc = dp[amnt][i-1];
				dp[amnt][i] = inc + exc;	
			}
		}
		
		return dp[dp.length-1][dp[0].length-1];

	}

}
