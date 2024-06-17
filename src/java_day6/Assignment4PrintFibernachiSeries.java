package java_day6;

public class Assignment4PrintFibernachiSeries {

	public static void main(String[] args) {
		int num1=0, num2=1, num3=0;
		System.out.println(num1);
		System.out.println(num2);
		for (int i=1;i<=10;i++) {

			num3=num2+num1;
			num1=num2;
			num2=num3;
			
			System.out.println(num3);
					
			
		}

	}

}
