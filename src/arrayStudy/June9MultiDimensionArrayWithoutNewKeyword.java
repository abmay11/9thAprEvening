package arrayStudy;

public class June9MultiDimensionArrayWithoutNewKeyword {

	public static void main(String[] args) 
	{
		//ex.1
		
		int digit[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}; //number of curly brackets inside of main curly=number of rows & number of columns=inside each curly bracket variables
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
			{
				System.out.print(digit[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("==============");
		
		//ex.2
		
		char alpha[][]= {{'A','B','C','D'},{'E','F','G','H'},{'I','J','K','L'},{'M','N','O','P'}};
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
			{
				System.out.print(alpha[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("==============");
		

	}

}
