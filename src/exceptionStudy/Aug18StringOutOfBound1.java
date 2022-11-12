package exceptionStudy;

public class Aug18StringOutOfBound1 
{

	public static void main(String[] args) 
{
	String s ="pune";
	try 
	{
		System.out.println(s.charAt(10)); //risky code

	} 
	catch (StringIndexOutOfBoundsException e) 
	{
		System.out.println("please enter correct index between 0-3");
	}
	System.out.println("hi hello");
	
	}

}
