package logicalPrograms;

import java.util.Scanner;

public class Aug10userInput {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// string int float char
		
		System.out.println("Please enter the number");
		int number = sc.nextInt();
		
		System.out.println("Your entered number is "+number);
		
       
		
		System.out.println("Enter the name"); //compulsory write it before object creation
		
		String name = sc.next();
		
		System.out.println("Entered name is "+name);
		

	}

}
