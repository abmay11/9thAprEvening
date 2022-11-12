package exceptionStudy;

public class Aug19UseOfFinally 
{

	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		
		try 
		{
			int div=a/b;
			System.out.println("div");
		} 
		finally //even if exception occurs it will execute for sure
		{
			System.out.println("finally print this");
		}
		
		System.out.println("good night");


	}

}
