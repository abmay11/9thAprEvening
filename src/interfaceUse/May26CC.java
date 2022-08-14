package interfaceUse;

public class May26CC implements May26Interface
{
	//1.implements...click on CC to implement methods from interface class
	//CC -->implementation class use for interface class
	//May27Interface -->interface class

	public static void main(String[] args) 
	{
		May26CC b=new May26CC(); //created object of implementation class
		
		b.demo(); //calling interface method
		b.demo1(); //calling interface method
		b.test(); //calling own method
		
		 System.out.println( May26Interface.x); //alling global variable from interface..which is static
		 //we can use variable but can't update its value
	   
		

	}

	@Override
	public void demo()
	{
		System.out.println("demo method from interface completed in implementation class");
		
	}

	@Override
	public void demo1() 
	{
		System.out.println("demo1 method from interface completed in implementation class");
		
	}
	
	public void test() //own class method
	{
		System.out.println("this is CC own class method");
	}
	

}
