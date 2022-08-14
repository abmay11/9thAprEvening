package logicalPrograms;

import java.util.Scanner;

public class Aug11FactorialOfaNumber {

	public static void main(String[] args) 
	{
		//4!=4*3*2*1=24
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		int fact = 1;
		
		for(int i=number;i>=1;i--)
		{
			fact=fact*i;
		}
		
		System.out.println("factorial of "+number+" is "+fact);
		

	}

}
