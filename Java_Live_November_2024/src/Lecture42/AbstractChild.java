package Lecture42;

public class AbstractChild extends AbstractclassDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChild ac = new AbstractChild();
		ac.random();
		ac.random2();
		ac.random3();
	}

	@Override
	public void random() {
		// TODO Auto-generated method stub
		System.out.println("Hi from random");
	}

	@Override
	public void random2() {
		// TODO Auto-generated method stub
		System.out.println("Hi from random2");
	}

}
