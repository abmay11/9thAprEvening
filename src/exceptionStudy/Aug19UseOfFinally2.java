package exceptionStudy;

public class Aug19UseOfFinally2 
{

	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		
		try 
		{
			int div=a/b;
			System.out.println(div);
		} 
//		catch (ArithmeticException e) 
//		{
//			System.out.println("number can not be divisible by 0");
//		}
		
		finally //even if exception occurs it will execute for sure
		{
			int div1=a/b;  //above exception handled by finally and exception coming in its own shown in console
			System.out.println("finally print this");
		}
		System.out.println("good night");
		

	}

}
