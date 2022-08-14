package logicalPrograms;

public class Aug12ChangeOrderOfAString {

	public static void main(String[] args) 
	{
		
		String r = Aug12ChangeOrderOfAString.revString("Velocity");
 
		System.out.println(r);
	}
	
	public static String revString(String input)
	{
		String rev ="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			rev=rev+input.charAt(i);
		}
		return rev;
		
	}

}
