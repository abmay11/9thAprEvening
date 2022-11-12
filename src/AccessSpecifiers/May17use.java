package AccessSpecifiers;

public class May17use 
{
	int a=10;
	private int b=20;
	public int c=30;
	protected static int d=40;

	public static void main(String[] args) 
	{
		May17use u=new May17use();
		u.test();//in shortcut notation is green circle//public
		u.test1();//in shortcut notation is red square// private
		u.test3();//in shortcut notation is blue triangle// default
		test4();//in shortcut notation is yellow diamond// protected
		
		System.out.println("===================");
		
		System.out.println("value of a is "+u.a);  
		System.out.println("value of b is "+u.b);
		System.out.println("value of c is "+u.c);
		System.out.println("value of d is "+d);

		
		

	}

	public void test() //can be accessed within project
	{
		System.out.println("public test method");
		int k,b=20,c=10;  //local b,c
		k=b-c;
		System.out.println("value of k is "+k);

	}
	
	private void test1() //can be accessed within class only
	{
		System.out.println("private test1 method");
		int k=b+c;  //global values
		System.out.println("value of k is "+k);

	}
	
	void test3() //can be accessed within package
	{
		System.out.println("default test2 method");
		
		int k=b*c;  //global variables
		System.out.println("value of k is "+k);

	}
	
	protected static void test4() //can be accessed within package and outside of package by inheritance
	{
		System.out.println("protected test4 method");
	}
	
	
}
