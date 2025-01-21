package Lecture21;

public class BalancedParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		print(n,n,"");
	}

	public static void print(int op, int cl, String ans) {
		// TODO Auto-generated method stub
		if(op<0 || cl<0) { //-ve base case
			return;
		}
		if(op == 0 && cl ==0) {
			System.out.println(ans);
			return;
		}
		
		print(op-1, cl, ans+"(");
		
		if(op<cl) { // valid 
			print(op, cl-1, ans+")");
		}
		
		
	}

}
