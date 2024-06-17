package java_day15;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//Declaration
		HashSet myset = new HashSet();							//Allow to store all types of data
		HashSet<Integer> mysetint = new <Integer>HashSet();		//Allow to store Integer types of data only
		
		//Use List Interface to create HashSet object in HashSet class
		Set myset1 = new HashSet();
		
		
		myset.add(100);
		myset.add(10.5);
		myset.add("Welcome");
		myset.add(true);
		myset.add(null);
		myset.add(100);
		myset.add(null);
		
		//Print list of elements of the HashSet
		System.out.println(myset);		//Insertion Order - not preserved //[null, 100, 10.5, Welcome, true]
		
		//Size of HashSet
		myset.size();
		System.out.println(myset.size());
		
		//Remove value from HashSet
		//We have to pass value not the index - Index do not support with HashSet
		myset.remove(10.5);
		System.out.println(myset);
		
		//Insert value in the HashSet - not possible
		//Get spesific value from the HashSet - Not possible
		
		
		//Read all the data from ArrayList
		//X should be all type of data, therefore we declare as object variable
		for(Object x:myset) {
			System.out.println(x);
		}
		
		

	}

}
