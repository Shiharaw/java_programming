package java_day13;

public class Test {
	
	//Private 
	private int x1=100;
	private void m1() {
		System.out.println("This is m1 method");
	}
	
	//Default
		int x2=200;
		void m2() {
			System.out.println("This is m2 method");
		}

	//Protected	
		protected int x3=300;
		protected void m3() {
			System.out.println("This is m3 method");
		}	
		
		//Public
		public int x4=400;
		public void m4() {
			System.out.println("This is m4 method");
		}	
	
		
	public static void main(String[] args) {
			
		Test t=new Test();
			
		//Private methods and variables are visible within the class
		t.m1();		
		System.out.println(t.x1);
					
		//Default - Default methods and variables are visible within  the class
		t.m2();		
		System.out.println(t.x2);
			
		//Protected - Protected methods and variables are visible within  the class
		t.m3();		
		System.out.println(t.x3);
			
		//Public- Public methods and variables are visible within  the class
		t.m4();		
		System.out.println(t.x4);

		}

}
