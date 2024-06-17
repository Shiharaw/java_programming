package java_day5;

public class Assignment3ReverseNumber {

	public static void main(String[] args) {
		int num1,num2,num3,num4=0;
		
		//Approach 1
		num1=123321;
		num2=num1;
		
		while(num2>=1) {
			num3=num2%10;
			num2=num2/10;
			
			//Generate the reversed number
			num4=num4*10+num3;
		}
		System.out.println("Reverse number of "+num1+" is "+num4);		//Print number reversed
		
		
		//Approach 2
		num1=12345;
		num2=num1;
		num4=0;
		
		do {
			num3=num2%10;
			num2=num2/10;
			num4=num4*10+num3;		//Generate the reversed number
			//System.out.println(num4);
			//System.out.println(num3);
			
		}while(num2>=1);
		
		System.out.println("Reverse number of "+num1+" is "+num4);

	}

}
