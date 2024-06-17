package java_day6;

import java.util.Arrays;
import java.util.Collections;

public class Assignment4SortingElements {

	public static void main(String[] args) {
		int a[]={50,20,40,10,100};
		
		//Approach1
		System.out.println("Array elements before sorting "+Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("Array elements after sorting "+Arrays.toString(a));
		
		//Approach2
		int b[]={50,20,40,10,120};
		System.out.println("Array elements before sorting "+Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("Array elements after sorting "+Arrays.toString(b));
		
		//Approach Reverse sorting Descending order
		Integer c[]={50,20,40,10,120};
		System.out.println("Array elements before sorting "+Arrays.toString(c));
		Arrays.sort(c,Collections.reverseOrder());
		System.out.println("Array elements after sorting "+Arrays.toString(c));
	

	}

}
