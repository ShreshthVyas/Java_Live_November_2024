package Lecture34;

import java.util.ArrayList;

public class MethodOverridingDemo {
	
	@Override
	public String toString() {
		return "MethodOveriding";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverridingDemo mo  = new MethodOverridingDemo();
		System.out.println(mo);
		System.out.println(mo.toString());
	}

}
