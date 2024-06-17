package java_day4;

public class PrintDaysOfWeek {

	public static void main(String[] args) {
		int dateno=6;
		
		if(dateno==1) {
			System.out.println("Sunday");
		}
		else if(dateno==2) {
			System.out.println("Monday");
		}
		else if(dateno==3) {
			System.out.println("Tuesday");
		}
		else if(dateno==4) {
			System.out.println("Wednsday");
		}
		else if(dateno==5) {
			System.out.println("Thursday");
		}
		else if(dateno==6) {
			System.out.println("Friday");
		}
		else if(dateno==7) {
			System.out.println("Saturday");
		}
		else {
			System.out.println("Invalied date");
		}
	}

}
