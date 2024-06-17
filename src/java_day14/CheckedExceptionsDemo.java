package java_day14;

public class CheckedExceptionsDemo {
    
	//throws declaration
	public static void main(String[] args) throws InterruptedException {
		
		//Do not use both try....catch block and throws declaration in the same program
		//This program use both in the same program to understand
		System.out.println("Program is started.");
		
		Thread.sleep(5000);
		
		System.out.println("Program  is inprogress...");
		//try....catch block
		try {
			Thread.sleep(5000);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Program  is finished.");
		System.out.println("Program   is terminated.");
		

	}

}
