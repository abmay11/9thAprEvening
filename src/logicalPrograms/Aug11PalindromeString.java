package logicalPrograms;

import java.util.Scanner;

public class Aug11PalindromeString {

	public static void main(String[] args) 
	{
		//palindrome means if we reverse string also it will remain same...eg mom,dad,
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		
		String s = sc.next();
		String r ="";
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		
		System.out.println("original string is "+s);
		System.out.println("reverse string is "+r);
		
		if(s.equalsIgnoreCase(r))   //it will ignore upper and lower case
		{
			System.out.println("Entered string is Palindrome");
		
		}

		else
		{
			System.out.println("Entered string is not Palindrome");
		}
	}

}
