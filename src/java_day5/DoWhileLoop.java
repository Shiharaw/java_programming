package java_day5;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		//Example1: Print 1 to 10 numbers
		int i=1;
		do {
			System.out.println(i);
			i++;
			
		}while(i<=10);
		
		
		//Example2: Print 1 to 10 numbers descending order
		
		System.out.println("Print 1 to 10 numbers descending order");
		i=10;
		do {
			System.out.println(i);
			i--;
		}while(i>=1);

	}

}
