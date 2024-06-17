package java_day4;

public class Largestof3Numbers {

	public static void main(String[] args) {
		int num1=10, num2=100, num3=300;
		
		if(num1>num2 && num1>num3) {
			System.out.println(num1 +" is the Largest number");
		}
		else if(num2>num3) {
			System.out.println(num2 +" is the Largest number");
			
		}
		else {
			System.out.println(num3 +" is the Largest number");
		}

	}

}
