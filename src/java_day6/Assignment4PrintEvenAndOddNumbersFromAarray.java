package java_day6;

public class Assignment4PrintEvenAndOddNumbersFromAarray {

	public static void main(String[] args) {
		int a[]= {1,51,87,4,55,6};
		int Odd=0;
		int Even=0;
		
		for(int i=0;i<a.length;i++) {
			if (a[i]%2==0) {
				Even++;
			}
			else {
				Odd++;
			}
			//System.out.println(Even+"  "+Odd);
		}
		System.out.println("Number of Even numbers of an array is "+Even+" and number of Odd numbers of an array is "+Odd);
	}

}
