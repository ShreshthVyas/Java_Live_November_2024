package Lecture7;

public class Swap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int brr[] = {6,7,8,9,10};
		
		System.out.println(arr[1]+" "+ brr[1]);
		swap(arr,brr);
		System.out.println(arr[1]+" "+ brr[1]);
	}

	public static void swap(int[] crr, int[] drr) {
		// TODO Auto-generated method stub
		int temp = crr[1];
		crr[1] = drr[1];
		drr[1] = temp;
		
	}

}
