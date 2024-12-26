package Lecture11;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,5,6,11,13,15,19};
		
		int idx = binarysearch(arr,11);
		System.out.println(idx);
		
	}

	public static int binarysearch(int[] arr, int target) {
		// TODO Auto-generated method stub
		int i =0;
		int j = arr.length-1;
		
		while(i<=j) {
			int mid = (i+j)/2;
			if(arr[mid] == target) {
				return mid;
			}
			else if(arr[mid]>target) {
				j = mid -1;
			}
			else {
				i = mid+1;
			}
		}
		
		return -1;
	}

}
