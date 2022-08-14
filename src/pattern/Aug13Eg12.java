package pattern;

public class Aug13Eg12 {

	public static void main(String[] args) 
	{   
		//*****
		//****
		//***
		//**
		//*
		//**
		//***
		//****
		//*****       
		
		//row=9 , star=5
		
		
				int star=5;    //last program change here
				
				for(int i=1;i<=9;i++)
				{
					for(int j=1;j<=star;j++)
					{
						System.out.print("*");
					}
					if(i<5)
					{
						star--;	
					}
					else
					{
						star++;
					}                    
					System.out.println();
				}
		

	}

}
