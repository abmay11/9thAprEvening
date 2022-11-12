package exceptionStudy;

public class Aug19UseOfFinally1 
{

	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		//try,catch and finally all together
		try 
		{
			int div=a/b;
			System.out.println("div");
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("number can not be divisible by 0");
		}
		
		finally //even if exception occurs it will execute for sure
		{
			System.out.println("finally print this");
		}
		System.out.println("good night");
		

	}

}
