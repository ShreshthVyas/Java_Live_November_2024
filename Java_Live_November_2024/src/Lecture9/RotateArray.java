package Lecture9;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7};
		
		rotate(arr, 4);
		
	}

//	public static void rotate(int[] nums, int k) {
//		
//		k = k% nums.length;
//		
//		for (int i = 1; i <=k; i++) { // perform k rotations
//			
//			int temp = nums[nums.length-1]; //store last element
//			
//			for (int j = nums.length-2; j>=0; j--) { //shift right
//				nums[j+1] = nums[j];
//			}
//			nums[0] =temp;
//		}
//		
////		System.out.println(Arrays.toString(nums));
//	}
	
	public static void rotate(int[] nums, int k) {
		k = k%nums.length;
		
		Reverse(nums, 0, nums.length-1);
		Reverse(nums, 0, k-1);
		Reverse(nums, k, nums.length-1);
		
		
	}
	public static void Reverse(int[] arr , int i ,int j) {
		// TODO Auto-generated method stub
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
