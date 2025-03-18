package Lecture42;

import java.util.ArrayList;

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> list =  new ArrayList<>();
		Integer arr[] = {1,2,3,4,5};
		String arr1[] = {"A" , "BCD" , "EFG" ,"lkj"};
		Display(arr);
		Display(arr1);
	}
	
	public static <T>void Display(T arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}

}
