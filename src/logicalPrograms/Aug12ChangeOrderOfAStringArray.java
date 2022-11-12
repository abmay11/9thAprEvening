package logicalPrograms;

public class Aug12ChangeOrderOfAStringArray 
{

	public static void main(String[] args) 
	{
		String name="I LOVE MY INDIA";
		
		String ar[] = name.split(" ");
	       //ar={"I","LOVE","MY","INDIA"}  //0,1,2,3
	
		
		for(int i=0;i<=ar.length-1;i++)
		{
			if(i%2!=0)   //if string index is not even(odd) then reverse it...try for-->if(i%2==0)
			{
				String s=ar[i];
				ar[i]=revString(s);
				
			}
		
			System.out.println(ar[i]);
			
		}
		
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
