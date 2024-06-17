package java_day7;

public class Assignment5PaildromeString {

	public static void main(String[] args) {
		
		String s1="madam";
		int i;
		String s2="",ri;
				
		for(i=0;i<s1.length();i++){
			
			ri=s1.substring(i,i+1);
			s2=ri.concat(s2);
			
		}
		System.out.println("Revers string of the "+s1+" is "+s2);
		if(s1.equals(s2)) {
			System.out.println(s1+" is a Paildrome String");
		}
		else {
			System.out.println(s1+" is not a Paildrome String");
		}
		

	}

}
