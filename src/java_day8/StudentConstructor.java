package java_day8;

public class StudentConstructor {
	
	int sid;
	String sname;
	char sgrade;
	
	void display() {
		
		System.out.println(sid+"  "+sname+"  "+sgrade);
	}
	
	//approch3: Using constructor
	
	//Difference between method and constructor
	//Method
	//Method name can be any name
	//Method may or may not return any value
	//Method can include any complex logics
	
	//Constructor
	//Constructor name should equal to class name
	//Constructor do not return any value
	//Constructor using only assign to the variables
	
	StudentConstructor(int id, String name, char g) {
		sid=id;
		sname=name;
		sgrade=g;
		
	}

}
