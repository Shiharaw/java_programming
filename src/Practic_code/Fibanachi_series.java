package Practic_code;

public class Fibanachi_series {

	public static void main(String[] args) {
		int num1=0,num2=1,num3=0;
		System.out.println(num1);
		System.out.println(num2);
		for(int r=3;r<=10;r++) {
			
			num3=num1+num2;
			num1=num2;
			num2=num3;
			
			System.out.println(num3);
			
			
		}

	}

}
