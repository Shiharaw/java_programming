package java_day5;

public class ForLoops {

	public static void main(String[] args) {
		
		//Example1: Print 1 to 10 numbers
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		
		//Example2: Print even numbers of 1 to 10 numbers
		//Approach 1
		for(int i=2;i<=10;i+=2) {
			System.out.println(i);
		}
		
		//Approach 2
		for(int i=1;i<=10;i++) {
			if(i%2==0)
			System.out.println(i);
		}
		
		
		//Example3: Print 1 to 10 numbers decrement order
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
		
		
		//Example4: for-each Loop
		
		//Create array
		int[] num = {-1,-2,3,4,5,6,7,8,-9};
		
		//for-each Loop
		for(int number: num) {
			if(number<=5) {
				System.out.println(number);
			}
		}

	}

}
