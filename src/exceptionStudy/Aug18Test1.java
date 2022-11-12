package exceptionStudy;

public class Aug18Test1 
{

	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		
		try 
		{
			int div=a/b; //risky code
			System.out.println(div);
		} 
		catch (ArithmeticException e) //this will get execute 
		{
		    System.out.println("B value should not be 0");	
		}
		catch (Exception e) 
		{
		    System.out.println("Exception occured");	
		}
		System.out.println("hi");  //this printing stmnt can't comes between try and catch block
		
		  

	}

}
