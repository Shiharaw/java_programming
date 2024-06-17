package java_day3;

public class Ass1 {

	public static void main(String[] args) {
		
		//Case 1
		int a=200,b=200;
		System.out.println("Before swap the numbers a= "+a+" and b= "+b);
		
		a=a+b;		//300
		b=a-b;		//100
		a=a-b;
		
		System.out.println("After swap the numbers a= "+a+" and b= "+b);
		
		
		//Case 2
		if (a>b) {
			
			System.out.println(a);
		}
		else if (a<b) {
			
			System.out.println(b);
		}
		else {
			System.out.println(a+" and "+b);
		}
		
		//Case3 - Print 1 to10
		
		int i=1,odd=0;
		
		do {
			if (i%2==0) {
				odd++;
				
			//System.out.println(i);
			}
			i++;
		}while(i<=10);
		System.out.println("Number of Evevn numbers=" +odd);
		
		//Case4 - Print 1 to10
		
		odd=0;
		int even=0;
		
		for (i=1;i<=15;i++) {
			
			if(i%2!=0) {
				odd++;
			}
			else 
			even++;
		}
		
		System.out.println("Number of Odd numbers=" +odd);
		System.out.println("Number of Evevn numbers=" +even);
		
		//Case 3
		for(int i1=1; i1<=10;i1++) {
			if (i1%2==0) {
				System.out.println("Even Number="+i1);
			}else {
				System.out.println("Odd Number="+i1);
			}
			
		}
		
		//Case 4
		int l=100, m=200, n=300;
		
		if(l>m&&l>n){
			System.out.println("Largest number is l "+l);
		}else if(m>n) {
			System.out.println("Largest number is m "+m);
		}else {
			System.out.println("Largest number is n "+n);
		}
		
		//case 5
		int p=1235 , q=0, r=0, s=0;
		q=p;
		while(q>0) {
			
			r=q%10;
			q=q/10;
			
			
			s=s*10+r;
			
		}
		System.out.println(s);

	}

}
