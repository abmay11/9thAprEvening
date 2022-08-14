package logicalPrograms;

import java.util.Scanner;

public class Aug11PrimeNumber {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int counter=0;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				counter++;
				break;
			}
			
		}
		
		  if(counter==1)
		  {
			  System.out.println("Entered number is not prime");
		  }
		  
		  else
		  {
			  System.out.println("Entered number is prime");
		  }

	}

}
