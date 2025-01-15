package Lecture19;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans  = pow(5,3);
		System.out.println(ans);
	}

	public static int pow(int a, int b) {
		// TODO Auto-generated method stub
		if(b==1) {
			return a;
		}
		
		int t = pow(a,b-1);
		return a*t;
	}

}
