package Lecture27;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primesieve(1000);
		
	}

	public static void primesieve(int n) {
		// TODO Auto-generated method stub
		boolean arr[] =new boolean[n+1];
		arr[0] =true;
		arr[1] =true;
		
		for (int i = 2; i*i <= n; i++) { //check for prime 
			if(arr[i] == false) {
				for (int j = 2; i*j < arr.length; j++) { // mark multiples of all prime
					arr[i*j] = true;
				}
			}
		}
		
		for (int i = 2; i < arr.length; i++) {
			if(arr[i] == false) {
				System.out.print(i+" ");
			}
		}
		
	}

}
