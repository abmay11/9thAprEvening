package pattern;

public class Aug12Eg4 {

	public static void main(String[] args) 
	{
		//*****
		//****
		//***
		//**
		//*
		
		//row=5 , star=5
		
		int star=5;    //last program change here
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			star--;                     //last program change here
			System.out.println();
		}
		

	}

}
