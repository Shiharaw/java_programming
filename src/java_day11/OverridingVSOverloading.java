package java_day11;

class ABC{
	
	void m1(int a) {
		System.out.println(a);
	}
	
	void m2(int b) {
		System.out.println(b);
	}
}

class XYZ extends ABC{
	//XYZ contains 3 methods.(single m1 method and 2 m2 methods)
	
	void m1(int a) {		//Override method
		System.out.println(a*a);
	}
	
	void m2(int a, int b) {		//Overload method
		System.out.println(a+b);
	}
}



public class OverridingVSOverloading {

	public static void main(String[] args) {
		
		XYZ xyz =new XYZ();
		xyz.m1(100);
		xyz.m2(200);
		xyz.m2(100, 200);
		

	}

}
