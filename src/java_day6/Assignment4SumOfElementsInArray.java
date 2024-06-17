package java_day6;

public class Assignment4SumOfElementsInArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			sum =sum+a[i];
		}
		System.out.println("Sum of the elements of the array is "+sum);
		

	}

}
