package Lecture19;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int ans = fact(n);
		System.out.println(ans);
	}

	public static int fact(int n) {
		// TODO Auto-generated method stub
		if(n==1) {
			return 1;
		}
		
		int fact_of_n_minus_one = fact(n-1); 
		
		return fact_of_n_minus_one*n;		
	}
	

}
