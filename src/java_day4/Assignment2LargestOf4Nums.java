package java_day4;

public class Assignment2LargestOf4Nums {

	public static void main(String[] args) {
		
		int n1=2523, n2=9452, n3=1492, n4=9239;
		
		if (n1>n2 && n1>n3 && n1>n4) {
			
			System.out.println(n1+" is the Lagest number" );
		}
		else if (n2>n3 && n2>n4){
			System.out.println(n2+" is the Lagest number" );
		}
		else if (n3>n4) {
			System.out.println(n3+" is the Lagest number" );
		}
		else {
			System.out.println(n4+" is the Lagest number" );
		}

	}

}
