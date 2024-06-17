package Java_day9;

public class GreetingsMain {

	public static void main(String[] args) {
		
		//1)
		Greetings gr= new Greetings();
		gr.greetings1();
		
		
		//2)
		//appproch1
		String str2=gr.greetings2();
		System.out.println(str2);
		
		//appproch2
		System.out.println(gr.greetings2());
		
		//3)
		gr.greetings3("John");
		
		//4)
		String str4=gr.greetings4("Helan");
		System.out.println(str4);
		

	}

}
