package Lecture11;

public class MaxSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) { // starting point
			int sum = arr[i];
			max = Math.max(max, sum);
			for (int j = i+1; j < arr.length; j++) {// ending point
				sum+= arr[j];
				max = Math.max(max, sum);
			}
		}
		
		System.out.println(max);
	}

}
