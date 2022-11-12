package exceptionStudy;

public class Aug19UseOfFinally3 
{

	public static void main(String[] args) 
	{
		String s= null;
		
		
		try 
		{
			System.out.println(s.charAt(6));
		} 
		catch (NullPointerException e) 
		{
			System.out.println("string is null");
		}
		
		finally //even if exception occurs it will execute for sure
		{
			System.out.println("good night");
		}
		System.out.println("hello");
		

	}

}
