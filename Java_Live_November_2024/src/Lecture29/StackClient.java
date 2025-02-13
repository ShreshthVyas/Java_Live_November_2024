package Lecture29;

public class StackClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack s =  new Stack(6);
		System.out.println(s.isEmpty());
		System.out.println(s.isFull());
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		
		System.out.println(s.isEmpty());
		System.out.println(s.isFull());
		
//		s.push(70);
		s.pop();
		s.pop();
		
		s.Display();
		
		System.out.println(s.peek());
		
		System.out.println(s.length());
		
	}

}
