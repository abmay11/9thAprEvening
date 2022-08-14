package pattern;

public class Aug12Eg2 {

	public static void main(String[] args) 
	{
		//******
		//******
		//******
		//******
		//******
		
		//row=5 , column=6  --> consider always first row for star(column)
		
		for(int i=1;i<=5;i++)  //outer loop always for row
		{
			for(int j=1;j<=6;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
