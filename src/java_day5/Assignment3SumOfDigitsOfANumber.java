package java_day5;

public class Assignment3SumOfDigitsOfANumber {

	public static void main(String[] args) {
		int num1,num2,num3,num4=0;

		num1=12345678;
		num2=num1;
		
		while(num2>=1) {
			num3=num2%10;
			num2=num2/10;
			
			//Generate the Sum Of the digits of a number
			num4=num4+num3;
		}
		System.out.println("Sum Of the digits of the number "+num1+" is "+num4);	

	}

}
