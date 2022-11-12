package abstractClass;

public abstract class May19AB 
{ //abstract class contains complete+incomplete method

	public static void main(String[] args) 
	{
		//AB a=new AB(); object creation not allowed in abstract class..
		//it will make confusion while calling methods complete or incomplete
		alpha();

	}
	
	public void test() //complete method
	{
		System.out.println("This is Test method");
	}
	
	public void test1() //complete method
	{
		//no definition still complete method
	}
	
	public abstract void test3(); //incomplete method //abstract used in syntax
	
	public abstract void test4(); //incomplete method //abstract used in syntax
	
	public abstract void test5(); //incomplete method //abstract used in syntax
	
	public static void alpha() //complete static method
	{
		System.out.println("Static mehod from abstract");
	}
	
	
}
