package java_day14;

public class FinallyBlock {

	public static void main(String[] args) {
		
		//case1:Exception occured,catch block handled--->finally block will execute
		System.out.println("Case1 is started.");
		System.out.println("Case1 is inprogress...");
		
		String s1=null;		
		
		try {
			System.out.println(s1.length());
		}
		
		catch(Exception e){
			System.out.println("Exeception occured...Handled");
		}
		
		finally {
			System.out.println("Executed in to finally block......");
		}
		
		System.out.println("Case1  is completed.");
		System.out.println("Case1  is exit now.");
		
		
		//case2:Exception occured,catch block handled-NOT -->finally block will execute
		System.out.println("Case2  is started.");
		System.out.println("Case2  is inprogress...");
		
		String s2="welcome";		
		
		try {
			System.out.println(s2.length());
		}
		
		catch(Exception e){
			System.out.println("Exeception occured...Handled");
		}
		
		finally {
			System.out.println("Executed in to finally block......");
		}
		
		System.out.println("Case2 is completed.");
		System.out.println("Case2  is exit now.");
		
		
		//case3:Exception does not occured,catch block ignored--->finally block will execute
		System.out.println("Case3 is started.");
		System.out.println("Case3 is inprogress...");
		
		String s3=null;		
		
		try {
			System.out.println(s3.length());
		}
		
		catch(ArithmeticException e){
			System.out.println("Exeception occured...Handled");
		}
		
		finally {
			System.out.println("Executed in to finally block......");
		}
		
		System.out.println("Case3  is completed.");
		System.out.println("Case3  is exit now.");

	}

}
