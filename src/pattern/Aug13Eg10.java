package pattern;

public class Aug13Eg10 {

	public static void main(String[] args) 
	{
		    //    *
			//   * *
			//  * * *
			// * * * *

		//row=4 , star=1 , space=3(consider only left side)
				int space=3;
				int star=1;
				
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
					star=star+1;  //star++
					space--;
					System.out.println();
				}
				
		

	}

}
