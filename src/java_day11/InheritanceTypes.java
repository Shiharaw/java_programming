package java_day11;

class A{
	
	int a=100;
	int x;
	void display() {
		System.out.println(a+" and "+x);
		}
}

//Single and multi level inheritance
class B extends A{
	
	int b=200;
	int y;
	void show() {
		System.out.println(b+" and "+y);
	}
}


class C extends B{
	
	int c=300;
	int z;
	void print() {
		System.out.println(c+" and "+z);
	}
}


public class InheritanceTypes {

	public static void main(String[] args) {
		
		B bobj= new B();
		
		System.out.println(bobj.a);
		System.out.println(bobj.b);
		bobj.x=20;
		bobj.y=40;
		
		bobj.display();
		bobj.show();
		
		C cobj= new C();
		
		System.out.println(cobj.a);
		System.out.println(cobj.b);
		System.out.println(cobj.c);
		cobj.x=1;
		cobj.y=2;
		cobj.z=3;
		cobj.display();
		cobj.show();
		cobj.print();
		

	}

}
