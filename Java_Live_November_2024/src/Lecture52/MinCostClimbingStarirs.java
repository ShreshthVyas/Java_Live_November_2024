package Lecture52;

public class MinCostClimbingStarirs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minCostClimbingStairs(int[] cost) {
		int onestep = rec(cost,0);
		int twostep = rec(cost,1);
		return Math.min(onestep, twostep);
	}

	private int rec(int[] cost, int i) {
		// TODO Auto-generated method stub
		if(i>=cost.length) {
			return 0;
		}
		int f1 = rec(cost, i+1);//One step
		int f2 = rec(cost, i+2);//Two step
		return Math.min(f1, f2) + cost[i];
	}

}
