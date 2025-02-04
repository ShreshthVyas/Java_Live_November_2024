package Lecture26;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,1,3,2,-4,11};
		int ans[] = mergesort(arr,0,arr.length-1);
		
		System.out.println(Arrays.toString(ans));
		
	}

	public static int[] mergesort(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		if(si == ei) {
			int temp[] = new int[1];// Array for single element
			temp[0] = arr[si];
			return temp;
		}
		
		int mid = (si+ei)/2;
		int fh[] = mergesort(arr, si, mid);
		int sh[] = mergesort(arr, mid+1, ei);
		
		return merge_two_sorted_arrays(fh, sh);
		
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
