package java_day8;

public class Student {
	
	int sid;
	String sname;
	char sgrade;
	
	void display() {
		
		System.out.println(sid+"  "+sname+"  "+sgrade);
	}
	
	//approch2: Using method
	//Method name can be any name
	//Method may or may not return any value
	//Method can include any complex logics
	void setData(int id, String name, char g) {
		sid=id;
		sname=name;
		sgrade=g;
	}
	
	

}
