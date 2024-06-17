package java_day13_pack1;

import java_day13.Test;

public class InheritTestMain extends Test{

	public static void main(String[] args) {
		
		InheritTestMain tm =new InheritTestMain();
	
		
		//Default - Default methods and variables are not visible to another package if it is inherited
		/*
		tm.m2();		
		System.out.println(tm.x2);
		*/
		
		//Protected - Protected methods and variables are visible to another package after inherited
		tm.m3();
		System.out.println(tm.x3);
		
		//Public- Public methods and variables are visible to another package after inherited
		tm.m4();
		System.out.println(tm.x4);
		

		

	}

}
