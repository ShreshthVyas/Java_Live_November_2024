package Lecture26;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1,5,9};
		int brr[] = { 2, 3, 8, 10};
		int ans[] = merge_two_sorted_arrays(arr, brr);
		
		System.out.println(Arrays.toString(ans));
	}
	
	public static int[] merge_two_sorted_arrays(int arr[],int brr[]) {
		int i =0;
		int j =0;
		int k =0;
		int ans[] = new int[arr.length+brr.length];
		
		while(i<arr.length && j< brr.length) {
			if(arr[i]<brr[j]) {
				ans[k] = arr[i];
				i++;
			}
			else {
				ans[k] = brr[j];
				j++;
			}
			k++;
		}
		
		while(i<arr.length) { // j gets to the end of brr
			ans[k] = arr[i];
			i++;k++;
		}
		while(j<brr.length) { // i gets to the end of arr
			ans[k] = brr[j];
			j++;k++;
		}
		
		return ans;
	}

}
