package java_day6;

import java.util.Arrays;

/*1) Declare an array
2) Insert values into array
3) Find size of an array
4) read single value from an array
5) read multiple values from an array*/


public class SigleDiamentionArray {

	public static void main(String[] args) {
		
		// Declaration and Insert values
		
		//Approach 1
		int a[]=new int[5];
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		//Approach 2
		int b[]= {100,200,400,500,600,1};
		
		//size of an array
		System.out.println(b.length); 	//Total number of values store in the array
		
		//Extract/get single value from array
		System.out.println(b[3]);
		
		//Extract/get all the values from array
		System.out.println(Arrays.toString(b));
		
		//Extract/get all the values by using loop
		for(int i=0;i<6;i++) {
			System.out.println(b[i]);	
		}
		
		//Extract/get all the values by using loop when number of values are not known
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		//read data from array using enhanced for loop
		for(int x:a) {
			System.out.println(x);
		}
		
		
		

	}

}
