package logicalPrograms;

public class Aug11ArmStrongNumber {

	public static void main(String[] args) 
	{
		//eg.153=1^3+5^3+3^3=1+125+27=153
		
		int num=371;
		int sum=0;
		
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;  //3,7,1
			sum=sum+rem*rem*rem;  //3^3+7^3+1^3=371
			
		}
		
		
		if(num==sum)
		{
			System.out.println("Given number "+num+" is Armstrong");
		}
		
		else
		{
			System.out.println("Given number "+num+" is not armstrong");
		}

	}

}
