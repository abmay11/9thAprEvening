package Assignments;

public class May9IfUse 
{

	public static void main(String[] args) 
	{
		
		char gender='M';//if we initilise with gender='F' then below condition will not satisfy and won't get o/p
		int marks=39;
		
		
		if(gender=='M') //if given condition satisfies then only we get output
		{

			System.out.println("Amit gender is "+gender);
	    }

		if(marks<40)//we will not get o/p if marks are 40 or above since condition will not satisfy 
		{
			System.out.println("i am fail");
		}
	}
	
}