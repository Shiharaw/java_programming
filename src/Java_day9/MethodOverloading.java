package Java_day9;

public class MethodOverloading {
	int x,y, z;
	double d;
	
	//Method 1
	void sum() {
		x=10;
		y=20;
		System.out.println(x+y);
	}
	
	
	//Method 2
	void sum(int a, int b) {
		x=a;
		y=b;
		System.out.println(x+y);
	}
	
	
	//Method 3
	void sum(int a, double b) {
		x=a;
		d=b;
		System.out.println(x+d);
	}
	
	
	//Method 4
	void sum(double b, int a) {
		x=a;
		d=b;
		System.out.println(x+d);
	}
	
	
	
	public static void main(String[] args) {
		
		MethodOverloading mo= new MethodOverloading();
		
		mo.sum(); 			//m1
		mo.sum(100, 200); 	//m2
		mo.sum(10.5, 25);	//m4
		mo.sum(30, 1.5);	//m3

	}

}
