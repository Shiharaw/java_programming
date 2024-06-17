package java_day7;

public class Assignment5ReverseAString {

	public static void main(String[] args) {
		String s1="abc";
		System.out.println(s1.length());
		
		//Approach1
		String t1,t2,t3,s2;
		t1=s1.substring(0,1);
		t2=s1.substring(1,2);
		t3=s1.substring(2,3);
		
		s2=t3.concat(t2).concat(t1);
		System.out.println("Revers string of the "+s1+" is "+s2);
		
		
		//Approach2
		String s4[]= {s1.substring(0,1),s1.substring(1,2),s1.substring(2,3)};
		String s5=s4[2].concat(s4[1]).concat(s4[0]);
		System.out.println("Revers string of the "+s1+" is "+s5);
		
		
		//Approach3
		s1="abcdefgh";
		
		int i;
		String ri,p4="";
				
		for(i=0;i<s1.length();i++) {
			ri=s1.substring(i,i+1);
			p4=ri.concat(p4);
					
		}
		System.out.println("Revers string of the "+s1+" is "+p4);

	}

}
