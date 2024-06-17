package Java_day9;

public class ConstructorOverloading {
	
	int x,y,z;
	double d;
	
	//Cont1
	ConstructorOverloading(){
		x=10;
		y=20;
	}

	//Cont2
	ConstructorOverloading(int a, int b){
		x=a;
		y=b;
	}
	
	//Cont3
	ConstructorOverloading(int a, double b){
		x=a;
		d=b;
	}
		
	//Cont4
	ConstructorOverloading(double b, int a){
		x=a;
		d=b;
	}
	
	void display() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(d);
	}
	
		
	public static void main(String[] args) {
		
		ConstructorOverloading co = new ConstructorOverloading(23,3.4);
		
		co.display();

	}

}
