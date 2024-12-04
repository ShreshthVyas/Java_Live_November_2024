package Lecture5;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 110011;
		int ans = 0;
		int mul = 1;
//		while(n>0) {
//			int rem = n%10;
//			ans += rem*mul;
//			mul = mul*2;
//			n= n/10;
//		}
		int place =0;
		while(n>0) {
			int rem = n%10;
			ans += rem * Math.pow(2, place);
			place++;
			n= n/10;
		}
		
		System.out.println(ans);
	}

}
