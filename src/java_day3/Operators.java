package java_day3;

public class Operators {

	public static void main(String[] args) {
		
		//1) Arithmetic operators + - * / %
		int a=20, b=10;
		
		System.out.println("Sum of a and b is:" +(a+b));
		System.out.println("Substraction of a and b is:" +(a-b));
		System.out.println("Multiplication of a and b is:" +(a*b));
		System.out.println("Division of a and b is:" +(a/b));
		System.out.println("Modulo Division of a and b is:" +(a%b));
		
		
		//2) Relational/comparison operators > >= < <= != ==
		//Return True/False (Boolean)
		
		System.out.println(a>b);	//true
		System.out.println(a<b);	//false
		
		b=20;
		
		System.out.println(a>=b);	//true
		System.out.println(a<=b);	//true
		System.out.println(a!=b);	//false
		System.out.println(a==b);	//true
		
		
		//3) Logical operators && || !
		//Works between 2 or more boolean values
		//Returns true/false
		boolean x=true;
		boolean y=false;
		
		System.out.println("Logical operators");
		System.out.println(x && y);	//false
		System.out.println(x || y);	//true
		System.out.println(!x);		//false
		
		boolean b1=10>20; 	//false
		boolean b2=10<20;	//true
		
		System.out.println(b1 && b2);	//false
		System.out.println(b1 || b2);	//true
		System.out.println(!b1);		//true
		

	}

}
