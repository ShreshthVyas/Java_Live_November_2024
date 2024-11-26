package Lecture1;

public class Greatest_of_three {
	
	public static void main(String[] args) {
		int a = 1000;
		int b = 30;
		int c = 100;
		
		if((a>b)  && (a>c)) {
			System.out.println("a is greatest");
		}
		else {
			if(b>c) {
				System.out.println("b is greatest");
			}
			else {
				System.out.println("c is greatest");
			}
		}
	}
}
