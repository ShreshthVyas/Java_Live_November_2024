package Lecture54;

import java.util.Arrays;

public class EditDistances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minDistance1(String s, String t) {
		int dp[][] = new int[s.length() + 1][t.length() + 1];
		for (int[] is : dp) {
			Arrays.fill(is, -1);
		}
		return rec(s, t, 0, 0, dp);
	}

	private int rec(String s, String t, int i, int j, int dp[][]) {
		// TODO Auto-generated method stub
		if (i == s.length()) { // return characters left in s
			return t.length() - j;
		}
		if (j == t.length()) { // return characters left in t
			return s.length() - i;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int ans = 0;
		if (s.charAt(i) == t.charAt(j)) {// Do Nothing
			ans = rec(s, t, i + 1, j + 1, dp);
		} else {
			int I = rec(s, t, i + 1, j, dp);
			int R = rec(s, t, i + 1, j + 1, dp);
			int D = rec(s, t, i, j + 1, dp);

			ans = Math.min(I, Math.min(R, D)) + 1;
		}
		return dp[i][j] = ans;
	}

	public int minDistance(String s, String t) {
		int dp[][] = new int[s.length() + 1][t.length() + 1];
		for (int i = 0; i < dp.length; i++) {
			dp[i][0] = i;
		}
		for (int i = 0; i < dp[0].length; i++) {
			dp[0][i] = i;
		}
		
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				int ans = 0;
				if (s.charAt(i-1) == t.charAt(j-1)) {// Do Nothing
					ans = dp[i-1][j-1];
				} else {
					int I = dp[i-1][j];
					int R = dp[i-1][j-1];
					int D = dp[i][j-1];

					ans = Math.min(I, Math.min(R, D)) + 1;
				}
				dp[i][j] = ans;
			}
		}
		
		return dp[dp.length-1][dp[0].length-1];
	}

}
