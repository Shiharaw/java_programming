package java_day13;

public class TestMain {

	public static void main(String[] args) {
		
		Test t=new Test();
		
		//Private methods and variables are not visible
		/*
		t.m1();		
		System.out.println(t.x1);
		*/
		
		//Default - Default methods and variables are visible within the package
		t.m2();		
		System.out.println(t.x2);
		
		//Protected - Protected methods and variables are visible within the package
		t.m3();		
		System.out.println(t.x3);
		
		//Public- Public methods and variables are visible within the package
		t.m4();		
		System.out.println(t.x4);

	}

}
