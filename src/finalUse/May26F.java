package finalUse;

public final class May26F 

{
	public static void main(String[]args)
	{

	    int a=20; //normal practice
	    System.out.println("a value"+a);
	    a=a+50;
	    System.out.println("a value"+a);
	    
	    final int b=10;
	    System.out.println("b value"+b);
	   //b=b+45; we cant use variable again if make it final 
	    //final variable wont allow us updating its value
	    
	    }
	
	public void test()
	{
		System.out.println("this is normal method");
	}
	
	public final void demo() //final method
	{
		
	}
	
	
	
	
}
