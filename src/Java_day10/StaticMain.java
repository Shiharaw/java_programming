package Java_day10;

public class StaticMain {

	public static void main(String[] args) {
		
		//1) static methods can access static stuff directly (without objects)
		System.out.println(StaticExample.a);
		//System.out.println(b); //incorrect, bcoz b is non-ststic variable
				
		StaticExample.m1();
		//m2();	//incorrect, bcoz m2 is non-ststic method
				
		//2) static methods can access non-static stuff through objects
				
		StaticExample se=new StaticExample();
		System.out.println(se.b);
		se.m2();
				
		se.m();		
		

	}

}
