package java_day11;

public class Animal {
	
	String color ="white";
	
	void eat() {
		System.out.println("eating......");
	}
}


class Dog extends Animal{
	
	String color ="black";
	
	void display_color() {
		System.out.println(super.color);
	}
	
	void eat() {
		System.out.println("eating bread");
		super.eat();
	}
	
}
