package java_day5;

public class TestingLoops {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i==5) {
				System.out.println(i);		//Print 5 only
			}
			
		}
		
		for(int i=1;i<=10;i++) {
			if(i==2||i==5||i==10){
				System.out.println(i);		//Print 2,5,10 only
			}
		}
		
		for(int i=1;i<=10;i++) {
			if(i!=2&&i!=5&&i!=10){
				System.out.println(i);		//Print 2,5,10 only
			}
		}
		
		System.out.println("Print numbers based on flag's value");
		//flag =true print 1 to5
		//flag =false print 10 to 1
		boolean flag=false;
		if(flag) {
			for(int i=1;i<=5;i++) {
				System.out.println(i);
			}
		}
		else {
			for(int i=10;i>=1;i--) {
				System.out.println(i);
			}
		}

	}

}
