package Lecture54;

import java.util.Arrays;

public class MinimumFallingPathSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minFallingPathSum(int[][] matrix) {
		int dp[][] = new int[matrix.length + 1][matrix[0].length + 1];
		for (int[] is : dp) {
			Arrays.fill(is, -20001);
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < matrix[0].length; i++) {
			ans = Math.min(ans, rec(matrix, 0, i, dp));
		}
		return ans;
	}

	private int rec(int[][] matrix, int cr, int cc, int dp[][]) {
		// TODO Auto-generated method stub
		if (cc < 0 || cc >= matrix[0].length) {// -ve base case
			return Integer.MAX_VALUE;
		}
		if (cr == matrix.length - 1) {// +ve base case
			return matrix[cr][cc];
		}
		if (dp[cr][cc] != -20001) {
			return dp[cr][cc];
		}
		int ans = Integer.MAX_VALUE;
		
		for (int i = 0; i < matrix[0].length; i++) {
			if(i!=cc) { 
				ans = Math.min(ans, rec(matrix, cr+1 ,i, dp));
			}
		}
		

		return dp[cr][cc] = matrix[cr][cc] + ans;
	}

}
