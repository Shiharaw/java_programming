package java_day8;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		//Assign data to the object variables
		emp1.eid=101;
		emp1.ename="John";		
		emp1.job="Engineer";	
		emp1.esal=50000;
		
		emp1.display();
		
		
		Employee emp2=new Employee();
		emp2.eid=102;
		emp2.ename="Scott";
		emp2.job="Manager";
		emp2.esal=150000;
		
		emp2.display();
		

	}

}
