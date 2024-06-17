package java_day5;

public class Assignment3CountNumberOfDigitsInANumber {

	public static void main(String[] args) {
		int num1,num2,num3=0;

		num1=133500330;
		num2=num1;
		
		while(num2>=1) {
			num2=num2/10;
			
			//Count Number of Digits in a number
			num3++;
			//System.out.println(num4);
		}
		System.out.println("Number of digits in the number "+num1+" is "+num3);		
		
	}

}
