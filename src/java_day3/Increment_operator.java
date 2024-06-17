package java_day3;

public class Increment_operator {

	public static void main(String[] args) {
		
		// ++ is a increment_operator	---> pre, post
		
		int a=10;
		
		//Scenario 1 -  there is no difference between pre/post increment
		a=a+1;		
		System.out.println(a);	
		
		a=10;
		a++;		//post increment
		System.out.println(a);	
	
		a=10;
		++a;		//pre increment
		System.out.println(a);
		
		
		//Scenario 2 -
		a=10;
		int res1=a++;	//first value of 'a' assign to the res1 and then increment
		System.out.println("res1 ="+res1); 		//res1=10
		System.out.println("a ="+a);
		
		a=10;
		int res2=++a;	//first increment the value then assign to the res2
		System.out.println("res2 ="+res2);		//res1=11
		System.out.println("a ="+a);
		
		

	}

}
