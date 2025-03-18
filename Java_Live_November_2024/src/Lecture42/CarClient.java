package Lecture42;

import java.util.Arrays;
import java.util.Comparator;


public class CarClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car arr[] = new Car[5];
		
		arr[0] = new Car(100000,"Nano" ,100);
		arr[1] = new Car(600000,"WagonR" ,120);
		arr[2] = new Car(10000000,"Rangerover" ,200);
		arr[3] = new Car(1200000,"Virtus" ,140);
		arr[4] = new Car(5000000,"Fortuner" ,160);
		
//		sort(arr);
		
		Arrays.sort(arr, new Comparator<Car>() {

			@Override
			public int compare(Car o1, Car o2) {
				// TODO Auto-generated method stub
//				return o1.price-o2.price;
				return o1.name.compareTo(o2.name);
			}
			
		});
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}

//	private static <T extends Comparable<T>>void sort(Car[] arr) {
//		// TODO Auto-generated method stub
//		
//		for (int pass = 1; pass < arr.length; pass++) { // After every pass one element reaches its correct position
//			for (int i = 0; i < arr.length-pass; i++) {
//				if(arr[i].compareTo(arr[i+1])>0) { // swap
//					Car temp = arr[i];
//					arr[i] = arr[i+1];
//					arr[i+1] = temp;
//				}
//			}	
//		}
//		
//	}

}
