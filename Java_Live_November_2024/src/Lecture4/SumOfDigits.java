package Lecture4;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 57890;
		
		int sum = 0;
		
		while(n>0) {
			int rem = n%10; // gets the last digit
			sum = sum+rem;
			n = n/10; // drops last digit from n
		}
		
		System.out.println(sum);
	}

}
