package logicalPrograms;

import java.util.Scanner;

public class Aug10Addition {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st number");
		
		int number1 = sc.nextInt();
		
        System.out.println("Enter the 2nd number");
		
		int number2 = sc.nextInt();
		
		int sum = number1+number2;
		
		System.out.println("Addition is "+sum);
		

	}

}
