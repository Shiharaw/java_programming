package Java_day9;

public class ConstructorDemo {

	int x,y;
	String s;
	
	//Default Constructor
	/*
	 ConstructorDemo(){
		x=100;
		y=200;
		s="Welcome";
	}
	*/
	
	//Parameterized Constructor
	ConstructorDemo(int a, int b, String str ){
		
		x=a;
		y=b;
		s=str;
	}
	
	void displayData() {
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(s);
	}
	
	
	
	
	public static void main(String[] args) {
		
		//ConstructorDemo cd1= new ConstructorDemo(); 	// Invoke Default Constructor
		ConstructorDemo cd1= new ConstructorDemo(10,20,"Welcome");		// Invoke Parameterized Constructor
		
		cd1.displayData();

	}

}
