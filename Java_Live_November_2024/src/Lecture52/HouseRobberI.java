package Lecture52;

public class HouseRobberI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public  int robTD(int[] nums) {
		int dp[] = new int[nums.length];
		for (int i = 0; i < dp.length; i++) {
			dp[i] = -1;// default value that becomes -1
		}
		return rec(nums, nums.length - 1, dp);
	}

	private int rec(int[] nums, int i, int dp[]) {
		// TODO Auto-generated method stub
		if (i < 0) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int rob = nums[i] + rec(nums, i - 2, dp);
		int didnotrob = rec(nums, i - 1, dp);

		return dp[i] = Math.max(rob, didnotrob);
	}
//	private int rec(int[] nums, int i) {
//		// TODO Auto-generated method stub
//		if(i<0) {
//			return 0;
//		}
//		int rob = nums[i] + rec(nums, i-2);
//		int didnotrob = rec(nums, i-1);
//		
//		return Math.max(rob, didnotrob);
//	}

	public int robBU(int[] nums) {
		if(nums.length ==1) {
			return nums[0];
		}
		int dp[] = new int[nums.length];
		dp[0] = nums[0];
		dp[1] = Math.max(nums[0], nums[1]);
		
		for (int i = 2; i < dp.length; i++) {
			int rob = nums[i] + dp[i-2];
			int didnotrob = dp[i-1];
			dp[i] = Math.max(rob, didnotrob);
		}
		
		return dp[dp.length-1];
		
	}

}
