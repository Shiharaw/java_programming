package java_day12;

final class Test1{
	
	final void m() {
		System.out.println("This is m from Test1 class");
	}
}

class Test2 extends Test1{		//incorrect, bcoz Test1 is a final class
	
	void m() {		//Incorrect, bcoz m() is final method
		System.out.println("This is m from Test2 class");
	}
}





public class FinalKeywordDemo2 {

	public static void main(String[] args) {
		

	}

}
