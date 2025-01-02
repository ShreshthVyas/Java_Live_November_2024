package Lecture13;

public class TimeComplexity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello"); // O(1)
		System.out.println("Hello"); // O(1)
		System.out.println("Hello"); // O(1)
		System.out.println("Hello"); // O(1)
		System.out.println("Hello"); // O(1)
		System.out.println("Hello"); // O(1)

		int n = 10;

		while (n > 0) { // O(n)

			n--;
		}
		int i = 1;

		while (i <= n) { // O(n)

			i += 2;
		}

		while (i <= n) {

			i += 3;
			i += 2;
		}

		int k = 1;

		while (i <= n) {

			i += k;
		}

		while (i <= n) { // O(logN)

			n = n / 2;
		}

		while (i <= n) { // O(logN base k)

			n = n / k;
		}

		while (i <= n) { // O(logN)

			i = i * 2;
		}

		while (i <= n) { // O(logN base k)

			i = i * k;
		}
		
		for (int j = 0; j < n; j++) {
			for (int a = 0; a < n; a++) {
				//O(n^2)
			}
		}
		
		for (int j = 0; j < n; j++) {
			for (int a = j; a < n; a++) {
				//O(n^2)
			}
		}
		
		for (int j = 0; j < n; j++) {
			for (int a = 0; a <=j; a++) {
				//O(n^2)
			}
		}
		
		for (int j = 0;j*j <=n; j++) {
			//O(sqrtN)
		}
		

		for (int a = 0; a <=n ; a++) {
			for (int b= 1; b <= a*a; b++) {
				for (int c = 0; c <=n/2; c++) {
					// O(n^4)
				}
			}
		}
		
		for (int j = 1; j <=n ; j++) {
			for (int a = 1; a <= n; a+=j) {
				//O(n LogN)
			}
		}
		
		for (int a = n/2; a <=n ; i++) {
			for (int b= 1; b <= n/2; b++) {
				for (int c = 1; c <=n/2; c*=2) {
					// O(N^2 LogN)
				}
			}
		}
		
		// Linear Search - O(N)
		// Binary Search - O(logN)
		// Bubble Sort - O(n^2)
		//Selection Sort - O(n^2)
		//Insertion Sort - O(n^2) 

	}

}
