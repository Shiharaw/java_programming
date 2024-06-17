package java_day13;

public class WrapperDemo {

	public static void main(String[] args) {
		
		
		int x=100;		//x is a primitive variable. a. do not show any methods related to it
		System.out.println(x);
		//x.
		
		Integer y =200;	//y is a object type variable. Then b. gives lot of methods related to it
		System.out.println(y);
		//y.
		
		//primitive type variable
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		float f=50.5F;
		double d=60.5D;
		char c='a';
		boolean b2=true;
		
		//Converting primitives in to objects : Autoboxing
		
		Byte byteobj = b;
		Short shortobj = s;
		Integer intobj = i;
		Long longobj = l;
		Float floatobj = f;
		Double doubleobj = d;
		Character charobj = c;
		Boolean booleanobj = b2;
		
		System.out.println("Byte object: "+byteobj);
		System.out.println("Short object: "+shortobj);
		System.out.println("Integer object: "+intobj);
		System.out.println("Long object: "+longobj);
		System.out.println("Float object: "+floatobj);
		System.out.println("Double object: "+doubleobj);
		System.out.println("Charactoer object: "+charobj);
		System.out.println("Boolean object: "+booleanobj);
		
		//Converting objects to primitives : Unboxing
		
		byte bytevalue=byteobj;
		short shortvalue=shortobj;
		int intvalue=intobj;
		long longvalue=longobj;
		float floatvalue=floatobj;
		double doublevalue=doubleobj;
		char charvalue=charobj;
		boolean booleanvalue=booleanobj;
		
		System.out.println("byte value: "+bytevalue);
		System.out.println("short value: "+shortvalue);
		System.out.println("int value: "+intvalue);
		System.out.println("long value: "+longvalue);
		System.out.println("float value: "+floatvalue);
		System.out.println("double value: "+doublevalue);
		System.out.println("char value: "+charvalue);
		System.out.println("boolean value: "+booleanvalue);
		
		

	}

}
