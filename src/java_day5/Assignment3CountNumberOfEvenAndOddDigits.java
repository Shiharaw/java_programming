package java_day5;

public class Assignment3CountNumberOfEvenAndOddDigits {

	public static void main(String[] args) {
		int num1,num2,num3,odd=0,even=0;

		num1=808388883;
		num2=num1;
		
		while(num2>=1) {
			num3=num2%10;
			num2=num2/10;
			
			//Count Number of even and odd Digits in a number
			if(num3%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("Number of Even digits of the number "+num1+" is "+even);
		System.out.println("Number of Odd digits of the number "+num1+" is "+odd);
		
	}

}
