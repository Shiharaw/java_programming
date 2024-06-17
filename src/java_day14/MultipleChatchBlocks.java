package java_day14;

import java.util.Scanner;

public class MultipleChatchBlocks {

	public static void main(String[] args) {
		System.out.println("Program1 is started.");
		System.out.println("Program1 is inprogress...");
		
		
		Scanner sc=new Scanner(System.in);
		
		//Example1
		System.out.println("Enter a number:");
		//Get entered number by user
		//Insert entered number to a variable
		int num1=sc.nextInt();					//InputMismatchException when give num1 as non integer value			
		
		try {
			System.out.println(100/num1);		//ArithmeticException when give num1 as 0
		}
		
		//Exception handling -Multiple catches - without knowing the exception
		
		catch(ArithmeticException e){
			
			//System.out.println(e.getMessage());
			//e.printStackTrace();
			System.out.println("ArithmeticException - You have entered invalied input "+ num1);
			
		}
		catch(NumberFormatException e){
			
			//System.out.println(e.getMessage());
			//e.printStackTrace();
			System.out.println("NumberFormatException - You have entered invalied input "+num1);
			
		}
		catch(NullPointerException e){
			
			//System.out.println(e.getMessage());
			//e.printStackTrace();
			System.out.println("NullPointerException - You have entered invalied input "+num1);
			
		}
		
		System.out.println("Program1 is completed.");
		System.out.println();
		System.out.println();
		
		
		//Example2
		System.out.println("Program2 is started.");
		System.out.println("Program2 is inprogress...");
		
		String s1=null;		
		
		try {
			System.out.println(s1.length());		//NullPointerException when the s1 is null
		}
		catch(ArithmeticException e){
			
			System.out.println("ArithmeticException - You have entered invalied input ");
			
		}
		
		catch(NumberFormatException e){
			
			//System.out.println(e.getMessage());
			//e.printStackTrace();
			System.out.println("NumberFormatException - You have entered invalied input ");
			
		}
		catch(NullPointerException e){
			
			//System.out.println(e.getMessage());
			//e.printStackTrace();
			System.out.println("NullPointerException - You have entered invalied input ");
			
		}
		
		System.out.println("Program2 is completed.");
		System.out.println();
		System.out.println();
		
		
		//Exception handling -Single catch - without knowing the exception
		//Example3
		try {
			System.out.println(100/num1);		//ArithmeticException when give num1 as 0
		}
		
		catch(Exception e){
			
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("Exception thrown. You have entered invalied input "+ num1);
			
		}
		System.out.println("Program3 is completed.");
		System.out.println();
		System.out.println();
		
		//Example4
		try {
			System.out.println(s1.length());		//NullPointerException when the s1 is null
		}
		
		catch(Exception e){
			
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("\"Exception thrown. You have entered invalied input- "+ s1);
			
		}
		
		System.out.println("Program4 is completed.");
		System.out.println("Program is exit now.");
		
		
	}

}
