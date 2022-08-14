package generalisation;

public class May30SBI implements May30RBI
{

	@Override
	public void deposit()
	{
		System.out.println("sbi deposit interest rates 4.2%");
		
	}

	@Override
	public void loan() 
	{
		
		System.out.println("sbi loan interest rates 7.9%");
	}


	@Override
	public void facility() 
	{
		System.out.println("sbi have NEFT,RTGS,IMPS");
		
	}
	
	public void YONO() //own method
	{
		System.out.println("yono sbi's own feature");
	}
	

	
	
	
	
}
