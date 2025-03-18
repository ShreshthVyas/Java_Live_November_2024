package Lecture42;

public class Car{  //<T> implements Comparable<Car> {
	
	int price;
	String name;
	int speed;
	
	public Car(int p,String n, int s) {
		this.price = p;
		this.name = n;
		this.speed = s;
	}
	
	@Override
	public String toString() {
		return  "Name:" + this.name + ", Price:" + this.price + ", Speed:" +this.speed;
	}

//	@Override
//	public int compareTo(Car o) {
//		// TODO Auto-generated method stub
////		return this.name.compareTo(o.name);
////		return this.price - o.price;
//		return o.speed - this.speed;
//	}
}
