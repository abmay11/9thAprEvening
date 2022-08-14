package generalisation;

public class May30AXIS implements May30RBI 
{ 
	//above line will show error until u implementing unimplemented method from interface

	@Override
	public void deposit() 
	{
		System.out.println("axis deposit interest rates 3.9%");
		
	}

	@Override
	public void loan() 
	{
		System.out.println("axis loan interest rates 8.5%");
		
	}

	@Override
	public void facility() 
	{
		System.out.println("axis have NEFT,RTGS,IMPS,Service");
		
	}
	
	public static void AxisApp() //own method
	{
		System.out.println("AxisApp own app for ease of service");
	}

}
