package AccessSpecifiers;

public class May17use {

	public static void main(String[] args) 
	{
		May17use u=new May17use();
		u.test();//in shortcut notation is green circle//public
		u.test1();//in shortcut notation is red square// private
		u.test3();//in shortcut notation is blue triangle// default
		u.test4();//in shortcut notation is yellow diamond// protected

	}

	public void test() //can be accessed within project
	{
		System.out.println("public test method");
	}
	
	private void test1() //can be accessed within class only
	{
		System.out.println("private test1 method");
	}
	
	void test3() //can be accessed within package
	{
		System.out.println("default test2 method");
	}
	
	protected void test4() //can be accessed within package and outside of package by inheritance
	{
		System.out.println("protected test4 method");
	}
	
	
}
