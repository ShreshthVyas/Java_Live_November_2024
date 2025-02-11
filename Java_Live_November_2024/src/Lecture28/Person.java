package Lecture28;

public class Person {

	private int age;
	String name  = "random";
	
	static int count =0;
	
	public Person() {
		
	}
//	public static void greet(String name) {
//		count++;
//		System.out.println(name + " says hi to" + name);
//	}
//	static {
//		System.out.println("hello from static");
//	}
	public void greet() {
		age++;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws Exception {
		try {
			if(age<0) {
			throw new Exception("pagal age negetive nahi h");
			}
			else{
				this.age = age;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			System.out.println("Hi from finally");
		}
	}
	
	
	

}
