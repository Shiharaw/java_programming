package java_day8;

public class StudentMain {

	public static void main(String[] args) {
		Student stu1=new Student();
		
		//Approch1: Using reference variables
		stu1.sid=100;
		stu1.sname="John";
		stu1.sgrade='A';
		stu1.display();
		
		//Approch2: using method
		stu1.setData(101, "Jude", 'A');
		stu1.display();
		
		

	}

}
