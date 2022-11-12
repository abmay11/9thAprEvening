package logicalPrograms;

import java.util.Scanner;

public class Aug10userInput {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//  int string boolean float 
		//only char method is not available
		
		System.out.println("Please enter the number");
		int number = sc.nextInt();
		System.out.println("Your entered number is "+number);
		
       
		System.out.println("Enter the name"); //compulsory write it before object creation
		String name = sc.next();
		System.out.println("Entered name is "+name);
		
		
		System.out.println("Enter boolean value");
		boolean bool = sc.nextBoolean();
		System.out.println("Entered boolean value is "+bool);
		
		System.out.println("Enter float value");
		float flt = sc.nextFloat();
		System.out.println("Entered float value is "+flt);
		
		System.out.println("Enter double value");
		double dbl = sc.nextDouble();
		System.out.println("entered double value is "+dbl);
		

	}

}
