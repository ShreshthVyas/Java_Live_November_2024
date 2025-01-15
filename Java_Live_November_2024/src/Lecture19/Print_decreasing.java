package Lecture19;

public class Print_decreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDec(10);
	}

	public static void printDec(int n) {
		// TODO Auto-generated method stub
		if(n==0) { // base condition
			return;
		}
		System.out.print(n+" "); // small Problem
		printDec(n-1); //recursive call
	}
	

}
