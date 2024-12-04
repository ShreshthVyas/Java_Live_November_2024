package Lecture5;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 44;
		
		int ans = 0;
		int mul = 1;
		while(n>0) {
			int rem = n%2;
			ans = ans + rem*mul;
			mul = mul*10;
			n = n/2;
		}
		
		System.out.println(ans);
	}

}
