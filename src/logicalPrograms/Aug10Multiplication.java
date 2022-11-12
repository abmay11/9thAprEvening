package logicalPrograms;

import java.util.Scanner;

public class Aug10Multiplication {

	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st number");
		int number1 = sc.nextInt();
		
        System.out.println("Enter the 2nd number");
		int number2 = sc.nextInt();
		
		int mul = number1*number2;
		System.out.println("Multiplication is "+mul);
		
		

	}

}
