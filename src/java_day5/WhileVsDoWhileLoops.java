package java_day5;

public class WhileVsDoWhileLoops {

	public static void main(String[] args) {
		
		//Example1: Print 1 to 5 numbers
		//While
		int i=1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		
		//DoWhile
		i=1;
		do {
			System.out.println(i);
			i++;
		}while(i<=5);
		
		
		//Example2: When i=10 and Print 1 to 5 numbers
		//While
		System.out.println("While:Print 1 to 5 numbers when i=10");
		i=10;
		while(i<=5) {
			System.out.println(i);		//Condition fail and did not print any number
			i++;
		}
		
		//DoWhile
		System.out.println("DoWhile:Print 1 to 5 numbers when i=10");
		i=10;
		do {
			System.out.println(i);		//Print 10 and then check condition. Then stop printing numbers
			i++;
		}while(i<=5);
		

	}

}
