package logicalPrograms;

public class Aug11WhiteSpacesFromString {

	public static void main(String[] args) 
	{
		//if we use scanner class and entered string it will consider whole string as single one
		String s = "my name is Ajay";  
		int counter=0;
		
		for(int i=0;i<s.length()-1;i++)
		{
			char blank = s.charAt(i);
			if(blank==' ')
			{
				counter++;
			}
		}
		
		System.out.println("Number of blank space in "+s+" is "+counter);
		

	}

}
