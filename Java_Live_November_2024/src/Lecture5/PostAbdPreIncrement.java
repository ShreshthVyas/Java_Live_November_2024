package Lecture5;

public class PostAbdPreIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p = 10;
//		System.out.println(p++);
//		
//		System.out.println(p);
//		
//		System.out.println(++p);
		
		int a =12;
		
		int b = ++p + a++ + p--;
		
		System.out.println(a+ " " + b + " "+ p);
		
		
//		++p;
//		System.out.println(p);
		
	}

}
