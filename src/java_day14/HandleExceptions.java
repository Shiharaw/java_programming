package java_day14;

import java.util.Scanner;

public class HandleExceptions {

	public static void main(String[] args) {
		
		System.out.println("Program is started.");
		System.out.println("Program is inprogress...");
		
		
		Scanner sc=new Scanner(System.in);
		
		//Example1
		System.out.println("Enter a number:");
		//Get entered number by user
		//Insert entered number to a variable
		int num1=sc.nextInt();					//InputMismatchException when give num1 as non integer value			
		
		try {
			System.out.println(100/num1);		//ArithmeticException when give num1 as 0
		}
		catch(ArithmeticException e){
			
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("You have entered invalied input "+ num1);
			
		}
		
		System.out.println("Program1 is completed.");
		System.out.println("Program1 is exit now.");
		

	}

}
