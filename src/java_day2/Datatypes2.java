package java_day2;

public class Datatypes2 {

	public static void main(String[] args) {
		
		//Numeric Integer data types
		int a=100, b=200;
		
		System.out.println("value of a is: "+a);
		System.out.println("value of b is: "+b);
		
		long x= 1234567889;
		System.out.println("value of x is: "+x);
		
		byte by=120;
		System.out.println("value of by is: "+by);
		
		short sh=32766;
		System.out.println("value of sh is: "+sh);
		System.out.println(sh);
		
		
		//Decimal numbers float double
		
		//using decimal number as float need add f at the end of the number 
		float Item_price_a=123.20f;		
		float Item_price_b=123.202f;
		float Item_price_c=123f;
		
		System.out.println(Item_price_a);
		System.out.println(Item_price_b);
		System.out.println(Item_price_c);
		
		double d=12.1234567898;
		System.out.println(d);
		
		double dx=12;
		System.out.println(dx);
		
		//int y=123.5; 	// Not valid
		
		
		//Characters represented with single quotation ''
		//Strings represented with double quotation ""
		
		char grad='A';
		System.out.println("The grade of the student is "+grad);
		
		//char ch='ABC';		// Not valid
		
		String person_name="Shihara Wickramasinghe";
		System.out.println("My name is "+person_name);
		
		String str="A";
		System.out.println(str);
		
		//String str1=true;		// Not valid-string cannot have a boolean value
		String str1="true";	
		System.out.println(str1);
		
		boolean bo1=true;
		boolean bo2=false;
		System.out.println(bo1);
		System.out.println(bo2);
		
		//boolean bo1="true";		// Not valid-boolean cannot have a string value
		
		//System.out.println(); 	//Enter Syso and CTRL+SPACE
		
		
		System.out.println("Welcome"+100); 			//Concatenation---->Welcome100
		System.out.println("Welcome"+"100"); 		//Concatenation---->Welcome100
		System.out.println("200"+100); 				//Concatenation---->200100
		System.out.println(200+100); 				//Addition 	   ---->300

	}

}
