package java_day7;

public class AssignmentSwapStrings {

	public static void main(String[] args) {
		
		String s1="Shihara";
		String s2="Senorin Wickramasinghe";
		int l1=s1.length();
		int l2=s2.length();
		
		s1=s1.concat(s2);
		s2=s1.substring(0,l1);
		s1=s1.substring(l1,l1+l2);
		System.out.println("s1="+s1+" and s2="+s2);
		
		
		

	}

}
