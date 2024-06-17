package java_day6;

public class Assignment4SearchAnElementIsInArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
		int num=60;
		boolean ss=false;
		
		for(int i=0;i<a.length;i++) {
			if(num==a[i]) {
				System.out.println("Number "+num+" is in the Array");
				ss=true;
				
			}
		}
		if(ss==false) {
			System.out.println("Number "+num+" is not in the Array");
			
		}
		
	}

}
