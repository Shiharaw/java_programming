package java_day4;

public class SwichCase {

	public static void main(String[] args) {
		
		int dateno=77;
		
		switch(dateno){
			case 1: System.out.println("Sunday");break;
			case 2: System.out.println("Monday");break;
			case 3: System.out.println("Tuesday");break;
			case 4: System.out.println("Wednsday");break;
			case 5: System.out.println("Thursday");break;
			case 6: System.out.println("Friday");break;
			case 7: System.out.println("Saturday");break;
			default: System.out.println("Invalied date");
		}
		 
		//int age=15;
		//Invalid and cannot add expressions to the switch case
		//valid only values
		
		//switch (age>18): System.out.println("Eligible for vote");break;
		

	}

}
