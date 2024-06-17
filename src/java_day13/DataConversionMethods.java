package java_day13;

public class DataConversionMethods {

	public static void main(String[] args) {
		//String------>int
		
		//String s="Welcome"; //not possible to convert to number
		String s1="10";
		String s2="20";
		
		System.out.println(s1+s2);
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		
		
		//String------>double
		String s3="150.15";
		String s4="135.10";
		
		double s3dbl =Double.parseDouble(s3);
		double s4dbl =Double.parseDouble(s4);
		System.out.println(s3dbl+s4dbl);
		
		
		//String------>boolean
		String s5="true";
		
		boolean bool=Boolean.parseBoolean(s5);
		System.out.println(bool);
		
		
		//int, double, char, boolean----->String
		
		int a=500;
		double b=200.22;
		char c= 'A';
		boolean d=false;
		
		String st1=String.valueOf(a);
		String st2=String.valueOf(b);
		String st3=String.valueOf(c);
		String st4=String.valueOf(d);
		
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(st4);
		
		System.out.println(String.valueOf(a));
		
		
	}

}
