package Lecture34;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(10,20));
		System.out.println(add(10,20,30));
		
		System.out.println(add(10,20,200,90,89));
	}
	
//	public static int add(int a, int b) {
//		return a+b;
//	}
//	public static int add(int a, int b,int c) {
//		return a+b+c;
//	}
//	public static double add(int a, int b,double c) {
//		return a+b+c;
//	}
	
	public static int add(int a,int... args) {
		int arr[] = args;
		int sum =0;
		for (int i = 0; i < arr.length; i++) {
			sum+= arr[i];
		}
		return sum;
		
	}
	
	
	

}
