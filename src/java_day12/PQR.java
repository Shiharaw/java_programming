package java_day12;

public class PQR extends MNO implements ABC,XYZ {
	
	@Override
	public void m2() {
		System.out.println("m2 from XYZ interface");
		System.out.println(y);
		
	}

	@Override
	public void m1() {
		System.out.println("m1 from ABC interface");
		System.out.println(x);
		
	}

	public static void main(String[] args) {
		
		PQR obj=new PQR();
		obj.m1();
		obj.m2();
		
		obj.m3();
		
		
		

	}

	

}
