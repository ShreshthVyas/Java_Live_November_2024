package Lecture27;

public class PowerLogN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(3,4));
	}

	public static int pow(int a, int b) {
		// TODO Auto-generated method stub
		if(b==1) {
			return a;
		}
		int t = pow(a,b/2);
		t = t*t;
		if(b%2 !=0) {
			t = t*a;
		}
		return t;
	}

}
