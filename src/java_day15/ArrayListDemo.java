package java_day15;

import java.util.ArrayList;
import java.util.List;

/*
1) Heterogenious data is allowed - multiple data types
2) Insertion Order - preserved(Index) - Follow the index concept
3) Duplicate elements - allowed
4) multiple nulls - allowed
*/

class Employee{
	int empno;
	String empname;
	
	void display() {
		//code
	}
}


public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Declaration
		ArrayList mylist = new ArrayList();							//Allow to store all types of data
		ArrayList <Integer>mylistint = new ArrayList<Integer>();	//Allow to store Integer types of data only
		ArrayList <String>myliststr = new ArrayList<String>();		//Allow to store String types of data
		
		//Use List Interface to create ArrayList object in ArrayList class
		List mylist1 = new ArrayList();								//Allow to store all types of data
		
		//Non primitive( object type) data object
		Employee empobj1 = new Employee();
		Employee empobj2 = new Employee();
		Employee empobj3 = new Employee();
		Employee empobj4 = new Employee();
		Employee empobj5 = new Employee();
		
		//Primitive type data
		//Adding data elements into ArrayList
		//add method add value add end of the list
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("Welcome");
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add("Welcome");
		mylist.add(null);
		mylist.add(empobj1);		//can add class objects
		mylist.add(empobj2);
		
		
		//Size of ArrayList
		mylist.size();
		System.out.println(mylist.size());
		
		//Print list of elements of the ArrayList
		System.out.println(mylist);
		
		//Remove value from ArrayList
		//ArrayList index start from  '0'
		mylist.remove(7);
		System.out.println("After remove the element "+mylist);
		
		//Inserting new value/element to middle of the list
		mylist.add(2,"java");
		System.out.println("After insert the element "+mylist);
		
		//Get specific value from the ArrayList
		mylist.get(4);
		System.out.println(mylist.get(4));
		
		//Read all the data from ArrayList
		//X should be all type of data, therefore we declare as object variable
		for(Object x:mylist) {
			System.out.println(x);
		}
		
		//Clear all the data from the ArrayList
		mylist.clear();
		System.out.println("After clear the data "+mylist);

	}

}
