package java_day5;

public class ContinueStatements {

	public static void main(String[] args) {
		//Example1
		for(int i=1;i<=5;i++) {
			if(i==3) {
				continue;
			}
			//System.out.println(i);		//1,2,4,5, i=3 continue and skip printing 3
		}
		
		//Example2
		for( int i=1;i<=5;i++) {
			if(i==3 && i==5) {
				continue;
			}
			System.out.println(i);		//1,2,3,4,5, i=3 && i=5 condition is not never satisfied
		}
		
		
		//Example3
				for( int i=1;i<=5;i++) {
					if(i==3 || i==5) {
						continue;
					}
					System.out.println(i);		//1,2,,4,, i=3 || i=5 condition is true when i=3 and i=5
				}

	}

}
