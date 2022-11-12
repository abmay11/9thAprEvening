package arrayStudy;

public class June9MultiDimensionalArrayWithNewKeyword {

	public static void main(String[] args) 
	{
		//Ex.1
		//1.array declaration
		int a[][]=new int[2][2]; //2*2 size matrix..1st row or column start with 0..coz of array
		
		//2.assign value
		a[0][0]=1; //row=0 & column=0
		a[0][1]=2; //row=0 & column=1
		a[1][0]=3; //row=1 & column=0
		a[1][1]=4; //row=1 & column=1
		
		//3.use
		System.out.print(a[0][0]+" ");
		System.out.println(a[0][1]);
		System.out.print(a[1][0]+" ");
		System.out.println(a[1][1]);
		System.out.println("=================");
		
	//for loop for above
		
		for(int i=0;i<=1;i++) //outer loop for Row..i=0,1
		{
			for(int j=0;j<=1;j++) //inner loop for Column..j=0,1
			{
				System.out.print(a[i][j]+" ");  //removed ln and declared space
			}
			System.out.println(); 
		}
		System.out.println("==============");
		
		//Ex.2
		
		char p[][]=new char[3][3]; //3*3 matrix
		
		p[0][0]='A'; //row=0 & column=0
		p[0][1]='B'; //row=0 & column=1
		p[0][2]='C'; //row=0 & column=2
		p[1][0]='D'; //row=1 & column=0
		p[1][1]='E'; //row=1 & column=1
		p[1][2]='F'; //row=1 & column=2
		p[2][0]='G'; //row=2 & column=0
		p[2][1]='H'; //row=2 & column=1
		p[2][2]='I'; //row=2 & column=2
		
		for (int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(p[i][j]+" ");
			}
			System.out.println();
		}

	}

}
