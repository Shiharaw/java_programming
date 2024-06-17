package java_day7;

public class StringComparisions {

	public static void main(String[] args) {
		//String s1="welcome";
		//String s2="welcome";
		
		//case1 - create one object and refer by both variables s1 and s2
		String s1="welcome";
		String s2="welcome";
		System.out.println(s1==s2);			//true
		System.out.println(s1.equals(s2));	//true
		
		//case2 - new key word create 2 different objects
		String s3=new String("welcome");
		String s4=new String("welcome");
		
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println(s3==s4);			//false	//Compare objects 
		System.out.println(s3.equals(s4));	//true //Compare value of the object
		
		
		//case3
		String t1="abc";
		String t2=new String("abc");
		String t3=t2;
		
		System.out.println(t1);		//abc
		System.out.println(t2);		//abc	
		System.out.println(t3);		//abc
		
		
		System.out.println(t1==t2);			//false
		System.out.println(t1.equals(t2));	//true
		
		System.out.println(t2==t3);			//true
		System.out.println(t2.equals(t3));	//true
		
		System.out.println(t1==t3);			//false
		System.out.println(t1.equals(t3));	//true
		
		
		
		

	}

}
