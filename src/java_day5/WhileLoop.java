package java_day5;

public class WhileLoop {

	public static void main(String[] args) {
		//Example1: Print 1 to 10 numbers
		int i=1; 	//
		while(i<=10) {		//condition
			System.out.println(i);
			i++;				//Increment
			
		}
		
		//Example2: Print Hello 10 numbers
		 i=1;
		 while(i<=10) {
			System.out.println("Hello");
			i++;
		 }
		
		
		//Example3: Print even numbers of 1 to 10 numbers
		//Approach 1
		i=2;
		while(i<=10) {
			System.out.println(i);
			i+=2;
		}
		
		//Approach 2
		i=11;
		while(i<=20) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}
		
		
		//Example4: Print odd numbers of 1 to 10 numbers
		//Approach 1
		i=1;
		while(i<=10) {
			System.out.println(i);
			i+=2;
		}
		
		//Approach 2
		i=1;
		while(i<=10) {
			if(i%2!=0) {
				System.out.println(i);
			}
			i++;	
		}
		
		
		
		//Example5: Print 1 to 10 numbers decrement order
		i=10;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
		

	}

}
