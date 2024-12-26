package Lecture11;

public class KadanesAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int maxSubArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
			sum+= arr[i];
			max = Math.max(max, sum);
			if(sum<0) {
				sum =0; // reset the starting point
			}
		}
        
        return max;
    }

}
