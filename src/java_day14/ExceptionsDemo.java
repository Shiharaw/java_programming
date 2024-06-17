package java_day14;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {
		
		System.out.println("Program is started.");
		System.out.println("Program is inprogress...");
		
		
		Scanner sc=new Scanner(System.in);
		
		//Example1
		System.out.println("Enter a number:");
		//Get entered number by user
		//Insert entered number to a variable
		int num1=sc.nextInt();				
		
		System.out.println(100/num1);		//ArithmeticException when give num1 as 0
		
		System.out.println("Program1 is completed.");
		System.out.println("Program1 is exit now.");
		
		
		//Example2
		int a[]=new int[5]; 		//0...4
		//Scanner sc1=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num2=sc.nextInt();
		
		System.out.println("Enter a position (0-4):");
		int pos=sc.nextInt();				//ArrayIndexOutOfBoundsException when enter the pos>4
		a[pos]=num2;
		System.out.println(a[pos]);
		
		System.out.println("Program2 is completed.");
		System.out.println("Program2 is exit now.");
		
		
		//Example3
		String s1="Welcome";
		int n1=Integer.parseInt(s1);		//NumberFormatException when give letters foe s1
		System.out.println(n1);
		
		System.out.println("Program3 is completed.");
		System.out.println("Program3 is exit now.");
		
		
		
		
		
		

	}

}
