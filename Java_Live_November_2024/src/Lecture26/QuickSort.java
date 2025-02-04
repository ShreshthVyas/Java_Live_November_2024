package Lecture26;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,-1,-3,4,2,8,7,3};
		quicksort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	public static void quicksort(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		if(si>ei) {
			return;
		}
		int pivot = part(arr, si, ei);
		quicksort(arr, si, pivot-1); // left
		quicksort(arr, pivot+1, ei); //right
	}
	public static int part(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		int item = arr[ei];
		int idx = si;
		
		for (int i = si; i < ei; i++) {
			if(arr[i]<item) {
				//swap
				int temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
				idx++;
			}
		}
		int temp = arr[ei];
		arr[ei] = arr[idx];
		arr[idx] = temp;
		
		return idx ;
	}

}
