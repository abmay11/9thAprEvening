package ControlStatement;

public class NestedIf1 {
	
	public static void main(String[]args) 
	{
		boolean card=true; //change values and get different o/p
		int pin=5889;
		
		if(card==false)
		{
			System.out.println("Please enter pin");
			
			if(pin==5887) 
			{
			System.out.println("pin correct,transaction successful");	
			}
			else
			{
			System.out.println("pin incorrect,enter valid pin");	
			}
		}
		else {
			System.out.println("Please insert card properly");
		}
		
		
		
		
	}

}
