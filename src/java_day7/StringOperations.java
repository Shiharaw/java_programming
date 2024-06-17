package java_day7;

public class StringOperations {

	public static void main(String[] args) {
		String s="welcome";
		System.out.println(s);
		String t=new String("to Java");
		System.out.println(t);
		
		
		//Length of a string
		System.out.println(s.length()); //total number of characters return
		
		
		//concat() - joining strings
		s="wecome";
		String s1=" to Java";
		String s2=" automation";
		System.out.println(s+s1);			//wecome to Java
		System.out.println(s.concat(s1));	//wecome to Java
		
		System.out.println(s+s1+s2);					//wecome to Java automation
		System.out.println(s.concat(s1).concat(s2));	//wecome to Java automation
		
		
		//trim() - remove right and left side spaces
		s="    to Java   ";
		System.out.println(s.length());	//Length before trim	
		 s=s.trim();	//Trim method
		System.out.println(s.trim());
		System.out.println(s.trim().length());	//Length after trim	
		
		
		//charAt(); - returns single char based on index we passed
		//Index count starts from 0
		
		s="welcome";
		System.out.println(s.charAt(0));	//w
		System.out.println(s.charAt(3));	//c
		
		//contains(); - returns boolean - true/false
		//returns boolean value
		System.out.println(s.contains("wel"));	//true
		System.out.println(s.contains("ome"));	//true
		System.out.println(s.contains("Wel"));	//false
		
		//equals(), equalsIgnore() - compare 2 strings
		//returns boolean value
		s1="WELCOME";
		s2="welcome";
		
		System.out.println(s1.equals(s2));				//False -because case sensitive
		System.out.println(s1.equalsIgnoreCase(s2));	//true - Ignore the case sensitivity
		
		
		//replace - This will replace single or multiple characters in a string
		s="welcome to selenium automation testing selenium training"; 	
		System.out.println(s.replace('e', 'x'));	//wxlcomx to sxlxnium automation txsting sxlxnium training
		System.out.println(s.replace("selenium", "java")); 	//welcome to java automation testing java training
		
		
		//substring() - to extract substring from the main string
		System.out.println(s.substring(2,5));	//lco - start count start from 0/End count start from 1
		System.out.println(s.substring(0,6));	//welcom- 
		
		
		//split() - divide the string in to multiple parts using delimiter
		//cannot use as a delimiter - $  *  ^  ?  .  +  -
		s="abc@gmail.com";
		String a[]=s.split("@");
		System.out.println(a[0]);	//abc
		System.out.println(a[1]);	//gmail.com
		
		s="abc,mno,xyz";
		String b[]=s.split(",");	
		System.out.println(b[0]);	//abc
		System.out.println(b[1]);	//mno
		System.out.println(b[2]);	//xyz
		
		
		//toUpprCase(), toLowerCase
		s="abc@gmail.com";
		System.out.println(s.toUpperCase()); //ABC@GMAIL.COM
		s="ABC@GMAIL.COM";
		System.out.println(s.toLowerCase()); //abc@gmail.com
			

			
		
		
		

	}

}
