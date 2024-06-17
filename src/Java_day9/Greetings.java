package Java_day9;

public class Greetings {
	
	//1) No Params   No return value
	
	//void- is no return value
	//Empty brackets ()- No parameters
	void greetings1() {
		System.out.println("Hello....");
	}
	
	
	//2) No Params   Return value
	
	//String type value is return
	//Empty brackets ()- No parameters
	String greetings2(){
			
		return("Hello.... Heow are you");
	}
	
	
	//3) Take Params   No return value
	
	//void- is no return value
	//inside brackets has 1 parameter
	void greetings3(String name) {
		
		System.out.println("Hello.... "+name);
	}
	
	
	//4) Take Params   Return value
	
	//String type value is return
	//inside brackets has 1 parameter
	String greetings4(String name){
		
		return("Hello.... I am "+name);
	}

}
