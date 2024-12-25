package Lecture10;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,-2,4,5,-3,10};
		
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void sort(int[] arr) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < arr.length-1; i++) {
			int min_idx = i;
			
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[min_idx]) {
					min_idx = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[min_idx];
			arr[min_idx] = temp;
			
		}
		
	}

}
