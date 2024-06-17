package Practic_code;

public class Print_Even_and_Odd {

	public static void main(String[] args) {
		int even=0,odd=0;
		int num[]= {1,22,35,44,55,75,84,85,90,91,92,96,99};
		System.out.println(num.length);
		
		for(int i=0;i<num.length;i++) {
			
			if(num[i]%2==0) {
				even++;
				System.out.println(num[i]+" is a Even Number");
			}else {
				odd++;
				System.out.println(num[i]+" is a Odd Number");
			}
		}
		
		System.out.println(even+" Even Numbers "+odd+" Odd Number");

	}

}
