package Practic_code;

public class test {

	public static void main(String[] args) {
		//int odd=0,evn=0;
		int a[]= {1,23,44,5,66,43,78,90,24,11,52,87,68,42};
		
		for(int i=1;i<a.length;i++) {
			
			if(a[i]%2==0) {
				
				System.out.println("even "+a[i]);
			}else {
				System.out.println("Odd "+a[i]);
			}
		}
	}

}
