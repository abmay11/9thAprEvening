package pattern;

public class Aug13Eg11 {

	public static void main(String[] args) 
	{
//		* * * * 
//		 * * * 
//		  * * 
//		   * 
		//row=4 , star=4 , space=0
		int space=0;
		int star=4;
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			star=star-1;
			space++;
			System.out.println();
		}
		

	}

}
