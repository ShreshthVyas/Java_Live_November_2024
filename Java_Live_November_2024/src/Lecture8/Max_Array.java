package Lecture8;

public class Max_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, -4, 5, 10, 18, 2 };

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
//			if(arr[i]> max) {
//				max =  arr[i];
//			}
			max = Math.max(max, arr[i]);
		}

		System.out.println(max);
	}

}
