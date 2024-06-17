package java_day3;

public class TernaryOperator {

	public static void main(String[] args) {
		
		//variable=expression ? result1 : result2
		
		int a=200, b=100;
		//Eg 1
		//a>b is true and the result is a and a assign to x
		int x=a>b ? a : b;			
		System.out.println("x= "+x); 		//x=200
		
		
		//Eg 2
		//a<b is false and the result is b and b assign to x
		int y=a<b ? a: b;			
		System.out.println("y= "+y);		//y=100
		
		
		//Eg 3
		//x=1=1 ? 100:200; 	//Wrong expression. need == for equal
		x=(1==1) ? 100:200;
		System.out.println("x= "+x); 
		
		//Eg 4
		
		int age =18;
		String res=(age>=18) ? "Eligible for vote" : "Not eligible for vote ";
		System.out.println(res);

		age =15;
		res=(age>=18) ? "Eligible for vote" : "Not eligible for vote ";
		System.out.println(res);
		
		age =20;
		res=(age>=18) ? "Eligible for vote" : "Not eligible for vote ";
		System.out.println(res);
	}

}
