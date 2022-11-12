package exceptionStudy;

public class Aug18StringOutOfBound 
{

	public static void main(String[] args) 
{
	String s ="pune";
	try 
	{
		System.out.println(s.charAt(10)); //risky code

	} 
	catch (Exception e) 
	{
		System.out.println("exception occured");
	}
	
	System.out.println("hi hello");
	
	try    //2nd try loop
	{
		System.out.println(s.charAt(-1));
	} 
	catch (StringIndexOutOfBoundsException e) 
	{
		System.out.println("try index between 0-3");
	}
	
}

}
