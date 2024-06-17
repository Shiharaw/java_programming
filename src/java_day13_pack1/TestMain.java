package java_day13_pack1;

import java_day13.Test;

public class TestMain {

	public static void main(String[] args) {
		
		Test t=new Test();
		
					
		//Default - Default methods and variables are not visible to another package
		/*
		t.m2();		
		System.out.println(t.x2);
		*/
		
		//Protected - Protected methods and variables are not visible to another package without inheritance
		/*
		t.m3();		
		System.out.println(t.x3);
		*/
		
		//Public- Public methods and variables are visible to another package without inheritance
		t.m4();
		System.out.println(t.x4);
		


	}

}
