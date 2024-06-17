package Java_day10;

public class StaticExample {
	
	static int a=10; //static variable
	int b=20;	//non-static variable
	
	//static 
	static void m1() {
		System.out.println("This is a static method");
	}
	
	//non-static
	void m2() {
		System.out.println("This is a non-static method");
	}
	
	//non-static
	void m() {
		System.out.println(a);
		System.out.println(b);
		
		m1();
		m2();
	}

	
	
	public static void main(String[] args) {
		
		//1) static methods can access static stuff directly (without objects)
		System.out.println(a);
		//System.out.println(b); //incorrect, bcoz b is non-ststic variable
		
		m1();
		//m2();	//incorrect, bcoz m2 is non-ststic method
		
		//2) static methods can access non-static stuff through objects
		
		StaticExample se=new StaticExample();
		System.out.println(se.b);
		se.m2();
		
		se.m();
		

	}

}
