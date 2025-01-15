package Lecture19;

public class Print_Increasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printInc(10);
	}

//	public static void printInc(int n,int i) {
//		// TODO Auto-generated method stub
//		if(i>n) {
//			return;
//		}
//		
//		System.out.print(i+" ");
//		
//		printInc(n, i+1);
//		
//		
//	}
	public static void printInc(int n) {
		// TODO Auto-generated method stub
		if(n==0) { // base condition
			return;
		}
		printInc(n-1); 
		
		System.out.print(n+" ");
	}

}
