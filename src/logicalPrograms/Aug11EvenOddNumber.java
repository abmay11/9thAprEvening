package logicalPrograms;

import java.util.Scanner;

public class Aug11EvenOddNumber {

	public static void main(String[] args) 
	{
//		int a=10;
//		int b=3;
//		
//		System.out.println(a/b);   //divide-->3
//		System.out.println(a%b);   //reminder-->1
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		
		 int s = sc.nextInt();

				
		if(s%2==0)
		{
			System.out.println("Entered number is Even");
			
		}

		else 
		{
			System.out.println("Enterd number is odd");
		}
		
//		if(s%2!=0)
//		{
//			System.out.println("Entered number is odd");
//			
//		}
//
//		else 
//		{
//			System.out.println("Enterd number is Even");
//		}
		
	}

}
