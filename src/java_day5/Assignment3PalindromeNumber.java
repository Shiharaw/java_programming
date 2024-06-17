package java_day5;

public class Assignment3PalindromeNumber {

	public static void main(String[] args) {
		int num1,num2,num3,num4=0;

		num1=123321;
		num2=num1;
		
		while(num2>=1) {
			num3=num2%10;
			num2=num2/10;
			
			//Generate the reversed number
			num4=num4*10+num3;
		}
				
		//Check the number is Palindrome Number
		if(num1==num4) {
			System.out.println("Number "+num1+" is a Palindrome Number");
		}
		else {
			System.out.println("Number "+num1+" is not a Palindrome Number");
		}
		

	}

}
