package java_day15;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//Declaration
		HashMap hm = new HashMap();
		
		//Allow to store Key in Integer type only and Value in String type only
		HashMap<Integer,String> hmis = new HashMap<Integer,String>();
		
		//Use Map Interface to create HashMap object in HashMap class
		Map hm1 = new HashMap();
		
		//Adding data pairs to HashMap
		hmis.put(101, "John");
		hmis.put(102, "Scott");
		hmis.put(103, "John");
		hmis.put(104, "Mary");
		hmis.put(101, "David");
		hmis.put(105, "David");
		
		System.out.println(hmis);			//{101=David, 102=Scott, 103=John, 104=Mary, 105=David}
		
		//Size of HashMap
		hmis.size();
		System.out.println(hmis.size()); 	//5
		
		//Remove pair
		hmis.remove(103);
		System.out.println(hmis);			//{101=David, 102=Scott, 104=Mary, 105=David}
		
		
		//Get specific value from the HashMap
		hmis.get(104);
		System.out.println(hmis.get(104)); 	//Given Key is 104, Return value Mary
		
		//Print keys only
		hmis.keySet();
		System.out.println(hmis.keySet()); //[101, 102, 104, 105]
		
		//Print Values only
		for(Object k:hmis.keySet()) {
			
			//Get the values only
			System.out.println(hmis.get(k));
			
			//Get the keys and values both
			System.out.println(k+"    "+hmis.get(k));
			
		}
		
		
		//Clear data in the HashMap
		hmis.clear();
		System.out.println(hmis);

	}

}
