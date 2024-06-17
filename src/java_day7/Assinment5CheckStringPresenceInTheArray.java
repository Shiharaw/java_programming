package java_day7;

public class Assinment5CheckStringPresenceInTheArray {

	public static void main(String[] args) {
		
		String ch1="Shihara";
		
		int i;
		Boolean prec=false;
		String s1;
		String a1[]= {"protect","because","Adverb","Shihara","Jacob","Quality Assuarance"};
		
		//check 'i' less than to length of the array and prec is true
		for(i=0;i<a1.length&& prec==false;i++) {
			
			prec=ch1.equals(a1[i]); //if the string present prec is updated as true
						
		}
		s1=(prec==true) ? " is presence in the array." : " is not presence in the array.";
		System.out.println(ch1+s1); 
		

	}

}
