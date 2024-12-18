package Lecture7;

public class Swap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int brr[] = {6,7,8,9,10};
		
		System.out.println(arr[1]+" "+ brr[1]);
		swap(arr,brr);
		System.out.println(arr[1]+" "+ brr[1]);
	}

	public static void swap(int[] arr, int[] brr) {
		// TODO Auto-generated method stub
		int temp[] = arr;
		arr = brr;
		brr = temp;
		
	}

}
