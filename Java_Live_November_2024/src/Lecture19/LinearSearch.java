package Lecture19;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,2,-3,4,17,11};
		int target  =111;
		
		int ans = ls(0,arr,target);
		System.out.println(ans);
	}

	public static int ls(int i, int[] arr, int target) {
		// TODO Auto-generated method stub
		if(i ==arr.length) { 
			return -1;
		}
		if(arr[i] == target) {
			return i;
		}
		
		return ls(i+1, arr, target);
		
	}

}
