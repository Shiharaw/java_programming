package java_day4;

public class NestedIfElse {

	public static void main(String[] args) {
		//Case1
		if(false) {
			if(false) {
				System.out.println("ABC");
			}
			else {
				System.out.println("MNO");
			}
		}
		else if(false) {
			if(false) {
				System.out.println("PQR");
			}
			else {
				System.out.println("XYZ");
			}
		}
		else {
			System.out.println("All False");
		}
		
		
		//Case2 - Without final else
		if(false) {
			if(false) {
				System.out.println("ABC");
			}
			else {
				System.out.println("MNO");
			}
		}
		else if(true) {
			if(false) {
				System.out.println("PQR");
			}
			else {
				System.out.println("XYZ");
			}
		}
		
		
	}

}
