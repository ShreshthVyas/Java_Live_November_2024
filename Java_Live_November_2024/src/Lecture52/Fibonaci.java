package Lecture52;

import java.util.Arrays;

public class Fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
//		int dp[] = new int[n+1];
//		int ans = memo(n,dp);
//		System.out.println(ans);
		
		System.out.println(DpBU(n));
	}

//	private static int rec(int n) {
//		// TODO Auto-generated method stub
//		if(n ==0 || n==1) {
//			return n;
//		}
//		
//		int f1 = rec(n-1);
//		int f2 = rec(n-2);
//		
//		return f1+f2;
//	}
	private static int memo(int n,int dp[]) {//Memoisation  Or DP Top Down
		// TODO Auto-generated method stub
		if(n ==0 || n==1) {
			return n;
		}
		if(dp[n]!=0) {// if already stored directly return
			return dp[n];
		}
		int f1 = memo(n-1,dp);
		int f2 = memo(n-2,dp);
		return dp[n] = f1+f2;// Yaad karna 
	}
	
	private static int DpBU(int n) {
		int dp[] = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		
		for (int i = 2; i < dp.length; i++) {
			int f1 = dp[i-1];
			int f2 = dp[i-2];
			dp[i] = f1+f2;
		}
		System.out.println(Arrays.toString(dp));
		return dp[n];
	}

}
