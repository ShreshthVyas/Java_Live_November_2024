package Lecture28;

public class Student {
	
	int id;
	String name;
	
//	public Student() {
//		
//	}
	public Student(int id,String name) {
		this.id = id;
		this.name = name;
	}
//	public Student(int i) {
//		// TODO Auto-generated constructor stub
//		id =i;
//	}
	public void greet(String name) {
		System.out.println(this.name + " says hi to" + name);
	}
}
