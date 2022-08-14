package Loop;

public class May12DoWhile {

	public static void main(String[] args) {
		//in do while loop it will at least execute once..whatever maybe the condition
		//Ex. i want 6 table
		int i=6; //initialization
		
		do 
		{
			System.out.print(i+" "); //removed ln for horizontal o/p
			i=i+6; //updation...increment
		}while(i<=60); //condition
		
		System.out.println("");//we given space otherwise below loop start with vicinity to above loop..this is actually in line of above loop
		System.out.println("============================");
		int p=60;
		
		do 
		{
			System.out.println(p);
			p=p-6;
		}while(p>=6);
		
	}

}
