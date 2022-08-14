package logicalPrograms;

import java.util.Scanner;

public class Aug10ReverseString 

{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
	    
		//String s="Velocity";   //normal way
		
		String r="";
		
		for(int i=s.length()-1;i>=0;i--)  //7,6,5...0
		{
			r=r+s.charAt(i);
			
			//y=""+y
			//yt=t+y
			//yti=yt+i
		}
		
		System.out.println("Reverse string is "+r);    //yticoleV
		
		
		

	}

}
