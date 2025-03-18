package Lecture42;

public abstract class Payment {
	
	public abstract void how();
	public abstract void display();
	
	public int transaction() {
		return 1000;
	}
	
	public static void main(String[] args) {
		Payment p = new Payment() {
			@Override
			public void how() {
				// TODO Auto-generated method stub
				System.out.println("Hi from random");
			}

			@Override
			public void display() {
				// TODO Auto-generated method stub
				
			}
		};
		Payment p1 = new Payment() {
			@Override
			public void how() {
				// TODO Auto-generated method stub
				System.out.println("Hi from random");
			}

			@Override
			public void display() {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
