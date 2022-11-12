package exceptionStudy;

public class Aug18StringOutOfBound2 
{

	public static void main(String[] args) 
{
	String s ="pune";
	try 
	{
		System.out.println(s.charAt(10)); //risky code

	} 
	catch (NullPointerException e) //here not null pointer so not use of this block
	{
		System.out.println("you are working on null value");
	}
	catch (StringIndexOutOfBoundsException e)  //this suits above risky code
	{
		System.out.println("please enter correct string");
	}
	
	catch (Exception e) //if written above catch block it will give error coz Exception is general which handles all types of exceptions
	{                   //so no use of StringIndexOutOfBoundsException below exception block.
		                //here above catch block handling exception before coming here
		System.out.println("exception occured");
	}
	
	System.out.println("hi hello");
}

}
