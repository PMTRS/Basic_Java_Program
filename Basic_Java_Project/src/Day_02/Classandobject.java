package Day_02;

import java.lang.reflect.Method;

public class Classandobject {
	//returntype methodName
	void method()
	{
		int a = 10;
		int b = 50;
		int c = 40;
		
		System.out.println(a+b);
		System.out.println(b-c);
		System.out.println(c*a);
		System.out.println(a&b);
	}
	
	public static void main(String[] args) 
	{
		Classandobject obj = new Classandobject();
		obj.method();
	}

}
