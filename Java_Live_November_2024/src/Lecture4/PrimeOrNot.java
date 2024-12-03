package Lecture4;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 16;
		boolean flag = false;
		for (int i = 2; i < n; i++) {
			
			if(n%i==0) { 
				flag = true;
			}
		}
		if(flag == true) {
			System.out.println("Not Prime");
		}
		else {
			System.out.println("Prime");
		}
		
	}

}
