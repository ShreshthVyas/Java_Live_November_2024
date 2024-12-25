package Lecture10;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {6,-1,5,4,2,12,1,3};
		
		sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}

	public static void sort(int[] arr) {
		// TODO Auto-generated method stub
		
		for (int pass = 1; pass < arr.length; pass++) { // After every pass one element reaches its correct position
			for (int i = 0; i < arr.length-pass; i++) {
				if(arr[i]>arr[i+1]) { // swap
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}	
		}
		
	}

}
