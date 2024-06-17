package java_day12;

class Test{
	
	final int x=100;	//constant value - we cannot change
}


public class FinalKeywordDemo {

	public static void main(String[] args) {
		
		Test t=new Test();
		t.x=200;		//Incorrect, bcoz x is a final value
		
		System.out.println(t.x);
		

	}

}
