package Loop;

public class AssignmentLoop {

	public static void main(String[] args) {
		//i want table of 3 stright and reverse using for,while,do while loop
		
		//Ex.1 For Loop
		for(int a=3;a<=30;a=a+3) //table 3 forward..increment
		{
			System.out.println(a);
		}
		System.out.println("============");
		
		for(int a=30;a>=3;a=a-3) //table 3 reverse..decrement
		{
			System.out.print(a+" ");
		}
		System.out.println(""); //to come on next line..
		System.out.println("============");
		
		
		

		//Ex.2 While Loop
		int a=3;
		
		while(a<=30) //table 3 forward..increment
		{
			System.out.println(a);
			a=a+3;
		
		}
		System.out.println("==========");
		
		int b=30; //a will be duplicate variable so using b..in for loop we can use same variable
		
		while(b>=3)  //table 3 reverse..decrement
		{
			System.out.println(b);
			b=b-3;
		}
		System.out.println("=============");
		
		
		
		
		//Ex.3 Do-While Loop
	
		int i=3;
		
		do 
		{
			System.out.print(i+" "); //table 3 forward..increment
			i=i+3;
			
		}while(i<=30);
		
		System.out.println("");
		System.out.println("================");
		
		int j=30;
		
		do 
		{
			System.out.print(j+" "); //table 3 reverse..decrement
			j=j-3;
		}while(j>=3);
		
		
	}

}
