package java_day3;

public class Decrement_operator {

	public static void main(String[] args) {
		
		// -- is a decrement_operator	---> pre, post
		int a=10;
		
		//Scenario 1 -  there is no difference between pre/post decrement
		a=a-1;		
		System.out.println(a);		//9
		
		a=10;
		a--;		//post decrement
		System.out.println(a);		//9
	
		a=10;
		--a;		//pre decrement
		System.out.println(a);		//9
		
		
		//Scenario 2 -
		a=10;
		int res1=a--;	//first value of a assign to the res1 and then  decrement
		System.out.println("res1 ="+res1); 		//res1=10
		System.out.println("a ="+a);			//res1=9
		
		a=10;
		int res2=--a;	//first decrement the value then assign to the res2
		System.out.println("res2 ="+res2);		//res1=9
		System.out.println("a ="+a);			//res1=9

	}

}
