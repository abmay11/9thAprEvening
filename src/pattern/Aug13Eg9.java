package pattern;

public class Aug13Eg9 {

	public static void main(String[] args) 
	{
//		    1
//		   123
//		  12345
//		 1234567

	
		int space=4;
		int star=1;
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print(j);   //change only in j from eg8
			}
			star=star+2;
			space--;
			System.out.println();
		}

	}

}
