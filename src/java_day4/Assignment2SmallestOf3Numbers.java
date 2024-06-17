package java_day4;

public class Assignment2SmallestOf3Numbers {

	public static void main(String[] args) {
		int a=100, b=20, c=30;
		
		if(a<b && a<c) {
			System.out.println(a+" is the smallerest number");
		}
		else if(b<c) {
			System.out.println(b+" is the smallerest number");
		}
		else {
			System.out.println(c+" is the smallerest number");
		}


	}

}
