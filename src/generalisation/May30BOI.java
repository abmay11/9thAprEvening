package generalisation;

public class May30BOI implements May30RBI
{

	@Override
	public void deposit() 
	{
		System.out.println("BOI deposit interest rates 4.9%");
		
	}

	@Override
	public void loan() 
	{
		System.out.println("BOI loan interest rates 7.5%");
		
	}

	@Override
	public void facility() 
	{
		System.out.println("BOI have NEFT,RTGS,IMPS,SMS banking");
		
	}
	
	static void BOIstarApp()
	{
		System.out.println("BOIstarApp for banking");
	}

}
