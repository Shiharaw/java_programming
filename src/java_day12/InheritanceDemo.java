package java_day12;

interface Shape{
	
	int length=20;		//final and static
	int width=10;		//final and static
	
	void circle();		//Abstract method - un-implemented
	
	default void sqaure() {		//Default method
		
		System.out.println("This is a sqaure- default method");
		
	}
	
	static void rectangle() {	//Static method
		
		System.out.println("This is a rectangle - static method");
		
	}
	
}



public class InheritanceDemo implements Shape{
	
	public void circle() {
		
		System.out.println("This is circle");
		System.out.println(length);
		System.out.println(width);
		
	}
	
	public static void main(String[] args) {
		
		InheritanceDemo idobj =new InheritanceDemo();
		
		idobj.circle();
		idobj.sqaure();
		
		Shape.rectangle();		//Static methods can directly access
		
		//Shape sh=new Shape();		//Incorrect.Cannot create object of interface
		Shape sh=new InheritanceDemo();	;
		sh.circle();
		sh.sqaure();
		System.out.println(length);
		System.out.println(width);
		

	}

}
