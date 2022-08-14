package Loop;

public class May12WhileLoop {

	public static void main(String[] args) 
	{
		//ex. 4 table
		int a=4;//initialization 
		
		while(a<=40) //condition 
		{
			System.out.println(a);
			a=a+4; //updation...if we forget updation loop will run continuously with same value i.e.infinity
		}
		
		System.out.println("==================");
		
		//reverse of above table
		int b=40;//initialization
		
		while(b>=4) //condition
		{
			System.out.print(b+" ");//if we remove ln in println we will get horizontal o/p
			b=b-4; //updation
			
		}
		System.out.println("==============================");
	
		
	}

}
