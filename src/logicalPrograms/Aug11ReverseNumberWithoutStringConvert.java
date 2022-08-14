package logicalPrograms;

public class Aug11ReverseNumberWithoutStringConvert 
{

	public static void main(String[] args) 
	{
        int num = 123;
		int revNum=0;
		
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;  //3,2,1
			revNum=revNum*10+rem; //3,32,321
		}
		
		System.out.println("Rev num is "+revNum);

		

	}

}
