package Lecture6;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b =20;
		System.out.println(a);
		System.out.println(b);
		swap(a,b);
		System.out.println(".....");
		System.out.println(a);
		System.out.println(b);
	}

	public static void swap(int a, int b) {
		// TODO Auto-generated method stub
		int temp = a;
		a =b;
		b=temp;
		
	}

}
