package exceptionStudy;

public class Aug18NullPointer 
{

	public static void main(String[] args) 
   {
		String s = null;
		
		try 
		{
			System.out.println(s.charAt(10)); //risky code
		} 
		catch (NullPointerException e) 
		{
			System.out.println("you are working on null value");
		}	
		
		System.out.println("hi hello");
		

	}

}
