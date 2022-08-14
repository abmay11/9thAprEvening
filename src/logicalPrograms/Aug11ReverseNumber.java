package logicalPrograms;

public class Aug11ReverseNumber {

	public static void main(String[] args) 
	{
        int number=86577;
		
		String s = Integer.toString(number);   //converted int to string 
		
		String r="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
	    int revNumber = Integer.parseInt(r);   //converted string to int 
		
		System.out.println("Original Number is "+r);
		System.out.println("Reverse number is "+revNumber);
		
		

	}

}
