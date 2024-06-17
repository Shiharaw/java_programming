package java_day6;

/*1) Declare an array
2) Insert values into array
3) Find size of an array
4) read single value from an array
5) read multiple values from an array*/

public class TwoDimentionalArray {

	public static void main(String[] args) {
		
		// Declaration and Insert values
		
		//Approach 1
		int a[][]=new int[3][2];
		//int []a[]=new int[3][2];
		//int [][]a=new int[3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=600;
		a[2][1]=700;
		
		//Approach 2
		int b[][]= {{10,20},
				    {30,40},
				    {60,70}
				   };
		
		//size of an array
		System.out.println(a.length);	//Total number of raws-->3
		System.out.println(a[0].length);	//Total number of columns-->2
		
		//Read specific value from array
		System.out.println(a[0][1]);
		
		//read data from array using classic for loop
		//Get the number of raws
		for(int r=0;r<3;r++) {
			////Get the number of columns of a raws
			for(int c=0;c<2;c++) {
				System.out.println(a[r][c]);
			}
				
		}
		//Get the number of raws
		for(int r=0;r<b.length;r++) {
			////Get the number of columns of a raws
			for(int c=0;c<b[r].length;c++) {
				System.out.print(b[r][c]+"  ");	//This print all in single line
			}
			System.out.println("");	//Moving to next raw 
		}
		
		
		//read data from array using enhanced for loop
		for(int x[]:a) {
			for(int y:x) {
				System.out.println(y);
			}
			
		}

	}

}
