package Lecture42;

public interface StackI {

	public void push();
	public void pop();
	public void peek();
	
//	protected int a = 10;
	
	
	
	//java 8
	static void f() {
		System.out.println("Hello from static ");
	}
	
	default void f1() {
		
	}
	
	//java 9
		private void add() {
			System.out.println("Hello");
		}
		
	public static void main(String[] args) {
		StackI.f();
	}
	
}
