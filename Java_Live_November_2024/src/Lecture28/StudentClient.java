package Lecture28;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(10,"random");
		
//		Student s1 = new Student();
//		Student s2 =  new Student(10);
//		s.id =10;
//		s.name ="Random";
		s.greet("Shreshth");
//		System.out.println(s.id + " " + s.name);
		
		Student s1 = new Student(20,"random2");
		s1.greet("Shreshth");
		
	}

}
