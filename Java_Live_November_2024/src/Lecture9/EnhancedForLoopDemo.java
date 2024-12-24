package Lecture9;

public class EnhancedForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1,2,3,4,5,6,7};
		
		for (int i : arr) {
			System.out.println(i);
		}
		
		char ch[] = {'a','b','c','d'};
		
		for(char c : ch) {
			System.out.println(c);
		}
	}

}
