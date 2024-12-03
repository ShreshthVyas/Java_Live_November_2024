package Lecture4;

public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 11;
		boolean flag = false;
		for (int i = 2; i < n; i++) {
			if(n%i==0) { 
				flag = true;
				break;
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
