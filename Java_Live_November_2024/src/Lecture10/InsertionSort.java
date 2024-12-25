package Lecture10;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 7,6,1,3,-3,2};
		
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void sort(int[] arr) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i < arr.length; i++) {
			
			int temp = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>temp) {
				arr[j+1] = arr[j];
				j--;
			}
			j= j+1;
			arr[j] = temp;
			
		}
		
	}

}
